import java.util.*;

public class VolumeOfCylinder{
  public static void main(String[] args) {

    final double PI=3.1415926535;
    System.out.println("Enter the radius and length of a cylinder:");
    Scanner scan=new Scanner(System.in);
    double radius=scan.nextDouble();
    double length=scan.nextDouble();
    //area=radius*radius* π
    //volume=area*length
    double area=radius*radius*PI;
    double volume=area*length;
    System.out.printf("The area is %f \nThe volume is %f",area,volume);
  }
}
