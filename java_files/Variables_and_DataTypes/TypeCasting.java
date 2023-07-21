import java.util.*;

public class TypeCasting {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter an integer");
    long a = 123456789L; // 8 bytes
    float b = a;   // 4 bytes no typecasting required       [byte -> short -> int -> float -> long -> double]
    System.out.println(b);   
  }
}



/*
Widening primitive conversions do not lose information about the overall magnitude of a numeric value. Indeed, conversions widening from an integral type to another integral type do not lose any information at all; the numeric value is preserved exactly. Conversions widening from float to double in strictfp expressions also preserve the numeric value exactly; however, such conversions that are not strictfp may lose information about the overall magnitude of the converted value.

Conversion of an int or a long value to float, or of a long value to double, may result in loss of precision-that is, the result may lose some of the least significant bits of the value. In this case, the resulting floating-point value will be a correctly rounded version of the integer value, using IEEE 754 round-to-nearest mode


Just to add to this, float has a max value of approx 3E38 while int is 2147483647 for the same number of bits. If you pass this max value to an int , print it, then pass it to a float and print it again; both value might be different that is "you may lose information". long is approx 9E18.

Conclusion

Conversion of an int or a long value to float, or of a long value to double, may result in loss of precision-that is, the result may lose some of the least significant bits of the value. In this case, the resulting floating-point value will be a correctly rounded version of the integer value
 */