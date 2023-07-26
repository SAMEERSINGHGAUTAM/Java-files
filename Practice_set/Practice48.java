// Question - Keep Entering numbers till user enters a multiple of 10

import java.util.*;

        public class Practice48 {
                public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    for(int i = 1 ; i>=1 ; i++) {
                    System.out.println("Enter the " +i+" number");
                            int num = sc.nextInt();
                                if(num % 10 == 0) {
                                 break;
                                } else {
                                 System.out.println(num);
                                }
                    }
                System.out.println("You have entered the multiple of 10");
                }
        }