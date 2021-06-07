import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int sideLength = 40;
        for (int i = 0; i < WIDTH / sideLength; i++) {

            for (int j = WIDTH / sideLength - i; j < WIDTH / sideLength; j++) {
                drawTriangle(((i * sideLength) + (j * (sideLength / 2))) - WIDTH / 2, (j * sideLength) - (j * (sideLength - (int) Math.sqrt((sideLength * sideLength) - ((sideLength / 2) * (sideLength / 2))))), sideLength, graphics);
            }
        }
    }

    public static void drawTriangle(int x, int y, int sideLength, Graphics graph) {
        graph.drawLine(x, y, x + sideLength, y);
        int highPoint = (sideLength * sideLength) - ((sideLength / 2) * (sideLength / 2));
        graph.drawLine(x + sideLength, y, x + (sideLength / 2), y - ((int) Math.sqrt(highPoint)));
        graph.drawLine(x + (sideLength / 2), y - (int) (Math.sqrt(highPoint)), x, y);
    }

    // Don't touch the code below
    //region Drawing boilerplate
    static int WIDTH = 320;
    static int HEIGHT = 320;


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
    //endregion
}