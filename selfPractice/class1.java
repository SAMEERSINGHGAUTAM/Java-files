// Multiplication table

import java.util.*;

    public class class1 {
        protected static void multiplicationTable(int num) {
            int i = 1;
            while(i <= 10) {
            System.out.println(num +" * "+i+" = "+(num*i++));
            }
        }
        public static void main(String multi[]) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            multiplicationTable(n);
        }

    }