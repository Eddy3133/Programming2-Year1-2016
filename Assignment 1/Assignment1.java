//Name: Edirin Okpikpi
//Student Number: 3078829
//Assignment: 1
import java.util.Scanner;
public class Assignment1
{
    public static void main(String[]args){
        System.out.println("please enter your password with the requirements of more than"
        + "\n6 charcters at least 1 uppercase, 1 lowercase and 1 digit. thank you");
        int smallletter = 0;
        int capitalletter = 0;
        int numbers = 0;
        int line = 0;
        //this are the variables in the code to be executed
        do{
            passCheck data = new passCheck();
            String enter;
            Scanner kb = new Scanner(System.in);
            enter = kb.next();
            System.out.println(data.accepted(enter));
        }
        while(smallletter < 1 || capitalletter < 1 || numbers < 1 || line < 6);
    }
    
    
    
}
