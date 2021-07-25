import java.util.*;

public class ReverseAnArray {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int [] array=new int[10];
    System.out.println("Enter 10 integer");
    for (int i=0;i<array.length;i++)
    {
        array[i]=scan.nextInt();
    }
    System.out.println("Original array is "+Arrays.toString(array));
    System.out.println("Reversed array is "+Arrays.toString(reverse(array)));
  }
  public static int [] reverse(int [] array)
  {
    int [] arrayNew=new int[array.length];
    for (int i=0;i<array.length;i++)
    {
        arrayNew[i]=array[array.length-(i+1)];
    }
    return arrayNew;
  }
}
