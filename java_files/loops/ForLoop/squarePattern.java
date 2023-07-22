import java.util.*;

public class squarePattern {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int i = 0, count = 0; 
    while(i<=n) {
      
      if(i==n) {
         System.out.print("\n");
         i = 0;
         count++;
       } else {
         System.out.print("* ");
         i +=1;
       }
      
      if(count == n) {
        break;
      }
      
    }
  }
}