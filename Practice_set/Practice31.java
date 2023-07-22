// Conditional Statements (else-if)
import java.util.*;
public class Practice31 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your income:");
    int income = sc.nextInt();
    float tax = 0;
    if(income < 0.5E6) {
        tax = 0;
    } else if(income >= 0.5E6 && income <= 0.1E7) {
        tax = (income*0.2f);
    } else {
        tax = (income*0.3f);
    }

    
    System.out.println("Income tax = "+(int)(tax));
  }
}