package ArrayPrograms;
import java.util.Scanner;

public class ArrayOfNames {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        String[] names = new String[n];
        scan.nextLine();

        for(int i = 0; i < n; i++){
            
             names[i] = scan.nextLine();
            
        }

        scan.close();
        System.out.println();
        for(int i = 0; i < n; i++){
            
             System.out.println(names[i]);
            
        }
    }
}