import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){
        for (int i = 0; i <4 ; i++) {
            int consRandom = new Random().nextInt(255);
            int cons2Random = new Random().nextInt(40);
            graphics.setColor( new Color(consRandom,cons2Random,consRandom)) ;
            graphics.fillRect( 35+(i*60), WIDTH/2-5, 15+cons2Random, 15+cons2Random);
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
