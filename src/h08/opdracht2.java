package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2 extends Applet {

    Button Mannen;
    Button Vrouwen;
    Button Jongens;
    Button Meisjes;

  int mannenteller;
int vrouwenteller;
int jongensteller;
int meisjesteller;
int totaal;

    public void init() {
        setSize(800, 600);
        KnopListener kl = new KnopListener();

        Mannen = new Button("Mannen");
        Mannen.addActionListener(kl);
        Vrouwen= new Button("Vrouwen");
        Vrouwen.addActionListener(new Vrouw());
        Jongens = new Button("Jongens");
        Jongens.addActionListener(new Man2());
        Meisjes = new Button("Meisjes");
        Meisjes.addActionListener(new Vrouw2());
        mannenteller = 0;
        vrouwenteller =0;
        jongensteller = 0;
        meisjesteller = 0;
        add(Mannen);
        add(Vrouwen);
        add(Jongens);
        add(Meisjes);


    }


    public void paint(Graphics g) {
        g.drawString("Aantal Mannen  " + mannenteller, 20, 50);
        g.drawString("aantal Vrouwen  " + vrouwenteller, 20, 65);
        g.drawString("aantal mannelijke potentiële studenten  " + jongensteller, 20, 80);
        g.drawString("aantal vrouwelijke potentiële stundenten  " + meisjesteller, 20, 95);
        g.drawString("Totaal  " + totaal , 20, 110);
        totaal= mannenteller + vrouwenteller + jongensteller + meisjesteller;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannenteller++;
            totaal++;
            repaint();

        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenteller++;
            totaal++;
            repaint();
        }
    }

    class Man2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            jongensteller++;
            totaal++;
            repaint();
        }
    }

    class Vrouw2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            meisjesteller++;
            totaal++;
            repaint();

        }
    }


}


























