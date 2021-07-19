import java.util.*;

public class RunwayLength{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter take of speed and acceleration:");
    double takeOfSpeed=scan.nextDouble();
    double acceleration=scan.nextDouble();
    //lenght=v*v/2a
    double runwayLength=(takeOfSpeed*takeOfSpeed)/(2*acceleration);
    System.out.printf("The minimum runway lenght for this airplane is %.3f",runwayLength);
  }
}
