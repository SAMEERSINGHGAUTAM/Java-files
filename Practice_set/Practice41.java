// Leap Year

import java.util.*;

public class Practice41 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year");

    int year = sc.nextInt();
    // if(year%4==0) {
    //   if(year%100==0) {
    //     if(year%400==0) {
    //       System.out.println("Leap year");
    //     } else {
    //       System.out.println("Not a leap year");
    //     }
    //   } else {
    //     System.out.println("leap year");
    //   }
    // } else {
    //   System.out.println("Not a leap year");
    // }
    if((year%100==0)?(year%400==0):(year%4==0)) { // ((year%4==0) && (year%100!=0) || (year%400==0))
      System.out.println("Leap year");
    } else {
      System.out.println("Not a leap year");
    }
  }
}