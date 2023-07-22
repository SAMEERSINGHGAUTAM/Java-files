import java.util.*;

public class Whileloop2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enyer the value");
    int number = sc.nextInt();
    
    int counter = 1;
     while(counter <= number) {
      System.out.print(counter + " ");
  
      counter++;
     }
     System.out.print("\n");

  }
}