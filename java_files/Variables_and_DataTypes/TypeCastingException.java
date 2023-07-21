public class TypeCastingException {
  public static void main(String args[]) {
    long a = 1234;
    float b =(float)a; // beacuse range of float is greater than long 
    System.out.println(b);
  }
}