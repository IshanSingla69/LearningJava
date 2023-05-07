package PatternPrograms;
import java.util.Scanner;

public class InvertedHalfPyramid {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        scan.close();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}