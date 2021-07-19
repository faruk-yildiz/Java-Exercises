import java.util.*;

public class RockPaperScissor{
  public static void main(String[] args) {
    int computer=(int)(Math.random()*3);
    System.out.println("Rock(0) Paper(1) Scissor(2):");
    Scanner scan=new Scanner(System.in);
    int user=scan.nextInt();
    switch (computer) {
      case 0:
        if(user==0)
          System.out.println("The computer is rock you are rock too!");
        else if(user==1)
          System.out.println("The computer is rock you are paper,you won!");
        else if(user==2)
          System.out.println("The computer is rock you are scissor,you lost!");
      break;
      case 1:
        if(user==0)
          System.out.println("The computer is paper you are rock,you lost");
        else if(user==1)
          System.out.println("The computer is paper you are paper too!");
        else if(user==2)
          System.out.println("The computer is paper you are scissor,you won!");
      break;
      case 2:
        if(user==0)
          System.out.println("The computer is scissor you are rock,you won!");
        else if(user==1)
          System.out.println("The computer is scissor you are paper,you lost!");
        else if(user==2)
          System.out.println("The computer is scissor you are scissor too!");
      break;
    }
  }
}
