package ArrayPrograms;
import java.util.Scanner;

public class ArraySortChecker {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int size = scan.nextInt();
         int numbers[] = new int[size];

         for(int i = 0; i < size; i++){
            
             numbers[i] = scan.nextInt();
         }
        scan.close();

        boolean isAscending = false;
        
        for(int i = 0; i < size - 1; i++){
            
             if(numbers[i] < numbers[i+1]){
                isAscending = true;
             }else if (numbers[i] > numbers[i+1]) {
                isAscending = false;
                break;
             }
            
        }

        System.out.print("[");
        for(int i = 0; i < size; i++){
            
             System.out.print(numbers[i] + " ");
            
        }
        System.out.print("] is ");
        
        System.out.print(isAscending ?"Ascending": "Not Ascending");
    }
}