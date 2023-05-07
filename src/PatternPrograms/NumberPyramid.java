package PatternPrograms;
import java.util.Scanner;

public class NumberPyramid {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        
        scan.close();

        int count = 1;
        for(int i = n; i > 0; i--){
            
             for(int j = 0; j < i; j++){
                
                 System.out.print(" ");
                
             }

             for(int j = 0; j <= n-i; j++){
                
                 System.out.print(count);
                 System.out.print(" ");
                
             }
             count++;
             System.out.println();
            
        }
    }
}