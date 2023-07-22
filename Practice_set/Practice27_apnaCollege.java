// Conditional Statements - (if, else)
import java.util.*;

public class Practice27_apnaCollege {
  public static void main(String args[]) {
      System.out.println("Enter your age:");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();

      if(age>=18) {
        System.out.println("Adult");  // Condition - true (execute)
      }

      if(age>=13 && age<18) {
        System.out.println("Teenager");
      } 
      
      else {
        System.out.println("Child");      // execute
      }

  }
}