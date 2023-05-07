package FunctionPrograms;
import java.util.Scanner;

public class NumberComparison {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int a = scan.nextInt();
         int b = scan.nextInt();
         scan.close();

        if(a == b){
            System.out.println(a + " is equal to " + b);
            return;
        }
         System.out.println(Math.max(a, b) + " is greater than " + Math.min(a, b));

    }

}
