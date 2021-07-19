
public class RandomPointsInRectangle{
  public static void main(String[] args) {
    int x=(int)(Math.random()*99)-49;
    int y=(int)(Math.random()*199)-99;

    System.out.printf("The rectangle is centered at (0,0) with width 100 and height 200.\nRandom points in that rectangle (%d,%d)",x,y);
  }
}
