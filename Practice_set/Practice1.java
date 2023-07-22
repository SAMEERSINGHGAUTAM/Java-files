// Unary Opeartors

import java.util.*;

public class Practice1 {
     public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("Vlaues are:");
      System.out.println("Value of ++n: "+ ++n);
      System.out.println("Value of n : "+ n + "\nValue of n++: "+n++);
      System.out.println("Value of n: "+ n+ "\nValue of --n: "+ --n);
      System.out.println("Value of n: "+ n +"\nValue of n-- :"+ n-- + "\nValue of n: "+n);

      System.out.println(n++ == 1);
     }
}