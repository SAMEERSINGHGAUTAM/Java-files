// Check if a number is prime or not
// self-try
import java.util.*;

  public class Practice50 {
        public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        float a = (float)Math.sqrt(num); // decimal value required just to satisfy (a>1)
//         int i = 0;
        if(a>1) {
           int i = 0;
           for(i = (int)a ; i > 1 ; i--) {
              if(num % i == 0) {
               System.out.println("not prime");
               break;
              }
           }
         if(i==1) {
         System.out.println("prime");
         }
        } else {
          System.out.println("not prime");
        }

      }
  }