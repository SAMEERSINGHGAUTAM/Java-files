import java.util.*;

public class If_else1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextByte();
    if(age>=18) {
      System.out.println("Right to vote and Drive");
    } 
    if(age>=13 && age<18) {
      System.out.println("Teenager");
    }
    else {   // 
      System.out.println("not an adult");
    }
  }
}