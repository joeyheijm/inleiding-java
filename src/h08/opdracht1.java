package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1 extends Applet {

    TextField tekstvak;
    Button knop;
    Button knop2;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        knop2 = new Button("Reset");
        knop2.addActionListener( new ResetListener() );
        add(tekstvak);
        add(knop);
        add(knop2);

    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );

    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();

        }
    }

    class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();

        }
    }












}
