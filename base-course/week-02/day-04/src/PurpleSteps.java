import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics){
        for (int i = 0; i <19 ; i++) {
            graphics.setColor(new Color(155,0 , 255));
            graphics.fillRect(10+i*10, 10+i*10, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(10+i*10, 10+i*10, 10, 10);
        }
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