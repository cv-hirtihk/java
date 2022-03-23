// Given a String containing numbers as input, the aim is to
// count the number of decodings possible.
// Eg; Input - '123'
//     Output - 3
// Here each number is assigned with an alphabet like, 1 -> A, 2 -> B,... 26 -> Z

import java.util.Scanner;

public class CountDecodedSequence{
    static int countDecodedSequence(char[] words, int length){
        
        // base case
        if(length == 0 || length == 1)
            return 1;
        
        // no leading zeros are allowed, "01123"
        if(words[0] == '0')
            return 0;
            
        int count = 0;
        
        // if this condition is satisfied then, call the function again by 
        // passing words and n - 1
        if(words[length - 1] > '0')
            count = countDecodedSequence(words, length - 1);
        
        // to check if last to digits are smaller that or equal to 26
        // if so consider the last two digits and recur
        if(words[length - 2] == '1' || (words[length - 2] == '2' && words[length - 1] < '7'))
            count += countDecodedSequence(words, length - 2);
            
        return count;
    }
    
    static int countPath(char[] words, int length){
        if(length == 0 || (length == 1 && words[0] == '0'))
            return 0;
        return countDecodedSequence(words, length);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number sequence '123' like this: ");
        String word = input.nextLine();
        char[] words = word.toCharArray();
        int length = words.length;
        System.out.println(countPath(words, length));
    }
}
