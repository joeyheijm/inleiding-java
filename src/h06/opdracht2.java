package h06;

import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {

    int a;
    int b;
    int uitkomst1;
    int c;
    int d;
    int uitkomst2;
    int e;
    int f;
    int uitkomst3;


    public void init() {

        a = 60;
        b = 60;

        uitkomst1 = (a * b);

        c = 1440;
        d = 60;

        uitkomst2 = (c * d);

        e = 60;
        f = 525600;

        uitkomst3 = (e * f);


    }

    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst1, 20, 20);
        g.drawString("seconden in een uur " , 160, 20);
        g.drawString("De uitkomst is: " + uitkomst2, 20, 35);
        g.drawString("seconden in een dag " , 165, 35);
        g.drawString("De uitkomst is: " + uitkomst3, 20, 65);
        g.drawString("seconden in een jaar " , 20, 80);
    }







}

