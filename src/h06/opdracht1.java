package h06;

import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet {

    int a;
    int b;
    int uitkomst;
public void init() {

    a = 113;
    b = 4;

   uitkomst = (a / b);

}

public void paint(Graphics g) {

    g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    g.drawString("plus 25 cent " , 150, 20);
    g.drawString("jan krijgt 28 euro en 25 cent " , 20, 35);
    g.drawString("ali krijgt 28 euro en 25 cent " , 20, 50);
    g.drawString("jeannette krijgt 28 euro en 25 cent " , 20, 65);
    g.drawString("joey krijgt 28 euro en 25 cent " , 20, 80);
}







}