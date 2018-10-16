package h06;

import java.awt.*;
import java.applet.*;

public class opdracht4 extends Applet {

   double cijfer1;
   double cijfer2;
   double cijfer3;
   double uitkomst;


    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / 3;

        uitkomst = uitkomst * 10;
        int getalInt = (int) uitkomst;
        uitkomst = (double) getalInt;
        uitkomst = uitkomst / 10;

    }


    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }















}
