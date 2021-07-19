import java.util.*;

public class PoundToKilogram{
  public static void main(String[] args) {
      System.out.println("Enter a number in pounds:");
      Scanner scan=new Scanner(System.in);
      double pound=scan.nextDouble();
      //One pound is 0.45359237 kilogram
      double kilogram=pound*0.45359237;
      System.out.printf("%.3f pound is %.3f kilogram",pound,kilogram);
  }
}
