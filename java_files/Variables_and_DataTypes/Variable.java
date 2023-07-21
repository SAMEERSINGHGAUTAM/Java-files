public class Variable {
  public static void main(String args[]) {
    int a =15;
    int b= 5;
    String name = "Vivekanand";
    System.out.println("a");
    System.out.println(a);
    System.out.println(b);
    System.out.println(name);

    // changing the value of b 
    b = 20;
    System.out.println(b);
    // changing the value of a 
    a = 30;
    System.out.println("The value of a is :"+ a);
    // Assigning the value of a to b
    b = a;  // b <= a
    System.out.println("The value of b is:"+ b);
    
  }
}