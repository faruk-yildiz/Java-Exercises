import java.util.*;

public class CalculatingEnergy{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the amount of water in kilograms:");
    double kilogram=scan.nextDouble();
    System.out.println("Enter the initial temperature:");
    double initialTemperature=scan.nextDouble();
    System.out.println("Enter the final temperature:");
    double finalTemperature=scan.nextDouble();
    //Q=M*(final temperature-initial temperature)*4184
    double q=kilogram*(finalTemperature-initialTemperature)*4184;
    System.out.printf("The energy needed is %.3f",q);
  }
}
