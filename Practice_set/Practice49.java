// Display all numbers entered by user except multiples of 10 where number must be less than 1000.

import java.util.*;

        public class Practice49 {
                public static void main(String args[]) {
                  Scanner sc = new Scanner(System.in);
                        int num = 0;
                do {
                   System.out.print("enter the number ");
                   num  = sc.nextInt();
                   if(num % 10 == 0) {
                     continue ;
                   }
                System.out.println("Number is "+num);
                } while(num < 1000); // to use a variable in the condition, it must be declared outside the loop.


                  }

        }