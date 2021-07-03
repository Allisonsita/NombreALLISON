import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Allison extends PApplet {
  public void setup() {

//Dibujando letra A
	//Letra A1
	  line(200,45,150,140);
	  line(200,45,250,140);
	//Letra A2
	  line(205,45,155,140);
	  line(205,45,255,140);

//Dibujando letra L1
	//Letra L11
	  line(80,150,80,195);
	  line(80,200,80,245);
	  line(80,245,150,245);
	//Letra L12
	  line(85,150,85,195);
	  line(85,200,85,245);
	  line(80,250,150,250);
	  
//Dibujando letra L2
	//Letra L21
	  line(165,150,165,195);
	  line(165,200,165,245);
	  line(170,245,235,245);
	//Letra L22
	  line(170,150,170,195);
	  line(170,200,170,245);
	  line(170,250,235,250);
	  
//Dibujando letra I
	//Letra I1
	  line(250,150,320,150);
	  line(285,155,285,195);
	  line(285,200,285,245);
	  line(250,245,320,245);
	//Letra I2
	  line(250,155,320,155);
	  line(290,155,290,195);
	  line(290,200,290,245);
	  line(250,250,320,250);
	  
//Dibujando letra S
	//Letra S1
	  line(100,260,150,260);
	  line(80,270,100,260);
	  line(80,270,80,297);
	  line(80,297,100,307);
	  line(100,307,130,307);
	  line(130,307,150,317);
	  line(150,317,150,344);
	  line(150,344,130,354);
	  line(130,354,80,354);
	//Letra S2
	  line(100,265,150,265);
	  line(80,275,100,265);
	  line(85,270,85,297);
	  line(80,302,100,312);
	  line(100,312,130,312);
	  line(130,312,150,322);
	  line(155,317,155,344);
	  line(150,349,130,359);
	  line(130,359,80,359);
	  
//Dibujando letra O
	//Letra O1
	  line(165,270,185,260);
	  line(185,260,215,260);
	  line(215,260,235,270);
	  line(235,270,235,344);
	  line(235,344,215,354);
	  line(215,354,185,354);
	  line(185,354,165,344);
	  line(165,270,165,344);
	//Letra O2
	  line(165,275,185,265);
	  line(185,265,215,265);
	  line(215,265,235,275);
	  line(240,270,240,344);
	  line(235,349,215,359);
	  line(215,359,185,359);
	  line(185,359,165,349);
	  line(170,270,170,344);
	  
//Dibujando letra N
	//Letra N1
	  line(250,310,250,355);
	  line(250,260,250,305);
	  line(250,260,285,305);
	  line(288,308,325,354);
	  line(320,354,320,310);
	  line(320,305,320,260);
	//Letra N2
	  line(255,310,255,355);
	  line(255,260,255,305);
	  line(255,260,290,305);
	  line(293,308,330,354);
	  line(325,354,325,310);
	  line(325,305,325,260);
	  
//Estrella
	  line(200,130,200,80);
	  line(185,105,215,105);
	  line(185,90,215,120);
	  line(185,120,215,90);
// tamaño de la ventana

    noLoop();
  }

  public void settings() { 
size(420,430); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Allison" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

