package FunctionPrograms;
import java.util.Scanner;

public class GCD {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n1 = scan.nextInt();
         int n2 = scan.nextInt();
        
        scan.close();
        System.out.println("Greatest Common Divisor is: " + calGCD(n1, n2));
    }

    private static int calGCD(int n1, int n2) {
        int gcd = 1;

        for(int i = 1; i < Math.min(n1, n2); i++){
            
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
            
        }
        return gcd;
    }
}
