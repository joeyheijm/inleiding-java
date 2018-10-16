package h05;
import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    int yvalerie;
    int hvalerie;
    int yhans;
    int hhans;
    int yjeroen;
    int hjeroen;


    public void init() {
        setBackground(Color.pink);
        setSize(500, 500);
        yvalerie = 100;
        hvalerie = 40;

        yhans = 65;
        hhans = 75;

        yjeroen = 45;
        hjeroen = 95;

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(120, 10, 120, 140);
        g.drawLine(120,140, 240, 140);
        g.drawString("120",90,35 );
        g.drawString("100",90,55 );
        g.drawString("80",90,75 );
        g.drawString("60",90,92 );
        g.drawString("40",90,105 );
        g.drawString("20",90,120 );
        g.drawString("0",90,140 );
        g.drawString("Valerie", 120,160);
        g.drawString("Hans", 170,160);
        g.drawString("Jeroen", 210,160);
        g.setColor(Color.red);
        g.fillRect(120, yvalerie, 40, hvalerie);
        g.drawRect(120, 100, 40, 40);
        g.setColor(Color.magenta);
        g.fillRect(160, yhans, 40, hhans);
        g.drawRect(160, 65, 40, 75);
        g.setColor(Color.orange);
        g.fillRect(200, yjeroen, 40, hjeroen);
        g.drawRect(200, 45, 40, 95);


    }








}




