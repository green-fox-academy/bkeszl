import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){


        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <HEIGHT ; j+=20) {
                if (j==0){
                    assert true;
                } else {
                    switch (i) {
                        case 0:
                            graphics.setColor(Color.BLUE);
                            drawline(j, 0, graphics);
                            break;
                        case 1:
                            graphics.setColor(Color.GREEN);
                            drawline(j, HEIGHT, graphics);
                            break;
                    }
                }
            }
        }

    }

    public static void drawline(int x, int y, Graphics graph) {
        graph.drawLine(x, y, WIDTH-y, x);
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