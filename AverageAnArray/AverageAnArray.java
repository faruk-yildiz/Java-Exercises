import java.util.*;

public class AverageAnArray {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 10 integer");
    int [] array1=new int[10];
    double [] array2=new double[10];
    for(int i=0;i<array1.length;i++)
      array1[i]=scan.nextInt();
    System.out.println("Average "+average(array1));
    System.out.println("Enter 10 double value");
    for(int i=0;i<array2.length;i++)
      array2[i]=scan.nextDouble();
    System.out.println("Average "+average(array2));
  }
  public static double average(int [] array)
  {
    double average=0.0;
    int sum=0;
    for (int i=0;i<array.length;i++) {
      sum+=array[i];
    }
    average=sum/(double)array.length;
    return average;
  }
  public static double average(double [] array)
  {
    double average=0.0;
    double sum=0.0;
    for (int i=0;i<array.length;i++) {
      sum+=array[i];
    }
    average=sum/array.length;
    return average;
  }

}
