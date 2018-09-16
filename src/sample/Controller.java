package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import static java.lang.Character.isDigit;

public class Controller {
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField f100;

    @FXML
    private TextField f101;

    @FXML
    private TextField f102;

    @FXML
    private TextField f103;

    @FXML
    private TextField f104;

    @FXML
    private TextField f105;

    @FXML
    private TextField f106;

    @FXML
    private TextField f107;

    @FXML
    private TextField f108;

    @FXML
    private TextField f110;

    @FXML
    private TextField f111;

    @FXML
    private TextField f112;

    @FXML
    private TextField f113;

    @FXML
    private TextField f114;

    @FXML
    private TextField f115;

    @FXML
    private TextField f116;

    @FXML
    private TextField f117;

    @FXML
    private TextField f118;

    @FXML
    private TextField f120;

    @FXML
    private TextField f121;

    @FXML
    private TextField f122;

    @FXML
    private TextField f123;

    @FXML
    private TextField f124;

    @FXML
    private TextField f125;

    @FXML
    private TextField f126;

    @FXML
    private TextField f127;

    @FXML
    private TextField f128;

    @FXML
    private TextField f130;

    @FXML
    private TextField f131;

    @FXML
    private TextField f132;

    @FXML
    private TextField f133;

    @FXML
    private TextField f134;

    @FXML
    private TextField f135;

    @FXML
    private TextField f136;

    @FXML
    private TextField f137;

    @FXML
    private TextField f138;

    @FXML
    private TextField f140;

    @FXML
    private TextField f141;

    @FXML
    private TextField f142;

    @FXML
    private TextField f143;

    @FXML
    private TextField f144;

    @FXML
    private TextField f145;

    @FXML
    private TextField f146;

    @FXML
    private TextField f147;

    @FXML
    private TextField f148;

    @FXML
    private TextField f150;

    @FXML
    private TextField f151;

    @FXML
    private TextField f152;

    @FXML
    private TextField f153;

    @FXML
    private TextField f154;

    @FXML
    private TextField f155;

    @FXML
    private TextField f156;

    @FXML
    private TextField f157;

    @FXML
    private TextField f158;

    @FXML
    private TextField f160;

    @FXML
    private TextField f161;

    @FXML
    private TextField f162;

    @FXML
    private TextField f163;

    @FXML
    private TextField f164;

    @FXML
    private TextField f165;

    @FXML
    private TextField f166;

    @FXML
    private TextField f167;

    @FXML
    private TextField f168;

    @FXML
    private TextField f170;

    @FXML
    private TextField f171;

    @FXML
    private TextField f172;

    @FXML
    private TextField f173;

    @FXML
    private TextField f174;

    @FXML
    private TextField f175;

    @FXML
    private TextField f176;

    @FXML
    private TextField f177;

    @FXML
    private TextField f178;

    @FXML
    private TextField f180;

    @FXML
    private TextField f181;

    @FXML
    private TextField f182;

    @FXML
    private TextField f183;

    @FXML
    private TextField f184;

    @FXML
    private TextField f185;

    @FXML
    private TextField f186;

    @FXML
    private TextField f187;

    @FXML
    private TextField f188;

    @FXML
    private TextField f200;

    @FXML
    private TextField f201;

    @FXML
    private TextField f202;

    @FXML
    private TextField f203;

    @FXML
    private TextField f204;

    @FXML
    private TextField f205;

    @FXML
    private TextField f206;

    @FXML
    private TextField f207;

    @FXML
    private TextField f208;

    @FXML
    private TextField f210;

    @FXML
    private TextField f211;

    @FXML
    private TextField f212;

    @FXML
    private TextField f213;

    @FXML
    private TextField f214;

    @FXML
    private TextField f215;

    @FXML
    private TextField f216;

    @FXML
    private TextField f217;

    @FXML
    private TextField f218;

    @FXML
    private TextField f220;

    @FXML
    private TextField f221;

    @FXML
    private TextField f222;

    @FXML
    private TextField f223;

    @FXML
    private TextField f224;

    @FXML
    private TextField f225;

    @FXML
    private TextField f226;

    @FXML
    private TextField f227;

    @FXML
    private TextField f228;

    @FXML
    private TextField f230;

    @FXML
    private TextField f231;

    @FXML
    private TextField f232;

    @FXML
    private TextField f233;

    @FXML
    private TextField f234;

    @FXML
    private TextField f235;

    @FXML
    private TextField f236;

    @FXML
    private TextField f237;

    @FXML
    private TextField f238;

    @FXML
    private TextField f240;

    @FXML
    private TextField f241;

    @FXML
    private TextField f242;

    @FXML
    private TextField f243;

    @FXML
    private TextField f244;

    @FXML
    private TextField f245;

    @FXML
    private TextField f246;

    @FXML
    private TextField f247;

    @FXML
    private TextField f248;

    @FXML
    private TextField f250;

    @FXML
    private TextField f251;

    @FXML
    private TextField f252;

    @FXML
    private TextField f253;

    @FXML
    private TextField f254;

    @FXML
    private TextField f255;

    @FXML
    private TextField f256;

    @FXML
    private TextField f257;

    @FXML
    private TextField f258;

    @FXML
    private TextField f260;

    @FXML
    private TextField f261;

    @FXML
    private TextField f262;

    @FXML
    private TextField f263;

    @FXML
    private TextField f264;

    @FXML
    private TextField f265;

    @FXML
    private TextField f266;

    @FXML
    private TextField f267;

    @FXML
    private TextField f268;

    @FXML
    private TextField f270;

    @FXML
    private TextField f271;

    @FXML
    private TextField f272;

    @FXML
    private TextField f273;

    @FXML
    private TextField f274;

    @FXML
    private TextField f275;

    @FXML
    private TextField f276;

    @FXML
    private TextField f277;

    @FXML
    private TextField f278;

    @FXML
    private TextField f280;

    @FXML
    private TextField f281;

    @FXML
    private TextField f282;

    @FXML
    private TextField f283;

    @FXML
    private TextField f284;

    @FXML
    private TextField f285;

    @FXML
    private TextField f286;

    @FXML
    private TextField f287;

    @FXML
    private TextField f288;

    @FXML
    private TextField f300;

    @FXML
    private TextField f301;

    @FXML
    private TextField f302;

    @FXML
    private TextField f303;

    @FXML
    private TextField f304;

    @FXML
    private TextField f305;

    @FXML
    private TextField f306;

    @FXML
    private TextField f307;

    @FXML
    private TextField f308;

    @FXML
    private TextField f310;

    @FXML
    private TextField f311;

    @FXML
    private TextField f312;

    @FXML
    private TextField f313;

    @FXML
    private TextField f314;

    @FXML
    private TextField f315;

    @FXML
    private TextField f316;

    @FXML
    private TextField f317;

    @FXML
    private TextField f318;

    @FXML
    private TextField f320;

    @FXML
    private TextField f321;

    @FXML
    private TextField f322;

    @FXML
    private TextField f323;

    @FXML
    private TextField f324;

    @FXML
    private TextField f325;

    @FXML
    private TextField f326;

    @FXML
    private TextField f327;

    @FXML
    private TextField f328;

    @FXML
    private TextField f330;

    @FXML
    private TextField f331;

    @FXML
    private TextField f332;

    @FXML
    private TextField f333;

    @FXML
    private TextField f334;

    @FXML
    private TextField f335;

    @FXML
    private TextField f336;

    @FXML
    private TextField f337;

    @FXML
    private TextField f338;

    @FXML
    private TextField f340;

    @FXML
    private TextField f341;

    @FXML
    private TextField f342;

    @FXML
    private TextField f343;

    @FXML
    private TextField f344;

    @FXML
    private TextField f345;

    @FXML
    private TextField f346;

    @FXML
    private TextField f347;

    @FXML
    private TextField f348;

    @FXML
    private TextField f350;

    @FXML
    private TextField f351;

    @FXML
    private TextField f352;

    @FXML
    private TextField f353;

    @FXML
    private TextField f354;

    @FXML
    private TextField f355;

    @FXML
    private TextField f356;

    @FXML
    private TextField f357;

    @FXML
    private TextField f358;

    @FXML
    private TextField f360;

    @FXML
    private TextField f361;

    @FXML
    private TextField f362;

    @FXML
    private TextField f363;

    @FXML
    private TextField f364;

    @FXML
    private TextField f365;

    @FXML
    private TextField f366;

    @FXML
    private TextField f367;

    @FXML
    private TextField f368;

    @FXML
    private TextField f370;

    @FXML
    private TextField f371;

    @FXML
    private TextField f372;

    @FXML
    private TextField f373;

    @FXML
    private TextField f374;

    @FXML
    private TextField f375;

    @FXML
    private TextField f376;

    @FXML
    private TextField f377;

    @FXML
    private TextField f378;

    @FXML
    private TextField f380;

    @FXML
    private TextField f381;

    @FXML
    private TextField f382;

    @FXML
    private TextField f383;

    @FXML
    private TextField f384;

    @FXML
    private TextField f385;

    @FXML
    private TextField f386;

    @FXML
    private TextField f387;

    @FXML
    private TextField f388;

    @FXML
    private void handleField(KeyEvent event) {
        // Button was clicked, do something...
        System.out.println("lalalala");
    }


    public Field[] puzzle1=new Field[81];
    public Field[] puzzle2=new Field[81];
    public Field[] puzzle3=new Field[81];

    @FXML
    void initialize() {


        puzzle1[0] = new Field(-1, 1, 0, 0, f100, puzzle1);
        puzzle1[1] = new Field(-1, 1, 1, 0, f110, puzzle1);
        puzzle1[2] = new Field(-1, 1, 2, 0, f120, puzzle1);
        puzzle1[3] = new Field(3, 2, 3, 0, f130, puzzle1);
        puzzle1[4] = new Field(-1, 2, 4, 0, f140, puzzle1);
        puzzle1[5] = new Field(-1, 2, 5, 0, f150, puzzle1);
        puzzle1[6] = new Field(-1, 3, 6, 0, f160, puzzle1);
        puzzle1[7] = new Field(-1, 3, 7, 0, f170, puzzle1);
        puzzle1[8] = new Field(-1, 3, 8, 0, f180, puzzle1);
        puzzle1[9] = new Field(1, 1, 0, 1, f101, puzzle1);
        puzzle1[10] = new Field(-1, 1, 1, 1, f111, puzzle1);
        puzzle1[11] = new Field(-1, 1, 2, 1, f121, puzzle1);
        puzzle1[12] = new Field(-1, 2, 3, 1, f131, puzzle1);
        puzzle1[13] = new Field(-1, 2, 4, 1, f141, puzzle1);
        puzzle1[14] = new Field(-1, 2, 5, 1, f151, puzzle1);
        puzzle1[15] = new Field(-1, 3, 6, 1, f161, puzzle1);
        puzzle1[16] = new Field(-1, 3, 7, 1, f171, puzzle1);
        puzzle1[17] = new Field(-1, 3, 8, 1, f181, puzzle1);
        puzzle1[18] = new Field(5, 1, 0, 2, f102, puzzle1);
        puzzle1[19] = new Field(-1, 1, 1, 2, f112, puzzle1);
        puzzle1[20] = new Field(-1, 1, 2, 2, f122, puzzle1);
        puzzle1[21] = new Field(-1, 2, 3, 2, f132, puzzle1);
        puzzle1[22] = new Field(4, 2, 4, 2, f142, puzzle1);
        puzzle1[23] = new Field(-1, 2, 5, 2, f152, puzzle1);
        puzzle1[24] = new Field(9, 3, 6, 2, f162, puzzle1);
        puzzle1[25] = new Field(-1, 3, 7, 2, f172, puzzle1);
        puzzle1[26] = new Field(-1, 3, 8, 2, f182, puzzle1);
        puzzle1[27] = new Field(-1, 4, 0, 3, f103, puzzle1);
        puzzle1[28] = new Field(-1, 4, 1, 3, f113, puzzle1);
        puzzle1[29] = new Field(8, 4, 2, 3, f123, puzzle1);
        puzzle1[30] = new Field(-1, 5, 3, 3, f133, puzzle1);
        puzzle1[31] = new Field(9, 5, 4, 3, f143, puzzle1);
        puzzle1[32] = new Field(-1, 5, 5, 3, f153, puzzle1);
        puzzle1[33] = new Field(-1, 6, 6, 3, f163, puzzle1);
        puzzle1[34] = new Field(-1, 6, 7, 3, f173, puzzle1);
        puzzle1[35] = new Field(-1, 6, 8, 3, f183, puzzle1);
        puzzle1[36] = new Field(6, 4, 0, 4, f104, puzzle1);
        puzzle1[37] = new Field(3, 4, 1, 4, f114, puzzle1);
        puzzle1[38] = new Field(-1, 4, 2, 4, f124, puzzle1);
        puzzle1[39] = new Field(-1, 5, 3, 4, f134, puzzle1);
        puzzle1[40] = new Field(-1, 5, 4, 4, f144, puzzle1);
        puzzle1[41] = new Field(-1, 5, 5, 4, f154, puzzle1);
        puzzle1[42] = new Field(-1, 6, 6, 4, f164, puzzle1);
        puzzle1[43] = new Field(-1, 6, 7, 4, f174, puzzle1);
        puzzle1[44] = new Field(-1, 6, 8, 4, f184, puzzle1);
        puzzle1[45] = new Field(-1, 4, 0, 5, f105, puzzle1);
        puzzle1[46] = new Field(2, 4, 1, 5, f115, puzzle1);
        puzzle1[47] = new Field(-1, 4, 2, 5, f125, puzzle1);
        puzzle1[48] = new Field(-1, 5, 3, 5, f135, puzzle1);
        puzzle1[49] = new Field(8, 5, 4, 5, f145, puzzle1);
        puzzle1[50] = new Field(3, 5, 5, 5, f155, puzzle1);
        puzzle1[51] = new Field(-1, 6, 6, 5, f165, puzzle1);
        puzzle1[52] = new Field(-1, 6, 7, 5, f175, puzzle1);
        puzzle1[53] = new Field(-1, 6, 8, 5, f185, puzzle1);
        puzzle1[54] = new Field(-1, 7, 0, 6, f106, puzzle1);
        puzzle1[55] = new Field(-1, 7, 1, 6, f116, puzzle1);
        puzzle1[56] = new Field(9, 7, 2, 6, f126, puzzle1);
        puzzle1[57] = new Field(-1, 8, 3, 6, f136, puzzle1);
        puzzle1[58] = new Field(6, 8, 4, 6, f146, puzzle1);
        puzzle1[59] = new Field(-1, 8, 5, 6, f156, puzzle1);
        puzzle1[60] = new Field(-1, 9, 6, 6, f166, puzzle1);
        puzzle1[61] = new Field(1, 9, 7, 6, f176, puzzle1);
        puzzle1[62] = new Field(8, 9, 8, 6, f186, puzzle1);
        puzzle1[63] = new Field(-1, 7, 0, 7, f107, puzzle1);
        puzzle1[64] = new Field(1, 7, 1, 7, f117, puzzle1);
        puzzle1[65] = new Field(-1, 7, 2, 7, f127, puzzle1);
        puzzle1[66] = new Field(-1, 8, 3, 7, f137, puzzle1);
        puzzle1[67] = new Field(-1, 8, 4, 7, f147, puzzle1);
        puzzle1[68] = new Field(9, 8, 5, 7, f157, puzzle1);
        puzzle1[69] = new Field(-1, 9, 6, 7, f167, puzzle1);
        puzzle1[70] = new Field(2, 9, 7, 7, f177, puzzle1);
        puzzle1[71] = new Field(6, 9, 8, 7, f187, puzzle1);
        puzzle1[72] = new Field(-1, 7, 0, 8, f108, puzzle1);
        puzzle1[73] = new Field(-1, 7, 1, 8, f118, puzzle1);
        puzzle1[74] = new Field(4, 7, 2, 8, f128, puzzle1);
        puzzle1[75] = new Field(5, 8, 3, 8, f138, puzzle1);
        puzzle1[76] = new Field(-1, 8, 4, 8, f148, puzzle1);
        puzzle1[77] = new Field(-1, 8, 5, 8, f158, puzzle1);
        puzzle1[78] = new Field(-1, 9, 6, 8, f168, puzzle1);
        puzzle1[79] = new Field(3, 9, 7, 8, f178, puzzle1);
        puzzle1[80] = new Field(-1, 9, 8, 8, f188, puzzle1);
        puzzle2[0] = new Field(-1, 1, 0, 0, f200, puzzle2);
        puzzle2[1] = new Field(-1, 2, 1, 0, f210, puzzle2);
        puzzle2[2] = new Field(-1, 2, 2, 0, f220, puzzle2);
        puzzle2[3] = new Field(4, 2, 3, 0, f230, puzzle2);
        puzzle2[4] = new Field(3, 3, 4, 0, f240, puzzle2);
        puzzle2[5] = new Field(1, 3, 5, 0, f250, puzzle2);
        puzzle2[6] = new Field(-1, 3, 6, 0, f260, puzzle2);
        puzzle2[7] = new Field(-1, 3, 7, 0, f270, puzzle2);
        puzzle2[8] = new Field(-1, 3, 8, 0, f280, puzzle2);
        puzzle2[9] = new Field(-1, 1, 0, 1, f201, puzzle2);
        puzzle2[10] = new Field(-1, 1, 1, 1, f211, puzzle2);
        puzzle2[11] = new Field(8, 2, 2, 1, f221, puzzle2);
        puzzle2[12] = new Field(-1, 2, 3, 1, f231, puzzle2);
        puzzle2[13] = new Field(-1, 3, 4, 1, f241, puzzle2);
        puzzle2[14] = new Field(-1, 3, 5, 1, f251, puzzle2);
        puzzle2[15] = new Field(4, 3, 6, 1, f261, puzzle2);
        puzzle2[16] = new Field(-1, 3, 7, 1, f271, puzzle2);
        puzzle2[17] = new Field(-1, 6, 8, 1, f281, puzzle2);
        puzzle2[18] = new Field(-1, 1, 0, 2, f202, puzzle2);
        puzzle2[19] = new Field(3, 1, 1, 2, f212, puzzle2);
        puzzle2[20] = new Field(-1, 2, 2, 2, f222, puzzle2);
        puzzle2[21] = new Field(-1, 2, 3, 2, f232, puzzle2);
        puzzle2[22] = new Field(-1, 6, 4, 2, f242, puzzle2);
        puzzle2[23] = new Field(-1, 6, 5, 2, f252, puzzle2);
        puzzle2[24] = new Field(-1, 6, 6, 2, f262, puzzle2);
        puzzle2[25] = new Field(1, 6, 7, 2, f272, puzzle2);
        puzzle2[26] = new Field(-1, 6, 8, 2, f282, puzzle2);
        puzzle2[27] = new Field(2, 1, 0, 3, f203, puzzle2);
        puzzle2[28] = new Field(-1, 1, 1, 3, f213, puzzle2);
        puzzle2[29] = new Field(-1, 4, 2, 3, f223, puzzle2);
        puzzle2[30] = new Field(-1, 2, 3, 3, f233, puzzle2);
        puzzle2[31] = new Field(-1, 2, 4, 3, f243, puzzle2);
        puzzle2[32] = new Field(-1, 6, 5, 3, f253, puzzle2);
        puzzle2[33] = new Field(-1, 6, 6, 3, f263, puzzle2);
        puzzle2[34] = new Field(-1, 5, 7, 3, f273, puzzle2);
        puzzle2[35] = new Field(5, 6, 8, 3, f283, puzzle2);
        puzzle2[36] = new Field(3, 8, 0, 4, f204, puzzle2);
        puzzle2[37] = new Field(-1, 1, 1, 4, f214, puzzle2);
        puzzle2[38] = new Field(-1, 4, 2, 4, f224, puzzle2);
        puzzle2[39] = new Field(-1, 4, 3, 4, f234, puzzle2);
        puzzle2[40] = new Field(-1, 5, 4, 4, f244, puzzle2);
        puzzle2[41] = new Field(-1, 5, 5, 4, f254, puzzle2);
        puzzle2[42] = new Field(-1, 5, 6, 4, f264, puzzle2);
        puzzle2[43] = new Field(-1, 5, 7, 4, f274, puzzle2);
        puzzle2[44] = new Field(9, 5, 8, 4, f284, puzzle2);
        puzzle2[45] = new Field(9, 8, 0, 5, f205, puzzle2);
        puzzle2[46] = new Field(-1, 1, 1, 5, f215, puzzle2);
        puzzle2[47] = new Field(-1, 4, 2, 5, f225, puzzle2);
        puzzle2[48] = new Field(-1, 4, 3, 5, f235, puzzle2);
        puzzle2[49] = new Field(-1, 4, 4, 5, f245, puzzle2);
        puzzle2[50] = new Field(-1, 4, 5, 5, f255, puzzle2);
        puzzle2[51] = new Field(-1, 4, 6, 5, f265, puzzle2);
        puzzle2[52] = new Field(-1, 5, 7, 5, f275, puzzle2);
        puzzle2[53] = new Field(2, 5, 8, 5, f285, puzzle2);
        puzzle2[54] = new Field(-1, 8, 0, 6, f206, puzzle2);
        puzzle2[55] = new Field(7, 8, 1, 6, f216, puzzle2);
        puzzle2[56] = new Field(-1, 8, 2, 6, f226, puzzle2);
        puzzle2[57] = new Field(-1, 8, 3, 6, f236, puzzle2);
        puzzle2[58] = new Field(-1, 8, 4, 6, f246, puzzle2);
        puzzle2[59] = new Field(-1, 4, 5, 6, f256, puzzle2);
        puzzle2[60] = new Field(-1, 9, 6, 6, f266, puzzle2);
        puzzle2[61] = new Field(6, 9, 7, 6, f276, puzzle2);
        puzzle2[62] = new Field(-1, 5, 8, 6, f286, puzzle2);
        puzzle2[63] = new Field(-1, 7, 0, 7, f207, puzzle2);
        puzzle2[64] = new Field(-1, 7, 1, 7, f217, puzzle2);
        puzzle2[65] = new Field(9, 7, 2, 7, f227, puzzle2);
        puzzle2[66] = new Field(-1, 8, 3, 7, f237, puzzle2);
        puzzle2[67] = new Field(-1, 8, 4, 7, f247, puzzle2);
        puzzle2[68] = new Field(-1, 9, 5, 7, f257, puzzle2);
        puzzle2[69] = new Field(5, 9, 6, 7, f267, puzzle2);
        puzzle2[70] = new Field(-1, 9, 7, 7, f277, puzzle2);
        puzzle2[71] = new Field(-1, 9, 8, 7, f287, puzzle2);
        puzzle2[72] = new Field(-1, 7, 0, 8, f208, puzzle2);
        puzzle2[73] = new Field(-1, 7, 1, 8, f218, puzzle2);
        puzzle2[74] = new Field(-1, 7, 2, 8, f228, puzzle2);
        puzzle2[75] = new Field(8, 7, 3, 8, f238, puzzle2);
        puzzle2[76] = new Field(5, 7, 4, 8, f248, puzzle2);
        puzzle2[77] = new Field(3, 7, 5, 8, f258, puzzle2);
        puzzle2[78] = new Field(-1, 9, 6, 8, f268, puzzle2);
        puzzle2[79] = new Field(-1, 9, 7, 8, f278, puzzle2);
        puzzle2[80] = new Field(-1, 9, 8, 8, f288, puzzle2);
        puzzle3[0] = new Field(-1, 1, 0, 0, f300, puzzle3);
        puzzle3[1] = new Field(4, 1, 1, 0, f310, puzzle3);
        puzzle3[2] = new Field(1, 2, 2, 0, f320, puzzle3);
        puzzle3[3] = new Field(-1, 2, 3, 0, f330, puzzle3);
        puzzle3[4] = new Field(8, 2, 4, 0, f340, puzzle3);
        puzzle3[5] = new Field(-1, 2, 5, 0, f350, puzzle3);
        puzzle3[6] = new Field(-1, 3, 6, 0, f360, puzzle3);
        puzzle3[7] = new Field(6, 3, 7, 0, f370, puzzle3);
        puzzle3[8] = new Field(-1, 3, 8, 0, f380, puzzle3);
        puzzle3[9] = new Field(2, 1, 0, 1, f301, puzzle3);
        puzzle3[10] = new Field(-1, 2, 1, 1, f311, puzzle3);
        puzzle3[11] = new Field(-1, 2, 2, 1, f321, puzzle3);
        puzzle3[12] = new Field(-1, 2, 3, 1, f331, puzzle3);
        puzzle3[13] = new Field(-1, 2, 4, 1, f341, puzzle3);
        puzzle3[14] = new Field(-1, 3, 5, 1, f351, puzzle3);
        puzzle3[15] = new Field(-1, 3, 6, 1, f361, puzzle3);
        puzzle3[16] = new Field(-1, 6, 7, 1, f371, puzzle3);
        puzzle3[17] = new Field(5, 3, 8, 1, f381, puzzle3);
        puzzle3[18] = new Field(-1, 1, 0, 2, f302, puzzle3);
        puzzle3[19] = new Field(-1, 1, 1, 2, f312, puzzle3);
        puzzle3[20] = new Field(-1, 2, 2, 2, f322, puzzle3);
        puzzle3[21] = new Field(-1, 1, 3, 2, f332, puzzle3);
        puzzle3[22] = new Field(-1, 5, 4, 2, f342, puzzle3);
        puzzle3[23] = new Field(-1, 3, 5, 2, f352, puzzle3);
        puzzle3[24] = new Field(-1, 6, 6, 2, f362, puzzle3);
        puzzle3[25] = new Field(-1, 6, 7, 2, f372, puzzle3);
        puzzle3[26] = new Field(1, 6, 8, 2, f382, puzzle3);
        puzzle3[27] = new Field(-1, 4, 0, 3, f303, puzzle3);
        puzzle3[28] = new Field(-1, 1, 1, 3, f313, puzzle3);
        puzzle3[29] = new Field(-1, 1, 2, 3, f323, puzzle3);
        puzzle3[30] = new Field(-1, 1, 3, 3, f333, puzzle3);
        puzzle3[31] = new Field(-1, 5, 4, 3, f343, puzzle3);
        puzzle3[32] = new Field(-1, 3, 5, 3, f353, puzzle3);
        puzzle3[33] = new Field(-1, 3, 6, 3, f363, puzzle3);
        puzzle3[34] = new Field(-1, 6, 7, 3, f373, puzzle3);
        puzzle3[35] = new Field(-1, 6, 8, 3, f383, puzzle3);
        puzzle3[36] = new Field(3, 4, 0, 4, f304, puzzle3);
        puzzle3[37] = new Field(-1, 4, 1, 4, f314, puzzle3);
        puzzle3[38] = new Field(-1, 5, 2, 4, f324, puzzle3);
        puzzle3[39] = new Field(-1, 5, 3, 4, f334, puzzle3);
        puzzle3[40] = new Field(-1, 5, 4, 4, f344, puzzle3);
        puzzle3[41] = new Field(-1, 5, 5, 4, f354, puzzle3);
        puzzle3[42] = new Field(-1, 5, 6, 4, f364, puzzle3);
        puzzle3[43] = new Field(-1, 6, 7, 4, f374, puzzle3);
        puzzle3[44] = new Field(9, 6, 8, 4, f384, puzzle3);
        puzzle3[45] = new Field(-1, 4, 0, 5, f305, puzzle3);
        puzzle3[46] = new Field(-1, 4, 1, 5, f315, puzzle3);
        puzzle3[47] = new Field(-1, 7, 2, 5, f325, puzzle3);
        puzzle3[48] = new Field(-1, 7, 3, 5, f335, puzzle3);
        puzzle3[49] = new Field(-1, 5, 4, 5, f345, puzzle3);
        puzzle3[50] = new Field(-1, 9, 5, 5, f355, puzzle3);
        puzzle3[51] = new Field(-1, 9, 6, 5, f365, puzzle3);
        puzzle3[52] = new Field(-1, 9, 7, 5, f375, puzzle3);
        puzzle3[53] = new Field(-1, 6, 8, 5, f385, puzzle3);
        puzzle3[54] = new Field(9, 4, 0, 6, f306, puzzle3);
        puzzle3[55] = new Field(-1, 4, 1, 6, f316, puzzle3);
        puzzle3[56] = new Field(-1, 4, 2, 6, f326, puzzle3);
        puzzle3[57] = new Field(-1, 7, 3, 6, f336, puzzle3);
        puzzle3[58] = new Field(-1, 5, 4, 6, f346, puzzle3);
        puzzle3[59] = new Field(-1, 9, 5, 6, f356, puzzle3);
        puzzle3[60] = new Field(-1, 8, 6, 6, f366, puzzle3);
        puzzle3[61] = new Field(-1, 9, 7, 6, f376, puzzle3);
        puzzle3[62] = new Field(-1, 9, 8, 6, f386, puzzle3);
        puzzle3[63] = new Field(7, 7, 0, 7, f307, puzzle3);
        puzzle3[64] = new Field(-1, 4, 1, 7, f317, puzzle3);
        puzzle3[65] = new Field(-1, 7, 2, 7, f327, puzzle3);
        puzzle3[66] = new Field(-1, 7, 3, 7, f337, puzzle3);
        puzzle3[67] = new Field(-1, 8, 4, 7, f347, puzzle3);
        puzzle3[68] = new Field(-1, 8, 5, 7, f357, puzzle3);
        puzzle3[69] = new Field(-1, 8, 6, 7, f367, puzzle3);
        puzzle3[70] = new Field(-1, 8, 7, 7, f377, puzzle3);
        puzzle3[71] = new Field(2, 9, 8, 7, f387, puzzle3);
        puzzle3[72] = new Field(-1, 7, 0, 8, f308, puzzle3);
        puzzle3[73] = new Field(3, 7, 1, 8, f318, puzzle3);
        puzzle3[74] = new Field(-1, 7, 2, 8, f328, puzzle3);
        puzzle3[75] = new Field(-1, 8, 3, 8, f338, puzzle3);
        puzzle3[76] = new Field(6, 8, 4, 8, f348, puzzle3);
        puzzle3[77] = new Field(-1, 8, 5, 8, f358, puzzle3);
        puzzle3[78] = new Field(2, 8, 6, 8, f368, puzzle3);
        puzzle3[79] = new Field(4, 9, 7, 8, f378, puzzle3);
        puzzle3[80] = new Field(-1, 9, 8, 8, f388, puzzle3);



        assert f100 != null : "fx:id=\"f100\" was not injected: check your FXML file 'sample.fxml'.";
        assert f101 != null : "fx:id=\"f101\" was not injected: check your FXML file 'sample.fxml'.";
        assert f102 != null : "fx:id=\"f102\" was not injected: check your FXML file 'sample.fxml'.";
        assert f103 != null : "fx:id=\"f103\" was not injected: check your FXML file 'sample.fxml'.";
        assert f104 != null : "fx:id=\"f104\" was not injected: check your FXML file 'sample.fxml'.";
        assert f105 != null : "fx:id=\"f105\" was not injected: check your FXML file 'sample.fxml'.";
        assert f106 != null : "fx:id=\"f106\" was not injected: check your FXML file 'sample.fxml'.";
        assert f107 != null : "fx:id=\"f107\" was not injected: check your FXML file 'sample.fxml'.";
        assert f108 != null : "fx:id=\"f108\" was not injected: check your FXML file 'sample.fxml'.";
        assert f110 != null : "fx:id=\"f110\" was not injected: check your FXML file 'sample.fxml'.";
        assert f111 != null : "fx:id=\"f111\" was not injected: check your FXML file 'sample.fxml'.";
        assert f112 != null : "fx:id=\"f112\" was not injected: check your FXML file 'sample.fxml'.";
        assert f113 != null : "fx:id=\"f113\" was not injected: check your FXML file 'sample.fxml'.";
        assert f114 != null : "fx:id=\"f114\" was not injected: check your FXML file 'sample.fxml'.";
        assert f115 != null : "fx:id=\"f115\" was not injected: check your FXML file 'sample.fxml'.";
        assert f116 != null : "fx:id=\"f116\" was not injected: check your FXML file 'sample.fxml'.";
        assert f117 != null : "fx:id=\"f117\" was not injected: check your FXML file 'sample.fxml'.";
        assert f118 != null : "fx:id=\"f118\" was not injected: check your FXML file 'sample.fxml'.";
        assert f120 != null : "fx:id=\"f120\" was not injected: check your FXML file 'sample.fxml'.";
        assert f121 != null : "fx:id=\"f121\" was not injected: check your FXML file 'sample.fxml'.";
        assert f122 != null : "fx:id=\"f122\" was not injected: check your FXML file 'sample.fxml'.";
        assert f123 != null : "fx:id=\"f123\" was not injected: check your FXML file 'sample.fxml'.";
        assert f124 != null : "fx:id=\"f124\" was not injected: check your FXML file 'sample.fxml'.";
        assert f125 != null : "fx:id=\"f125\" was not injected: check your FXML file 'sample.fxml'.";
        assert f126 != null : "fx:id=\"f126\" was not injected: check your FXML file 'sample.fxml'.";
        assert f127 != null : "fx:id=\"f127\" was not injected: check your FXML file 'sample.fxml'.";
        assert f128 != null : "fx:id=\"f128\" was not injected: check your FXML file 'sample.fxml'.";
        assert f130 != null : "fx:id=\"f130\" was not injected: check your FXML file 'sample.fxml'.";
        assert f131 != null : "fx:id=\"f131\" was not injected: check your FXML file 'sample.fxml'.";
        assert f132 != null : "fx:id=\"f132\" was not injected: check your FXML file 'sample.fxml'.";
        assert f133 != null : "fx:id=\"f133\" was not injected: check your FXML file 'sample.fxml'.";
        assert f134 != null : "fx:id=\"f134\" was not injected: check your FXML file 'sample.fxml'.";
        assert f135 != null : "fx:id=\"f135\" was not injected: check your FXML file 'sample.fxml'.";
        assert f136 != null : "fx:id=\"f136\" was not injected: check your FXML file 'sample.fxml'.";
        assert f137 != null : "fx:id=\"f137\" was not injected: check your FXML file 'sample.fxml'.";
        assert f138 != null : "fx:id=\"f138\" was not injected: check your FXML file 'sample.fxml'.";
        assert f140 != null : "fx:id=\"f140\" was not injected: check your FXML file 'sample.fxml'.";
        assert f141 != null : "fx:id=\"f141\" was not injected: check your FXML file 'sample.fxml'.";
        assert f142 != null : "fx:id=\"f142\" was not injected: check your FXML file 'sample.fxml'.";
        assert f143 != null : "fx:id=\"f143\" was not injected: check your FXML file 'sample.fxml'.";
        assert f144 != null : "fx:id=\"f144\" was not injected: check your FXML file 'sample.fxml'.";
        assert f145 != null : "fx:id=\"f145\" was not injected: check your FXML file 'sample.fxml'.";
        assert f146 != null : "fx:id=\"f146\" was not injected: check your FXML file 'sample.fxml'.";
        assert f147 != null : "fx:id=\"f147\" was not injected: check your FXML file 'sample.fxml'.";
        assert f148 != null : "fx:id=\"f148\" was not injected: check your FXML file 'sample.fxml'.";
        assert f150 != null : "fx:id=\"f150\" was not injected: check your FXML file 'sample.fxml'.";
        assert f151 != null : "fx:id=\"f151\" was not injected: check your FXML file 'sample.fxml'.";
        assert f152 != null : "fx:id=\"f152\" was not injected: check your FXML file 'sample.fxml'.";
        assert f153 != null : "fx:id=\"f153\" was not injected: check your FXML file 'sample.fxml'.";
        assert f154 != null : "fx:id=\"f154\" was not injected: check your FXML file 'sample.fxml'.";
        assert f155 != null : "fx:id=\"f155\" was not injected: check your FXML file 'sample.fxml'.";
        assert f156 != null : "fx:id=\"f156\" was not injected: check your FXML file 'sample.fxml'.";
        assert f157 != null : "fx:id=\"f157\" was not injected: check your FXML file 'sample.fxml'.";
        assert f158 != null : "fx:id=\"f158\" was not injected: check your FXML file 'sample.fxml'.";
        assert f160 != null : "fx:id=\"f160\" was not injected: check your FXML file 'sample.fxml'.";
        assert f161 != null : "fx:id=\"f161\" was not injected: check your FXML file 'sample.fxml'.";
        assert f162 != null : "fx:id=\"f162\" was not injected: check your FXML file 'sample.fxml'.";
        assert f163 != null : "fx:id=\"f163\" was not injected: check your FXML file 'sample.fxml'.";
        assert f164 != null : "fx:id=\"f164\" was not injected: check your FXML file 'sample.fxml'.";
        assert f165 != null : "fx:id=\"f165\" was not injected: check your FXML file 'sample.fxml'.";
        assert f166 != null : "fx:id=\"f166\" was not injected: check your FXML file 'sample.fxml'.";
        assert f167 != null : "fx:id=\"f167\" was not injected: check your FXML file 'sample.fxml'.";
        assert f168 != null : "fx:id=\"f168\" was not injected: check your FXML file 'sample.fxml'.";
        assert f170 != null : "fx:id=\"f170\" was not injected: check your FXML file 'sample.fxml'.";
        assert f171 != null : "fx:id=\"f171\" was not injected: check your FXML file 'sample.fxml'.";
        assert f172 != null : "fx:id=\"f172\" was not injected: check your FXML file 'sample.fxml'.";
        assert f173 != null : "fx:id=\"f173\" was not injected: check your FXML file 'sample.fxml'.";
        assert f174 != null : "fx:id=\"f174\" was not injected: check your FXML file 'sample.fxml'.";
        assert f175 != null : "fx:id=\"f175\" was not injected: check your FXML file 'sample.fxml'.";
        assert f176 != null : "fx:id=\"f176\" was not injected: check your FXML file 'sample.fxml'.";
        assert f177 != null : "fx:id=\"f177\" was not injected: check your FXML file 'sample.fxml'.";
        assert f178 != null : "fx:id=\"f178\" was not injected: check your FXML file 'sample.fxml'.";
        assert f180 != null : "fx:id=\"f180\" was not injected: check your FXML file 'sample.fxml'.";
        assert f181 != null : "fx:id=\"f181\" was not injected: check your FXML file 'sample.fxml'.";
        assert f182 != null : "fx:id=\"f182\" was not injected: check your FXML file 'sample.fxml'.";
        assert f183 != null : "fx:id=\"f183\" was not injected: check your FXML file 'sample.fxml'.";
        assert f184 != null : "fx:id=\"f184\" was not injected: check your FXML file 'sample.fxml'.";
        assert f185 != null : "fx:id=\"f185\" was not injected: check your FXML file 'sample.fxml'.";
        assert f186 != null : "fx:id=\"f186\" was not injected: check your FXML file 'sample.fxml'.";
        assert f187 != null : "fx:id=\"f187\" was not injected: check your FXML file 'sample.fxml'.";
        assert f188 != null : "fx:id=\"f188\" was not injected: check your FXML file 'sample.fxml'.";
        assert f200 != null : "fx:id=\"f200\" was not injected: check your FXML file 'sample.fxml'.";
        assert f201 != null : "fx:id=\"f201\" was not injected: check your FXML file 'sample.fxml'.";
        assert f202 != null : "fx:id=\"f202\" was not injected: check your FXML file 'sample.fxml'.";
        assert f203 != null : "fx:id=\"f203\" was not injected: check your FXML file 'sample.fxml'.";
        assert f204 != null : "fx:id=\"f204\" was not injected: check your FXML file 'sample.fxml'.";
        assert f205 != null : "fx:id=\"f205\" was not injected: check your FXML file 'sample.fxml'.";
        assert f206 != null : "fx:id=\"f206\" was not injected: check your FXML file 'sample.fxml'.";
        assert f207 != null : "fx:id=\"f207\" was not injected: check your FXML file 'sample.fxml'.";
        assert f208 != null : "fx:id=\"f208\" was not injected: check your FXML file 'sample.fxml'.";
        assert f210 != null : "fx:id=\"f210\" was not injected: check your FXML file 'sample.fxml'.";
        assert f211 != null : "fx:id=\"f211\" was not injected: check your FXML file 'sample.fxml'.";
        assert f212 != null : "fx:id=\"f212\" was not injected: check your FXML file 'sample.fxml'.";
        assert f213 != null : "fx:id=\"f213\" was not injected: check your FXML file 'sample.fxml'.";
        assert f214 != null : "fx:id=\"f214\" was not injected: check your FXML file 'sample.fxml'.";
        assert f215 != null : "fx:id=\"f215\" was not injected: check your FXML file 'sample.fxml'.";
        assert f216 != null : "fx:id=\"f216\" was not injected: check your FXML file 'sample.fxml'.";
        assert f217 != null : "fx:id=\"f217\" was not injected: check your FXML file 'sample.fxml'.";
        assert f218 != null : "fx:id=\"f218\" was not injected: check your FXML file 'sample.fxml'.";
        assert f220 != null : "fx:id=\"f220\" was not injected: check your FXML file 'sample.fxml'.";
        assert f221 != null : "fx:id=\"f221\" was not injected: check your FXML file 'sample.fxml'.";
        assert f222 != null : "fx:id=\"f222\" was not injected: check your FXML file 'sample.fxml'.";
        assert f223 != null : "fx:id=\"f223\" was not injected: check your FXML file 'sample.fxml'.";
        assert f224 != null : "fx:id=\"f224\" was not injected: check your FXML file 'sample.fxml'.";
        assert f225 != null : "fx:id=\"f225\" was not injected: check your FXML file 'sample.fxml'.";
        assert f226 != null : "fx:id=\"f226\" was not injected: check your FXML file 'sample.fxml'.";
        assert f227 != null : "fx:id=\"f227\" was not injected: check your FXML file 'sample.fxml'.";
        assert f228 != null : "fx:id=\"f228\" was not injected: check your FXML file 'sample.fxml'.";
        assert f230 != null : "fx:id=\"f230\" was not injected: check your FXML file 'sample.fxml'.";
        assert f231 != null : "fx:id=\"f231\" was not injected: check your FXML file 'sample.fxml'.";
        assert f232 != null : "fx:id=\"f232\" was not injected: check your FXML file 'sample.fxml'.";
        assert f233 != null : "fx:id=\"f233\" was not injected: check your FXML file 'sample.fxml'.";
        assert f234 != null : "fx:id=\"f234\" was not injected: check your FXML file 'sample.fxml'.";
        assert f235 != null : "fx:id=\"f235\" was not injected: check your FXML file 'sample.fxml'.";
        assert f236 != null : "fx:id=\"f236\" was not injected: check your FXML file 'sample.fxml'.";
        assert f237 != null : "fx:id=\"f237\" was not injected: check your FXML file 'sample.fxml'.";
        assert f238 != null : "fx:id=\"f238\" was not injected: check your FXML file 'sample.fxml'.";
        assert f240 != null : "fx:id=\"f240\" was not injected: check your FXML file 'sample.fxml'.";
        assert f241 != null : "fx:id=\"f241\" was not injected: check your FXML file 'sample.fxml'.";
        assert f242 != null : "fx:id=\"f242\" was not injected: check your FXML file 'sample.fxml'.";
        assert f243 != null : "fx:id=\"f243\" was not injected: check your FXML file 'sample.fxml'.";
        assert f244 != null : "fx:id=\"f244\" was not injected: check your FXML file 'sample.fxml'.";
        assert f245 != null : "fx:id=\"f245\" was not injected: check your FXML file 'sample.fxml'.";
        assert f246 != null : "fx:id=\"f246\" was not injected: check your FXML file 'sample.fxml'.";
        assert f247 != null : "fx:id=\"f247\" was not injected: check your FXML file 'sample.fxml'.";
        assert f248 != null : "fx:id=\"f248\" was not injected: check your FXML file 'sample.fxml'.";
        assert f250 != null : "fx:id=\"f250\" was not injected: check your FXML file 'sample.fxml'.";
        assert f251 != null : "fx:id=\"f251\" was not injected: check your FXML file 'sample.fxml'.";
        assert f252 != null : "fx:id=\"f252\" was not injected: check your FXML file 'sample.fxml'.";
        assert f253 != null : "fx:id=\"f253\" was not injected: check your FXML file 'sample.fxml'.";
        assert f254 != null : "fx:id=\"f254\" was not injected: check your FXML file 'sample.fxml'.";
        assert f255 != null : "fx:id=\"f255\" was not injected: check your FXML file 'sample.fxml'.";
        assert f256 != null : "fx:id=\"f256\" was not injected: check your FXML file 'sample.fxml'.";
        assert f257 != null : "fx:id=\"f257\" was not injected: check your FXML file 'sample.fxml'.";
        assert f258 != null : "fx:id=\"f258\" was not injected: check your FXML file 'sample.fxml'.";
        assert f260 != null : "fx:id=\"f260\" was not injected: check your FXML file 'sample.fxml'.";
        assert f261 != null : "fx:id=\"f261\" was not injected: check your FXML file 'sample.fxml'.";
        assert f262 != null : "fx:id=\"f262\" was not injected: check your FXML file 'sample.fxml'.";
        assert f263 != null : "fx:id=\"f263\" was not injected: check your FXML file 'sample.fxml'.";
        assert f264 != null : "fx:id=\"f264\" was not injected: check your FXML file 'sample.fxml'.";
        assert f265 != null : "fx:id=\"f265\" was not injected: check your FXML file 'sample.fxml'.";
        assert f266 != null : "fx:id=\"f266\" was not injected: check your FXML file 'sample.fxml'.";
        assert f267 != null : "fx:id=\"f267\" was not injected: check your FXML file 'sample.fxml'.";
        assert f268 != null : "fx:id=\"f268\" was not injected: check your FXML file 'sample.fxml'.";
        assert f270 != null : "fx:id=\"f270\" was not injected: check your FXML file 'sample.fxml'.";
        assert f271 != null : "fx:id=\"f271\" was not injected: check your FXML file 'sample.fxml'.";
        assert f272 != null : "fx:id=\"f272\" was not injected: check your FXML file 'sample.fxml'.";
        assert f273 != null : "fx:id=\"f273\" was not injected: check your FXML file 'sample.fxml'.";
        assert f274 != null : "fx:id=\"f274\" was not injected: check your FXML file 'sample.fxml'.";
        assert f275 != null : "fx:id=\"f275\" was not injected: check your FXML file 'sample.fxml'.";
        assert f276 != null : "fx:id=\"f276\" was not injected: check your FXML file 'sample.fxml'.";
        assert f277 != null : "fx:id=\"f277\" was not injected: check your FXML file 'sample.fxml'.";
        assert f278 != null : "fx:id=\"f278\" was not injected: check your FXML file 'sample.fxml'.";
        assert f280 != null : "fx:id=\"f280\" was not injected: check your FXML file 'sample.fxml'.";
        assert f281 != null : "fx:id=\"f281\" was not injected: check your FXML file 'sample.fxml'.";
        assert f282 != null : "fx:id=\"f282\" was not injected: check your FXML file 'sample.fxml'.";
        assert f283 != null : "fx:id=\"f283\" was not injected: check your FXML file 'sample.fxml'.";
        assert f284 != null : "fx:id=\"f284\" was not injected: check your FXML file 'sample.fxml'.";
        assert f285 != null : "fx:id=\"f285\" was not injected: check your FXML file 'sample.fxml'.";
        assert f286 != null : "fx:id=\"f286\" was not injected: check your FXML file 'sample.fxml'.";
        assert f287 != null : "fx:id=\"f287\" was not injected: check your FXML file 'sample.fxml'.";
        assert f288 != null : "fx:id=\"f288\" was not injected: check your FXML file 'sample.fxml'.";
        assert f300 != null : "fx:id=\"f300\" was not injected: check your FXML file 'sample.fxml'.";
        assert f301 != null : "fx:id=\"f301\" was not injected: check your FXML file 'sample.fxml'.";
        assert f302 != null : "fx:id=\"f302\" was not injected: check your FXML file 'sample.fxml'.";
        assert f303 != null : "fx:id=\"f303\" was not injected: check your FXML file 'sample.fxml'.";
        assert f304 != null : "fx:id=\"f304\" was not injected: check your FXML file 'sample.fxml'.";
        assert f305 != null : "fx:id=\"f305\" was not injected: check your FXML file 'sample.fxml'.";
        assert f306 != null : "fx:id=\"f306\" was not injected: check your FXML file 'sample.fxml'.";
        assert f307 != null : "fx:id=\"f307\" was not injected: check your FXML file 'sample.fxml'.";
        assert f308 != null : "fx:id=\"f308\" was not injected: check your FXML file 'sample.fxml'.";
        assert f310 != null : "fx:id=\"f310\" was not injected: check your FXML file 'sample.fxml'.";
        assert f311 != null : "fx:id=\"f311\" was not injected: check your FXML file 'sample.fxml'.";
        assert f312 != null : "fx:id=\"f312\" was not injected: check your FXML file 'sample.fxml'.";
        assert f313 != null : "fx:id=\"f313\" was not injected: check your FXML file 'sample.fxml'.";
        assert f314 != null : "fx:id=\"f314\" was not injected: check your FXML file 'sample.fxml'.";
        assert f315 != null : "fx:id=\"f315\" was not injected: check your FXML file 'sample.fxml'.";
        assert f316 != null : "fx:id=\"f316\" was not injected: check your FXML file 'sample.fxml'.";
        assert f317 != null : "fx:id=\"f317\" was not injected: check your FXML file 'sample.fxml'.";
        assert f318 != null : "fx:id=\"f318\" was not injected: check your FXML file 'sample.fxml'.";
        assert f320 != null : "fx:id=\"f320\" was not injected: check your FXML file 'sample.fxml'.";
        assert f321 != null : "fx:id=\"f321\" was not injected: check your FXML file 'sample.fxml'.";
        assert f322 != null : "fx:id=\"f322\" was not injected: check your FXML file 'sample.fxml'.";
        assert f323 != null : "fx:id=\"f323\" was not injected: check your FXML file 'sample.fxml'.";
        assert f324 != null : "fx:id=\"f324\" was not injected: check your FXML file 'sample.fxml'.";
        assert f325 != null : "fx:id=\"f325\" was not injected: check your FXML file 'sample.fxml'.";
        assert f326 != null : "fx:id=\"f326\" was not injected: check your FXML file 'sample.fxml'.";
        assert f327 != null : "fx:id=\"f327\" was not injected: check your FXML file 'sample.fxml'.";
        assert f328 != null : "fx:id=\"f328\" was not injected: check your FXML file 'sample.fxml'.";
        assert f330 != null : "fx:id=\"f330\" was not injected: check your FXML file 'sample.fxml'.";
        assert f331 != null : "fx:id=\"f331\" was not injected: check your FXML file 'sample.fxml'.";
        assert f332 != null : "fx:id=\"f332\" was not injected: check your FXML file 'sample.fxml'.";
        assert f333 != null : "fx:id=\"f333\" was not injected: check your FXML file 'sample.fxml'.";
        assert f334 != null : "fx:id=\"f334\" was not injected: check your FXML file 'sample.fxml'.";
        assert f335 != null : "fx:id=\"f335\" was not injected: check your FXML file 'sample.fxml'.";
        assert f336 != null : "fx:id=\"f336\" was not injected: check your FXML file 'sample.fxml'.";
        assert f337 != null : "fx:id=\"f337\" was not injected: check your FXML file 'sample.fxml'.";
        assert f338 != null : "fx:id=\"f338\" was not injected: check your FXML file 'sample.fxml'.";
        assert f340 != null : "fx:id=\"f340\" was not injected: check your FXML file 'sample.fxml'.";
        assert f341 != null : "fx:id=\"f341\" was not injected: check your FXML file 'sample.fxml'.";
        assert f342 != null : "fx:id=\"f342\" was not injected: check your FXML file 'sample.fxml'.";
        assert f343 != null : "fx:id=\"f343\" was not injected: check your FXML file 'sample.fxml'.";
        assert f344 != null : "fx:id=\"f344\" was not injected: check your FXML file 'sample.fxml'.";
        assert f345 != null : "fx:id=\"f345\" was not injected: check your FXML file 'sample.fxml'.";
        assert f346 != null : "fx:id=\"f346\" was not injected: check your FXML file 'sample.fxml'.";
        assert f347 != null : "fx:id=\"f347\" was not injected: check your FXML file 'sample.fxml'.";
        assert f348 != null : "fx:id=\"f348\" was not injected: check your FXML file 'sample.fxml'.";
        assert f350 != null : "fx:id=\"f350\" was not injected: check your FXML file 'sample.fxml'.";
        assert f351 != null : "fx:id=\"f351\" was not injected: check your FXML file 'sample.fxml'.";
        assert f352 != null : "fx:id=\"f352\" was not injected: check your FXML file 'sample.fxml'.";
        assert f353 != null : "fx:id=\"f353\" was not injected: check your FXML file 'sample.fxml'.";
        assert f354 != null : "fx:id=\"f354\" was not injected: check your FXML file 'sample.fxml'.";
        assert f355 != null : "fx:id=\"f355\" was not injected: check your FXML file 'sample.fxml'.";
        assert f356 != null : "fx:id=\"f356\" was not injected: check your FXML file 'sample.fxml'.";
        assert f357 != null : "fx:id=\"f357\" was not injected: check your FXML file 'sample.fxml'.";
        assert f358 != null : "fx:id=\"f358\" was not injected: check your FXML file 'sample.fxml'.";
        assert f360 != null : "fx:id=\"f360\" was not injected: check your FXML file 'sample.fxml'.";
        assert f361 != null : "fx:id=\"f361\" was not injected: check your FXML file 'sample.fxml'.";
        assert f362 != null : "fx:id=\"f362\" was not injected: check your FXML file 'sample.fxml'.";
        assert f363 != null : "fx:id=\"f363\" was not injected: check your FXML file 'sample.fxml'.";
        assert f364 != null : "fx:id=\"f364\" was not injected: check your FXML file 'sample.fxml'.";
        assert f365 != null : "fx:id=\"f365\" was not injected: check your FXML file 'sample.fxml'.";
        assert f366 != null : "fx:id=\"f366\" was not injected: check your FXML file 'sample.fxml'.";
        assert f367 != null : "fx:id=\"f367\" was not injected: check your FXML file 'sample.fxml'.";
        assert f368 != null : "fx:id=\"f368\" was not injected: check your FXML file 'sample.fxml'.";
        assert f370 != null : "fx:id=\"f370\" was not injected: check your FXML file 'sample.fxml'.";
        assert f371 != null : "fx:id=\"f371\" was not injected: check your FXML file 'sample.fxml'.";
        assert f372 != null : "fx:id=\"f372\" was not injected: check your FXML file 'sample.fxml'.";
        assert f373 != null : "fx:id=\"f373\" was not injected: check your FXML file 'sample.fxml'.";
        assert f374 != null : "fx:id=\"f374\" was not injected: check your FXML file 'sample.fxml'.";
        assert f375 != null : "fx:id=\"f375\" was not injected: check your FXML file 'sample.fxml'.";
        assert f376 != null : "fx:id=\"f376\" was not injected: check your FXML file 'sample.fxml'.";
        assert f377 != null : "fx:id=\"f377\" was not injected: check your FXML file 'sample.fxml'.";
        assert f378 != null : "fx:id=\"f378\" was not injected: check your FXML file 'sample.fxml'.";
        assert f380 != null : "fx:id=\"f380\" was not injected: check your FXML file 'sample.fxml'.";
        assert f381 != null : "fx:id=\"f381\" was not injected: check your FXML file 'sample.fxml'.";
        assert f382 != null : "fx:id=\"f382\" was not injected: check your FXML file 'sample.fxml'.";
        assert f383 != null : "fx:id=\"f383\" was not injected: check your FXML file 'sample.fxml'.";
        assert f384 != null : "fx:id=\"f384\" was not injected: check your FXML file 'sample.fxml'.";
        assert f385 != null : "fx:id=\"f385\" was not injected: check your FXML file 'sample.fxml'.";
        assert f386 != null : "fx:id=\"f386\" was not injected: check your FXML file 'sample.fxml'.";
        assert f387 != null : "fx:id=\"f387\" was not injected: check your FXML file 'sample.fxml'.";
        assert f388 != null : "fx:id=\"f388\" was not injected: check your FXML file 'sample.fxml'.";
    }
}
