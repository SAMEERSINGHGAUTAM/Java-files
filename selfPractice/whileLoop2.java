//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;

    public class whileLoop2 {
            public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    int num = 0, sum1 = 0, sum2 = 0, choice = 1;
                        while(choice == 1) {
                            System.out.println("Enter an integer : ");
                            num = sc.nextInt();
//                             boolean type = (num % 2 == 0) ;
//                              type ? sum1+=num : sum2+=num; -> We cannot use expressions in ternary operator.
                                if(num % 2 == 0) {
                                    sum1 += num ;
                                } else {
                                    sum2 += num ;
                                }
                            System.out.println("Do you  want to continue ? If yes -> 1 and for no -> 0");
                            choice = sc.nextInt();
                        }
                    System.out.println("Sum of even integers : "+ sum1);
                    System.out.println("Sum of odd integers : "+ sum2);
            }

    }