// keep entering numbers till(in negative sense for next sentence) user enters a multiple of 10(jab tak koi number multiple of 10 nhi hai tab tak number ko input lo)
import java.util.*;

public class break1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int counter=1;

    do {
      int n = sc.nextInt();
      if(n%10 == 0) {
        break;
      }
      System.out.println(n);
    } while(true);
    
    
    System.out.println("You are out of the loop.");
  }
}