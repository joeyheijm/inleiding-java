package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    TextField tekstvak;
    Label label;
    String s;
    double btw;
    double getal;


    public void init() {

        tekstvak = new TextField("klik op mij", 20);
        label = new Label("type een getal in het tekst vakje" + " en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        s = "";
        btw = 1.21;

    }

    public void paint(Graphics g) {

        g.drawString("" + getal * btw, 50, 80);


    }


    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal = Double.parseDouble(tekstvak.getText());

            repaint();
        }
    }
}












