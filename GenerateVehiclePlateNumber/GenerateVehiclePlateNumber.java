
public class GenerateVehiclePlateNumber {
  public static void main(String[] args) {
      int fourDigits=1000+(int)(Math.random()*9000);
      int letter1=65+(int)(Math.random()*26);
      int letter2=65+(int)(Math.random()*26);
      int letter3=65+(int)(Math.random()*26);
      System.out.printf("Your vehicle plate number is %c%c%c-%d",letter1,letter2,letter3,fourDigits);
  }
}
