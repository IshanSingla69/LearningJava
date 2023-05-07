package PatternPrograms;
import java.util.Scanner;

public class OITriangle {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        
        scan.close();

        for(int i = 0; i < n; i++){
            
             for(int j = 0; j <= i; j++){
                
                 if((i+j) % 2 == 0){
                    System.out.print(1);
                 }
                 else{
                    System.out.print(0);
                 }
                
             }
            System.out.println();
        }
    }
}