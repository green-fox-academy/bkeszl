import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        for (int i = 0; i < 50 ; i++) {
            Random randomGenerator = new Random();
            int rand1 = randomGenerator.nextInt(WIDTH);
            int rand2 = randomGenerator.nextInt(HEIGHT);
            graphics.setColor(Color.WHITE);
            graphics.fillRect(rand1,rand2, 10, 10);
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
