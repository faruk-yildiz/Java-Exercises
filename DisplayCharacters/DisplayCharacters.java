import java.util.*;

public class DisplayCharacters {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two character char1-char2:");
    char ch1=scan.next().charAt(0);
    char ch2=scan.next().charAt(0);
    System.out.println("Enter number of chars per line ");
    int numberOfLines=scan.nextInt();
    printChars(ch1, ch2, numberOfLines);
  }

  public static void printChars(char ch1,char ch2,int numberOfLines)
  {
    int count=0;
    char temp;
    if(ch1>ch2)
    {
      temp=ch2;
      ch2=ch1;
      ch1=temp;
    }
    for(int i=ch1;i<=ch2;i++){
      if(count%numberOfLines==0)
      {
        System.out.printf("\n %5c",i);
        count++;
      }
      else
      {
        System.out.printf("%5c",i);
        count++;
      }
    }
  }
}
