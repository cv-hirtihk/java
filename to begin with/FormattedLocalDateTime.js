// Here LocalDateTime is used to display the current date
import java.time.LocalDateTime;

// Here DataTimeFormatter is used to format the date to be displayed
import java.time.format.DateTimeFormatter;

public class FormattedLocalDateTime{
    // The variable is declared static, so that it can be accessed by the main function
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");    
    
    public static void main(String args[]){
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // Prints output in the following format - 
        // > YYYY-MM-DDThh:mm:ss.msmsmsms
        // Here T is denoted for time and ms is for micro - seconds
        System.out.println(currentDateTime);
        
        String formattedDateTime = currentDateTime.format(formatter);
        
        // Prints output in the following format - 
        // > DD/MM/YYYY hh:mm:ss
        // Here the output is clean and is easy to understand
        System.out.print(formattedDateTime);
    }
}
