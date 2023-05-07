package FunctionPrograms;
import java.util.Scanner;

public class Circumference {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Radius: ");
        double r = scan.nextDouble();
        System.out.println("Circumference of Circle is: " + calCircumference(r));
        scan.close();
    }

    private static double calCircumference(double radius) {
        return (2 * 3.14 * radius);
    }
}
