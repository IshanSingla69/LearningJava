package PatternPrograms;
import java.util.Scanner;

public class ButterflyPattern {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        
        scan.close();

        for(int i = 1; i <= n; i++){
            
            //Print First Half pyramid from left to right decreasing
            for(int j = 0; j < i; j++){
                
                 System.out.print("* ");
                
            }

            //Print Spaces
            for(int j = 0; j < (2*(n-i)); j++){
                
                 System.out.print("  ");
                
            }

            //Print Second Half pyramid from left to right increasing
            for(int j = 0; j < i; j++){
                
                 System.out.print("* ");
                
            }
            System.out.println();
        }

        //Same thing but print inverted
        for(int k = n; k >= 1; k--){
            
            //Print First Half pyramid from left to right decreasing
             for(int j = 0; j < k; j++){
                
                 System.out.print("* ");
                
             }

             //Print Spaces
             for(int j = 0; j < (2*(n-k)); j++){
                
                 System.out.print("  ");
                
             }

             //Print Second Half pyramid from left to right increasing
             for(int j = 0; j < k; j++){
                
                 System.out.print("* ");
                
             }
            System.out.println();
        }
    }
}