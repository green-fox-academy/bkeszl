import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics){


        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <HEIGHT ; j+=20) {
                switch (i) {
                    case 0:
                        goToC(j, 0 , graphics);
                    break;
                    case 1:
                        goToC(j,HEIGHT , graphics);
                        break;
                    case 2:
                        goToC(WIDTH, j, graphics);
                        break;
                    case 3:
                        goToC(0, j, graphics);
                        break;
                }
            }
        }

    }

    public static void goToC(int x, int y, Graphics graph) {
        graph.drawLine(x, y, WIDTH/2, HEIGHT/2);
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
