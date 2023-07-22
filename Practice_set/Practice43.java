// Loops (Print numbers from 1 to 10)

public class Practice43 {
  public static void main(String args[]) {
    int counter = 1;

    while(counter <= 10) {
      System.out.print(counter++ +" "); // counter++ means first use the value of counter and then 
    }                                    // increase the value of the counter.
    System.out.print("\n");
  }
}