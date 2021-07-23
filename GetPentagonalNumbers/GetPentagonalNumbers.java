
public class GetPentagonalNumbers {
  public static void main(String[] args) {
    int count=0;
    for(int i=1;i<=100;i++)
    {
      if(count%10==0){
        System.out.printf(" \n %7d",getPentagonalNumbers(i));
        count++;
      }
      else
      {
        System.out.printf("%7d",getPentagonalNumbers(i));
        count++;
      }
    }
  }
  public static int getPentagonalNumbers(int n)
  {
    return (n*(3*n-1))/2;
  }
}
