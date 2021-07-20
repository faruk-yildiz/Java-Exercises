
public class NumbersDivisibleBy5and6 {
  public static void main(String[] args) {
    int count=1;
    boolean isDivisible=false;
      for (int i=100;i<=1000;i++) {
        if(i%5==0 && i%6==0){
          if(count%10==0){
            System.out.println(i);
            count++;
          }
          else{
            System.out.print(i+" ");
            count++;
          }
        }
      }
  }
}
