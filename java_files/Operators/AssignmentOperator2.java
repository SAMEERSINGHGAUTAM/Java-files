public class AssignmentOperator2 {
  public static void main(String args[]) {
    int A = 10, B = 5 , C = 9;

    System.out.println("Value of A: "+ A);
    // A = A * 10; 
    A *= 10;
    System.out.println("A = A * 10 so A equals "+ A);
    System.out.println("value of B: "+B);
    // B = B / 5;
    B /= 5;
    System.out.println("B = B / 5 so B equals "+ B);

    System.out.println("value of C: "+C);
    // C = C % 3;
    C %= 3;
    System.out.println("C = C % 3 so C equals "+ C);
  }
}