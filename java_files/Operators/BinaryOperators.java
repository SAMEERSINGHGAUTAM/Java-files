import java.util.*;

public class BinaryOperators {
  public static void main(String args[]) {
    char a = 'a';
    char b = 'b';
    int A = a;
    int B = b;

    System.out.println("Add = " + (A+B));
    System.out.println("Subtract = " + (A-B));
    System.out.println("Multiply = " + (A*B));
    System.out.println("Division of " + A +"/" +B +"=" + (A/B)+"\nDivision of " + B+"/"+A+"="+(B/A));
    System.out.println(A + "%" + B + "= "+(A%B)+"\n"+B+"%"+A+"= "+(B%A));

  }
}