// Given a statement of type String, the aim is the reverse 
// the statement wordwise...
// Example: "Java programming is platform independent"
// Expected output: "independent platform is programming Java"

import java.util.Scanner;
public class ReverseWordWise{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");
        int length = words.length;
        int i = 0;
        System.out.println("Inputted Statement");
        System.out.print("> ");
        for(; i < length; i++){
            System.out.print(words[i]);
            if(i <= length-2){
                System.out.print(" ");
            }
        }
        
        System.out.println("\nReversed Statement");
        System.out.print("> ");
        for(i = length - 1; i >= 0; i--){
            System.out.print(words[i]);
            if(i >= 1){
                System.out.print(" ");
            }
        }
    }
}
