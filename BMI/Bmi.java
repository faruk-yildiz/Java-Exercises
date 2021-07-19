import java.util.*;

public class Bmi{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter weight in kilograms:");
    double kilogram=scan.nextDouble();
    System.out.println("Enter height in meters:");
    double meter=scan.nextDouble();
    //BMI=weight/(height*height);
    double bmi=kilogram/(meter*meter);
    System.out.printf("BMI is %.2f",bmi);
  }
}
