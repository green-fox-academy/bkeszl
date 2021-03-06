import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics){

        for (int i = 0; i <5 ; i++) {
            line( 85, 30 + i*30, graphics);
        }

    }

    public static void line(int x, int y, Graphics graph) {
        graph.drawLine(x, y, x+50, y);
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
