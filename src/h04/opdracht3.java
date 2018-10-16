import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.setColor(Color.red);
         g.fillRect(50, 70, 250, 30);
        g.drawRect(50, 40, 250, 30);
        g.setColor(Color.white);
        g.fillRect(50, 70, 250, 30);
        g.drawRect(50, 70, 250, 30);
        g.setColor(Color.blue);
        g.fillRect(50, 100, 250, 30);
        g.drawRect(50, 100, 250, 30);
        g.setColor(Color.blue);
        g.drawLine(300, 300, 300, 120);




    }
}
