package FunctionPrograms;
import java.util.Scanner;

public class FibonacciSeries {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        scan.close();

        int f1 = 0;
        int f2 = 1;
        for(int i = 0; i < n; i++){
            int temp = f1;
             System.out.print(f1 + "\t");
             f1 = f2;
             f2 += temp;
        }
    }
}