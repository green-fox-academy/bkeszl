import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
    public static void mainDraw(Graphics graphics){
        for (int i = 0; i <HEIGHT ; i+=10) {
            Color fillColor = new Color((int)(Math.random() * 0x1000000));
            boxes( HEIGHT-i,fillColor, graphics);
        }
    }
    public static void boxes(int inSize,Color inColor, Graphics graph) {
        graph.setColor(inColor);
        graph.fillRect(WIDTH/2-(inSize/2), HEIGHT/2-(inSize/2), inSize, inSize);
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