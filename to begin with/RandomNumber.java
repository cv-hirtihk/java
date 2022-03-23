// Here secureRandom is used as it supports upto 128 bits unlike java.util.Random which support upto 48 bits. 
// By using SecureRandom, chances of repeating a number is very low
import java.security.SecureRandom;
import java.util.Scanner;
public class GenerateRandomNumber{
    // The variable is declared final so the during the course of writing / executing the program no values will be able to assigned to the SecureRandom's variable 
    public static final SecureRandom secure_random = new SecureRandom();
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int loop = 0, minimum = 0, maximum = 1;
        System.out.println("Enter Minimum number");
        System.out.print("> ");
        minimum = Integer.parseInt(input.nextLine());
        
        System.out.println("Enter Maximum number");
        System.out.print("> ");
        maximum = Integer.parseInt(input.nextLine());
        
        System.out.println("How many number do you want to be generated? ");
        System.out.print("> ");
        loop = Integer.parseInt(input.nextLine());
        
        System.out.println("Generating random number between " + minimum + " and " + maximum + " for " + loop + " times");
        
        while(loop > 0){
            System.out.println("> " + randomNumberGenerator(minimum, maximum, loop));
            --loop;
        }
    }
    
    private static int randomNumberGenerator(int min, int max, int loop){
        return secure_random.nextInt(max- min) + min;
    }
}
