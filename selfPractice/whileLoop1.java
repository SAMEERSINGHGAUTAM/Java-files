//program to print all natural numbers from 1 to n

import java.util.*;

        public class whileLoop1 {
                public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

                int num = sc.nextInt();

                    int i = 1;
                    while(i <= num) {
                         System.out.print(i++ +" ");
                    }
                System.out.println();

                }
        }