import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard  {
    public static void mainDraw(Graphics graphics){
        int allMarks = 0;
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if (allMarks % 2 == 0) {
                 graphics.setColor(Color.WHITE);
                } else {
                    graphics.setColor(Color.BLACK);
                }
                graphics.fillRect((WIDTH/8)*j, (HEIGHT/8)*i, WIDTH/8, HEIGHT/8 );
                allMarks++;
            }

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