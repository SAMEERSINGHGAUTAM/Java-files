// Check if a number is prime or not.

import java.util.*;

   public class Practice51_apnaCollege {
        public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
            boolean isPrime = true ;
           System.out.println("Enter the number :");
           int num = sc.nextInt();
                   if(num <= 1) {
                      System.out.println("not prime");
                   } else {
                              for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
                                if(num % i == 0) {
                                    isPrime = false;
                                }
                              }
                             if(isPrime==true) {
                                  System.out.println("prime");
                             } else {
                                  System.out.println("not prime");
                             }
                   }
        }
   }