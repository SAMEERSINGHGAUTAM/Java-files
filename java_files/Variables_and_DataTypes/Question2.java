import java.util.*;

public class Question2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the cost of the pencil:");
    float pencil = sc.nextFloat();
    System.out.println("Enter the cost of the pen:");
    float pen = sc.nextFloat();
    System.out.println("Enter the cost of the eraser:");
    float eraser = sc.nextFloat();
    float Tcost = (pencil+pen+eraser);
    float gst = Tcost*0.18f;
    System.out.println("Total gst: "+gst);
    System.out.println("Cost of three items: "+Tcost);
    System.out.println("Total cost of the items: "+(Tcost+gst));
  } 
}