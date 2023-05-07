package FunctionPrograms;
import java.util.Scanner;
public class Average {

    static double a,b,c;

     public static void main(String[] args) {
        
         getInput();
        System.out.println("Average is: " + calculateAverage(c, b, a));
        
    }

    public static void getInput() {
        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        

        scan.close();

    }

    public static Double calculateAverage(double i, double j, double k) {
        double average = (i + j + k)/3;
        return average;
    }
}