import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.pink);
        g.drawLine(50, -120, 270, 120);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 270, -120);
        g.drawRect(80, 120, 160, 100);
        g.drawRect(150, 170, 30, 50);
        g.drawOval(152, 185, 10, 10);
        g.drawRect(200, 170, 20, 20);

    }
}
