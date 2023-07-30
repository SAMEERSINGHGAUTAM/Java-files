// Print reverse of a number
// number = 0 -> 10*number + number

import java.util.*;

    public class Practice45 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

//                Note - num; is not a statement
                    for(int num = sc.nextInt(); num >= 1  ; num/=10 ) {
                          System.out.print(num%10);
                    }
           System.out.println();
        }
    }