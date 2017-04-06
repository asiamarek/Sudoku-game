package sample;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;


import java.beans.*;
import java.io.Serializable;

import static java.lang.Character.isDigit;



public class Field implements Serializable{

    private int row;
    private int column;
    private int colorId;
    private int value;
    private boolean isFixed;
    private TextField txtField;
    private Field[] allFields;
    private String orStyle;
    private int collisions;


    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);


    public Field(int value, int colorId, int column, int row, TextField txtField, Field[] allFields){
        this.row=row;
        this.column=column;
        this.colorId=colorId;
        this.allFields=allFields;
        this.txtField=txtField;
        this.value=value;
        if(value!=-1) {
            this.isFixed = true;
        }else {
            this.isFixed=false;
        }

        this.orStyle=txtField.getStyle();

        collisions=0;


        valueChangeController cc= new valueChangeController(this);
        addVetoableChangeListener(cc);

        collisionsChangeController cc2= new collisionsChangeController(allFields.length-1);
        addVetoableChangeListener(cc2);


        this.txtField.textProperty().addListener(new textChanged());


    }

    private class textChanged implements ChangeListener<String>{

        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

            int temp, temp2;
            temp2=value;
            if(newValue.length()!=1  || !(isDigit(newValue.charAt(0)))){
                temp=0;
            }else{
                temp=Integer.parseInt(newValue);
            }

            try {
                setValue(temp);
                checkCollisions();
            } catch (PropertyVetoException e) {
                try {
                    setValue(-1);
                } catch (PropertyVetoException e1) {}//never comes here

                Platform.runLater(() -> {
                    txtField.clear();
                });
                fixCollisions(temp2);
            }

        }
    }


    public synchronized void addVetoableChangeListener (VetoableChangeListener lst)
    { vcs.addVetoableChangeListener(lst); }


    public synchronized void setValue(int newValue )throws PropertyVetoException {
        int oldValue=value;
        vcs.fireVetoableChange("value",oldValue,newValue);
        value=newValue;
        pcs.firePropertyChange("value",oldValue,newValue);
    }

    public synchronized void setCollisions(int newValue )throws PropertyVetoException {
        int oldValue=collisions;
        vcs.fireVetoableChange("collisions",oldValue,newValue);
        collisions=newValue;
        pcs.firePropertyChange("collisions",oldValue,newValue);
    }



    static class valueChangeController implements VetoableChangeListener{

        private Field f;
        public valueChangeController(Field f){
            this.f=f;
        }

        @Override
        public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
            if(!evt.getPropertyName().equals("value")) return;
            int val= (int) evt.getNewValue();
            if(val==-1)//no value
                return;
            if(val<1 || val>9){
                throw new PropertyVetoException("wrongVal", evt);
            }
            int myId=f.row*9+f.column;
            for(int i=0; i<f.allFields.length; i++){
                if(i==myId)
                    continue;
                if(f.allFields[i].getValue()!=val)
                    continue;
                if(f.allFields[i].getRow()==f.row || f.allFields[i].getColumn()==f.column
                        || f.allFields[i].getColorId()==f.colorId){
                    if(f.allFields[i].getIsFixed())
                        throw new PropertyVetoException("wrongVal", evt);
                }
            }

        }
    }


    public synchronized int getRow(){
        return row;
    }

    public synchronized int getColumn(){
        return column;
    }

    public synchronized int getColorId(){
        return colorId;
    }

    public synchronized int getValue(){
        return value;
    }


    public synchronized boolean getIsFixed(){
        return isFixed;
    }


    public synchronized int getCollisions(){
        return collisions;
    }

    public void changeFontToYellow(){
        String a=new StringBuilder().append(orStyle).append("; -fx-text-inner-color: yellow;").toString();
        txtField.setStyle(a);
    }

    private void changeFontToOriginal(){
        txtField.setStyle(orStyle);
    }

    private boolean didYouWin(){
        for(int i=0; i<allFields.length; i++){
            if(allFields[i].getValue()==-1)
                return false;
            if(allFields[i].getCollisions()>0)
                return false;
        }
        return true;
    }

    private void checkCollisions(){
        int myId=row*9+column;
        int howMany=0;
        for(int i=0; i<allFields.length; i++){
            if(i==myId)
                continue;
            if(allFields[i].getValue()!=value)
                continue;
            if(allFields[i].getRow()==row || allFields[i].getColumn()==column
                    || allFields[i].getColorId()==colorId){
                if(!allFields[i].getIsFixed()){
                    howMany++;
                    try {
                        allFields[i].setCollisions(allFields[i].getCollisions()+1);
                    } catch (PropertyVetoException e) {}
                }
            }
        }
        try {
            setCollisions(howMany);
        } catch (PropertyVetoException e) {

        }


    }

    private void fixCollisions(int oldValue){
        try {
            setCollisions(0);
        } catch (PropertyVetoException e) {}

        if(oldValue==-1)
            return;

        int myId=row*9+column;
        for(int i=0; i<allFields.length; i++){
            if(i==myId)
                continue;
            if(allFields[i].getValue()!=oldValue)
                continue;
            if(allFields[i].getRow()==row || allFields[i].getColumn()==column
                    || allFields[i].getColorId()==colorId){
                if(!allFields[i].getIsFixed()){
                    try {
                        allFields[i].setCollisions(allFields[i].getCollisions()-1);
                    } catch (PropertyVetoException e) {}
                }
            }
        }
    }


    private class collisionsChangeController implements VetoableChangeListener {
        int limit;
        public collisionsChangeController(int limit) {
            this.limit=limit;
        }

        @Override
        public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
            if(!evt.getPropertyName().equals("collisions")) return;
            if((int)evt.getNewValue()>limit)
                throw new PropertyVetoException("tooMuch", evt);
            if((int)evt.getNewValue()==0)
                changeFontToOriginal();
            else
                changeFontToYellow();
        }
    }
}

