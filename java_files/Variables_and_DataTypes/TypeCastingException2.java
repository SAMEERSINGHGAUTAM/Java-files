public class TypeCastingException2 {
  public static void main(String args[]) {
     long a = 123L;  // 8 bytes
     double b = a;  // 8 bytes    not a exception [long -> double]
     System.out.println(b);
  }
}