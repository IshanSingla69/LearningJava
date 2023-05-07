package PatternPrograms;
import java.util.Scanner;

public class FloydsTriangle {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        
        scan.close();

        int count = 0;

        for(int i = 0; i < n; i++){
            
             for(int j = 0; j < i; j++){
                
                 count++;
                System.out.print(count + " ");
             }
            System.out.println();
        }
    }
}