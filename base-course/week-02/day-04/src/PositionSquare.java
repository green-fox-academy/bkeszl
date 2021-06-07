import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLUE);
        for (int i = 0; i <3 ; i++) {
            square( 85, 30 + i*75, graphics);
        }

    }

    public static void square(int x, int y, Graphics graph) {
        graph.fillRect(x, y, 50, 50);
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
