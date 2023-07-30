 // Reverse the given number

 import java.util.*;

        public class Practice46 {
            public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number");
                    int num = sc.nextInt(), i = num;

                            for( num = 0 ; i>0 ; i/=10 ) {
                                    num = num*10 + i%10 ;
                            }
                    System.out.println(num);
            }
        }