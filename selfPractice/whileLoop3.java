// Write a program to find the factorial of any number entered by the user.

import java.util.*;

        public class whileLoop3 {
              public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a number :");
                    int num = sc.nextInt();
                    int fact = 1;
                    if(num>=0) {
                      while(num > 0) {
                        fact *= num--;
                      }
                      System.out.println("Factorial of the entered number is "+ fact);
                    } else {
                      System.out.println("Enter positive integers");
                    }
              }
        }

