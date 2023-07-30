// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

        public class doWhileLoop1 {
             public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a number");
                    int num = sc.nextInt();
                    int i = 1 ;
                        do {
                        System.out.print(num*i++ + "\t");
                        } while(i <= 10) ;
                    System.out.println();
             }
        }