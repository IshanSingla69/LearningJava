package PatternPrograms;
import java.util.Scanner;

public class HollowRectanglePattern {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        scan.close();

        for(int i = 1; i <= n2; i++){
            for(int j = 1; j <= n1; j++){
                if(i == 1 || i == n2 || j == 1 || j == n1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}