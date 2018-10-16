import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawLine(50, 120, 270, 120);
        g.drawRect(60, 140, 210, 120);

        g.drawRoundRect(60, 280, 210, 120, 10, 10);

        g.drawOval(630, 260, 120, 120);
        g.setColor(Color.magenta);
        g.fillArc(600, 135, 200, 100, 0, 45);
        g.setColor(Color.black);
        g.drawOval(350, 140, 200, 100);

        g.setColor(Color.magenta);
        g.fillRect(350, 140, 200, 100);
        g.drawRect(350, 140, 200, 100);
        g.setColor(Color.black);
        g.drawOval(350, 140, 200, 100);
        g.setColor(Color.magenta);
        g.fillOval(350, 280, 200, 100);
        g.setColor(Color.black);
        g.drawOval(350, 280, 200, 100);

        g.drawOval(600, 135, 200, 100);
        g.drawString("lijn", 120,115);
        g.drawString("rechthoek", 120,275);
        g.drawString("afgeronde rechthoek", 120,420);
        g.drawString("gevulde rechthoek met ovaal", 350,250);
        g.drawString("gevulde ovaal", 350,420);
        g.drawString("cirkel", 650,420);
        g.drawString("taartpunt met ovaal eromheen", 600,250);

    }
}
