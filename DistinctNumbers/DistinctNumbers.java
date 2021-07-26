import java.util.*;

public class DistinctNumbers {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int [] numbers=new int[10];
    System.out.println("Enter 10 numbers:");
    int input;
    int count=0;
    for (int i=0;i<10;i++)
    {
      input=scan.nextInt();
      if(isDistinct(numbers, input))
      {
        numbers[count]=input;
        count++;
      }
    }
    System.out.print("Distinct numbers are ");
    for (int i=0;i<numbers.length;i++) {
      if(numbers[i]>0)
        System.out.print(numbers[i]+" ");  
    }

  }
  public static boolean isDistinct(int [] numbers ,int input)
  {
    for (int i=0;i<numbers.length;i++)
    {
      if(input==numbers[i])
       return false;
    }
    return true;
  }
}
