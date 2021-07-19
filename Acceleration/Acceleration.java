import java.util.*;

public class Acceleration{
  public static void main(String[] args) {
    System.out.println("Enter v0,v1 and t:");
    Scanner scan=new Scanner(System.in);
    double v0=scan.nextDouble();
    double v1=scan.nextDouble();
    double time=scan.nextDouble();
    //Acceleration=(v1-v0)/t
    double acceleration=(v1-v0)/time;
    System.out.printf("The average acceleration is %f",acceleration);
  }
}
