public class TypeConversionChar {
  public static void main(String args[]) {
    char a ='a';
    int num = a;
    System.out.println("character literal 'a' in (int) is "+num);
    float num1 = a;
    System.out.println("character literal 'a' in (float) is "+num1);
    short num2 = (short)a; 
    System.out.println("character literal 'a' in (short) is "+num2);
    byte num3 = (byte)a;
    System.out.println("character literal 'a' in (byte) is "+num3);
    long num4 = a;
    System.out.println("character literal 'a' in (long) is "+num4);
    double num5 = a;
    System.out.println("character literal 'a' in (double) is "+num5);
  }
}