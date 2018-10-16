package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {

    private int getal;
    TextField tekstvak;
    Label label;
    String tekst;
    String tekst2;


    private int grootstegetal;
    private int kleinste;



    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        tekst2 = "";
        grootstegetal = Integer.MIN_VALUE;
        kleinste = Integer.MAX_VALUE;

        label = new Label("voer een getal in" );

        add( label );
        add( tekstvak );
    }

    public void paint (Graphics g) {
        g.drawString(tekst, 50,45 );
        g.drawString(tekst2, 50,60 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > grootstegetal) {
                grootstegetal = getal;
                tekst = "Het hoogste getal = " + grootstegetal;
                repaint();
            }
            if ( getal < kleinste )
                kleinste = getal;
            tekst2 = "Het laagste getal = " + kleinste;
            repaint();
        }

    }

}

