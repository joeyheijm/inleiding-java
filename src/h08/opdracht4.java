package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht4 extends Applet {
    Button Minknop;
    Button Plusknop;
    Button Gedeelddoor;
    Button Keerknop;
    TextField Tekstvak1;
    TextField Tekstvak2;
    double Getal1;
    double Getal2;

    public void init() {
        Tekstvak1 = new TextField("", 10);
        Tekstvak2 = new TextField("", 10);

        Plusknop = new Button("+");
        Plusknop.addActionListener(new PlusknopListener());
        Minknop = new Button("-");
        Minknop.addActionListener(new MinknopListener());
        Keerknop= new Button("x");
        Keerknop.addActionListener(new KeerknopListener());
        Gedeelddoor = new Button("/");
        Gedeelddoor.addActionListener(new GedeelddoorListener());
        add(Plusknop);
        add(Minknop);
        add(Keerknop);
        add(Gedeelddoor);
        add(Tekstvak1);
        add(Tekstvak2);
    }

    class PlusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String A = Tekstvak1.getText();
            Getal1 = Double.parseDouble(A);
            String B = Tekstvak2.getText();
            Getal2 = Double.parseDouble(B);
            double uitkomst = Getal1 + Getal2;
            Tekstvak1.setText(String.valueOf(uitkomst));
            Tekstvak2.setText("");
        }
    }

    class MinknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String C = Tekstvak1.getText();
            Getal1 = Double.parseDouble(C);
            String D = Tekstvak2.getText();
            Getal2 = Double.parseDouble(D);
            double uitkomst = Getal1 - Getal2;
            Tekstvak1.setText(String.valueOf(uitkomst));
            Tekstvak2.setText("");
        }

    }
    class GedeelddoorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String E = Tekstvak1.getText();
            Getal1 = Double.parseDouble(E);
            String F = Tekstvak2.getText();
            Getal2 = Double.parseDouble(F);
            double uitkomst = Getal1 / Getal2;
            Tekstvak1.setText(String.valueOf(uitkomst));
            Tekstvak2.setText("");
        }

    }
    class KeerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String G = Tekstvak1.getText();
            Getal1 = Double.parseDouble(G);
            String H = Tekstvak2.getText();
            Getal2 = Double.parseDouble(H);
            double uitkomst = Getal1 * Getal2;
            Tekstvak1.setText(String.valueOf(uitkomst));
            Tekstvak2.setText("");
        }

    }




}