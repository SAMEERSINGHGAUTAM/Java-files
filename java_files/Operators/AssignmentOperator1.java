public class AssignmentOperator1 {
  public static void main(String args[]) {
    int A=10;
    int B=5;

    A = B;
    System.out.println(A);
    A = 10;
    System.out.println("Value of A: "+A);
    A +=10; // A = A + 10;
    System.out.println("A = A+10 so A equals "+ A);
    
    // B = B - 5;
    System.out.println("value of B: "+B);
    B -= 5;
    System.out.println("B = B-5 so B equals "+B);
    
  }
}