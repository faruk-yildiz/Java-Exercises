public class FourPatterns {
  public static void main(String[] args) {
    System.out.println("Pattern A");
    for (int i=1;i<=6;i++ ) {
      for (int j=1;j<=i;j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println("Pattern B");
    for (int k=6;k>=1;k-- ) {
      for (int l=1;l<=k;l++) {
        System.out.print(l+" ");
      }
      System.out.println();
    }
    System.out.println("Pattern C");
    for (int i=1;i<=6;i++ ) {
      for(int a=6;a>=i;a--){
          System.out.print("  ");
      }
      for (int j=i;j>=1;j--) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println("Pattern D");
    for (int i=6;i>=1;i-- ) {
      for(int a=6;a>=i;a--){
          System.out.print("  ");
      }
      for (int j=1;j<=i;j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }

  }
}
