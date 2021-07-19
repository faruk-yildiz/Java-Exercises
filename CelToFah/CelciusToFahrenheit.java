import java.util.Scanner;

public class CelciusToFahrenheit{
  public static void main(String[] args) {
    System.out.println("Enter a degree in Celcius:");
    Scanner scan= new Scanner(System.in);
    double celcius=scan.nextDouble();
    //Fahrenheit=(9 / 5)*Celcius+32
    double fahrenheit=(9.0/5)*celcius+32;
    System.out.println(celcius+" Celcius is "+fahrenheit+" Fahrenheit");
  }
}
