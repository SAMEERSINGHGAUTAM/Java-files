// (Conditional Statements)Leap year

import java.util.*;

public class Practice42_apnaCollege {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();
    
    boolean x = year % 4 == 0;  // x -> true  (jaroori nhi jo 4 se divisible ho wo leap year ho but it is a neccessary condition)
    boolean y = year % 100 != 0; // y -> false 
    boolean z = (year % 100 == 0) && (year % 400 == 0); // true && false -> false

    if(x && (y || z)) {
      System.out.println("Leap year");
    } else {
      System.out.println("not a leap year");
    }
  }
}