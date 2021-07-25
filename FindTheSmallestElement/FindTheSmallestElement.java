import java.util.*;

public class FindTheSmallestElement {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double [] array=new double[10];
    System.out.println("Enter 10 double values");
    for (int i=0;i<array.length;i++)
    {
        array[i]=scan.nextDouble();
    }
    System.out.println("Min value "+smallestElement(array));
  }
  public static double smallestElement(double [] array )
  {
    double min=array[0];
    for (int i=0;i<array.length;i++)
    {
      if(array[i]<min)
        min=array[i];
    }
    return min;
  }
}
