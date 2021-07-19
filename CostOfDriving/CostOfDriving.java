import java.util.*;

public class CostOfDriving{
  public static void main(String[] args) {
    System.out.println("Enter the driving distance:");
    Scanner scan=new Scanner(System.in);
    double distance=scan.nextDouble();
    System.out.println("Enter miles per gallon:");
    double milesPerGallon=scan.nextDouble();
    System.out.println("Enter price per gallon:");
    double pricePerGallon=scan.nextDouble();
    double costOfDriving=(distance/milesPerGallon)*pricePerGallon;
    System.out.printf("The cost of driving is $%.2f",costOfDriving);
  }
}
