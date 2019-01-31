/*Name: Edirin Okpikpi
 * Assignment 3
 * Student Number: 3078829
 */
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class encryptedfile
{
    public static void main (String[]args)throws IOException
    {
        //the scanner tells the user to input the information
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the file name ");
        String toBeEncryted = kb.next();
        String toBeEncrypted2 = toBeEncryted+ ".txt";
        //the use of Scanner to read file
        Scanner file = new Scanner(new File(toBeEncrypted2));
        StringBuilder str = new StringBuilder();
        while(file.hasNext())str.append(file.next());
        //this stringBuilder is created for the encrypted file
        StringBuilder alreadyEncrypted = new StringBuilder();
        //for loop is used to run through every character in the file to be encrypted
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            //this line of code is used to ecrypt the file, in this case to add 10 characters ahead the normal character
            int manipulate = (int) c;
            int moved = manipulate + 10;
            alreadyEncrypted.append(Character.toString((char) moved));
        }
        String encrypted = toBeEncryted+"encrypted.txt";
        DataOutputStream out = new DataOutputStream(new FileOutputStream(encrypted));
        out.writeUTF(alreadyEncrypted.toString());
        out.close();
         System.out.println("success");
    }
}
    