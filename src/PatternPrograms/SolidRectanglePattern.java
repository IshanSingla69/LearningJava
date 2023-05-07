package PatternPrograms;
import java.util.Scanner;;
public class SolidRectanglePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}