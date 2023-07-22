// Assignment Operators (*=) and (/=)

public class Practice24 {
  public static void main(String args[]) {
    int A = 5 , B = 5;

    System.out.println("Value of A = "+A+"\nValue of B = "+B);
    A = A / 5 ;
    System.out.println("\nA = A / 5\nA = "+A);
    B /= 5;
    System.out.println("\nB /= 5\nB = "+B);

    A = A * 5 ;
    System.out.println("\nA = A * 5\nA = "+A);
    B *= 5 ;
    System.out.println("\nB *= 5\nB = "+ B);
  }
}