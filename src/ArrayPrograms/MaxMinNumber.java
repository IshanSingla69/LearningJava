package ArrayPrograms;
import java.util.Scanner;

public class MaxMinNumber {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int size = scan.nextInt();
         int[] numbers = new int[size];

         for(int i = 0; i < size; i++){
            
             numbers[i] = scan.nextInt();
            
         }
        scan.close();

         int max = numbers[0];
         int min = numbers[0];
        for(int i = 1;i < numbers.length; i++){
            
           if(numbers[i] > max){
            max = numbers[i];
           }
        }

        for(int i = 1; i < numbers.length; i++){
            
             if(numbers[i] < min){
                min = numbers[i];
             }
            
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}