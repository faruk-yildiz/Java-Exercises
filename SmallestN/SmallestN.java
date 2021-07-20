
public class SmallestN {
  public static void main(String[] args) {
    int n=1;
    while (n*n<12000) {
      n++;
    }
    System.out.println("Smallest n such that n^2>12000 is "+n);
  }
}
