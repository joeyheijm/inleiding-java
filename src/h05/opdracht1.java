package h05;


import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

import static java.awt.Color.black;
import static java.awt.Color.magenta;
import static java.awt.Color.white;

public class opdracht1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    //een (lege) methode die de Applet initialiseert1474733
    public void init() {
        opvulkleur = Color.BLUE;
        lijnkleur = black;
        breedte = 100;
        hoogte = 50;

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(50, 20, 100, 20);
        g.drawString("Lijn" , 50, 30 );
        g.drawRect(50, 40, breedte, hoogte);
        g.drawString("Rechthoek" , 50, 80);
        g.drawRoundRect(50, 90, breedte, hoogte, 10, 10);
        g.drawString("Afgeronde rechthoek" , 5, 130 );
        g.setColor(opvulkleur);
        g.drawRect(160, 40, breedte, hoogte);
        g.fillRect(160, 40, breedte, hoogte);
        g.setColor(Color.black);
        g.drawOval(160, 40, breedte, hoogte);
        g.drawString("Rechthoek met ovaal" , 160,80  );
        g.setColor(opvulkleur);
        g.drawOval(160, 90, breedte, hoogte);
        g.fillOval(160, 90, breedte, hoogte);
        g.setColor(opvulkleur);
        g.drawString("Ovaal", 170, 130);
        g.drawOval(50,140,breedte, hoogte);
        g.drawArc(50, 140, breedte, hoogte, 0, 45);
        g.fillArc(50, 140, breedte, hoogte, 0, 45);
        g.drawString("Ovaal met Taart",50, 180);
        g.drawOval(160, 140, 40, 40);
        g.setColor(lijnkleur);
        g.drawString("Cirkel", 160, 200);


    }
}