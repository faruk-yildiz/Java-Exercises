
public class SmallestN {
  public static void main(String[] args) {
    int n=1;
    int smallestN=1;
    while (n*n<12000) {
      smallestN=n;
      n++;
    }
    System.out.println("Smallest n such that n^2<12000 is "+smallestN);
  }
}
