// Given an array of input the aim is to rotate the array according to the given shifts
// input - [1, 2, 3, 4, 5, 6, 7, 8, 9]
// shifts - 3
// output - [4, 5, 6, 7, 8, 9, 1, 2, 3]

import java.util.Scanner;
import java.util.Arrays;

public class RotateArrayForShift{
    public static void shiftLeft(int arr[], int s, int l){
        for(int i = 0; i < s; i++)
            shiftLeftOnce(arr, l);
    }
    
    public static void shiftLeftOnce(int arr[], int l){
        int temp = arr[0];
        
        for(int i = 0; i < l - 1; i++){
            arr[i] = arr[i + 1];
        }
        
        arr[l-1] = temp;
    }
    
    public static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number [1, 2, 3]: ");
        String val = input.nextLine();
        System.out.println("Enter the number of shifts: ");
        int shifts = input.nextInt();
        int[] num = Arrays.stream(val.split(",")).mapToInt(Integer::parseInt).toArray();
        int len = num.length;
        
        shiftLeft(num, shifts, len);
        printArray(num);
    }
}
