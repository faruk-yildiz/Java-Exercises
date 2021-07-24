import java.util.*;

public class ReverseOfTheOrder {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int [] numbers1=new int[10];
    int [] numbers2=new int[10];
    for (int i=0;i<10;i++) {
      numbers2[numbers2.length-(i+1)]=numbers1[i]=scan.nextInt();
    }
    System.out.println("Original array "+Arrays.toString(numbers1));
    System.out.println("Reversed array "+Arrays.toString(numbers2));
  }
}
