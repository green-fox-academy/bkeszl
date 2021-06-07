package postit;

import java.awt.Color;

public class PostIt {
  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt(Color backgroundColor, Color textColor, String text) {
  this.backgroundColor = backgroundColor;
  this.textColor = textColor;
  this.text = text;
  }

  public static void main(String[] args) {
    PostIt orange = new PostIt(Color.ORANGE,Color.BLUE,"Idea1" );
    PostIt black = new PostIt(Color.BLACK,Color.BLACK,"Awesome" );
    PostIt yellow = new PostIt(Color.YELLOW,Color.GREEN,"Superb!" );
  }
}