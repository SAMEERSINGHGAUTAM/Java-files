// Logical Operators (Logical OR) 

public class Practice20 {
  public static void main(String args[]) {
    //  Statement1- (3<2)[false] and Statement2- (5<0)[false]
    System.out.println( (3<2) || (5<0) );
    // Statement1 - (3>2)[true] and Statement2 - (5<0)[false]
    System.out.println( (3>2) || (5<0) );
    // Statement1 - (3<2)[false] and Statement2 - (5>0)[true]
    System.out.println( (3<2) || (5>0) );
    // Statement1 - (3>2)[true] and Statement2 - (5>0)[true]
    System.out.println( (3>2) || (5>0) );
  }
} 