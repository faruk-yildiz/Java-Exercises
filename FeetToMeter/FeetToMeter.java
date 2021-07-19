import java.util.*;

public class FeetToMeter{
  public static void main(String[] args) {
    System.out.println("Enter a value for feet");
    Scanner scan=new Scanner(System.in);
    double feet=scan.nextDouble();
    //One foot is 0.3048 meters
    double meter=feet*0.3048;
    System.out.println(feet+" Feet is "+meter+" meters");
  }
}
