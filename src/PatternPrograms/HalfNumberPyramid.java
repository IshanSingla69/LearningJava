package PatternPrograms;
import java.util.Scanner;

public class HalfNumberPyramid {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        
        scan.close();

        for(int i = 1; i <= n; i++){
            
             for(int j = 1; j <= i; j++){
                
                 System.out.print(j + " ");
                
             }
            System.out.println();
        }
    }
}