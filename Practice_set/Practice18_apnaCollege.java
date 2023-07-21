// Value of tip after executing the following code 

public class Practice18_apnaCollege {
  public static void main(String args[]) {
    int meal = 5;
    int tip = 2;
    int total = meal + (meal>6 ? ++tip : --tip); // The value of tip is 1.
    System.out.println("Value of tip : "+tip);
    System.out.println("Value of total : "+total);
  }
}
