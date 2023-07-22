public class TypeCastingException3 {
  public static void main(String args[]) {
  double a = 123.45;
  long b = (long) a;  // no exception
  System.out.println(b);
  }
 }