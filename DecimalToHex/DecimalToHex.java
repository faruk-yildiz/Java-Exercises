import java.util.*;

public class DecimalToHex {
  public static void main(String[] args) {
    System.out.println("Enter a decimal value 0-15:");
    Scanner scan=new Scanner(System.in);
    int decimal=scan.nextInt();
    if(decimal>=0 && decimal<=15)
      System.out.printf("Hex value is %x",decimal);
    else
      System.out.println("Invalid input");
  }
}
