package FunctionPrograms;
import java.util.Scanner;

public class SumOfOddNumbers {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        
        scan.close();
        
        System.out.println(calculateSum(n));
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            
             if(!(i%2==0)){
                sum += i;
             }
            
        }

        return sum;
    }
}