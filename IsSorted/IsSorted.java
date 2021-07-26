import java.util.*;

public class IsSorted {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the size of the list:");
    int size=scan.nextInt();
    int [] list=new int[size];
    System.out.println("Enter the contents of the list:");
    for (int i=0;i<size;i++)
    {
      list[i]=scan.nextInt();
    }
    System.out.println(Arrays.toString(list) +" "+(isSorted(list)?"is already sorted":"is not sorted"));
  }
  public static boolean isSorted(int [] list)
  {
    int i=0;
    while (i<list.length-1)
    {
      if(list[i]>list[i+1])
        return false;
      i++;
    }
    return true;
  }
}
