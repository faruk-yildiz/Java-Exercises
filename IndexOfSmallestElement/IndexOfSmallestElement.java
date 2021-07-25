import java.util.*;

public class IndexOfSmallestElement {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double [] array=new double[10];
    System.out.println("Enter 10 double values");
    for (int i=0;i<array.length;i++)
    {
        array[i]=scan.nextDouble();
    }
    int minIndex=smallestElementIndex(array);
    System.out.println("Min value "+array[minIndex]+" index is "+ minIndex);
  }
  public static int smallestElementIndex(double [] array )
  {
    double min=array[0];
    int minIndex=0;
    for (int i=0;i<array.length;i++)
    {
      if(array[i]<min)
      {
        min=array[i];
        minIndex=i;
      }
    }
    return minIndex;
  }
}
