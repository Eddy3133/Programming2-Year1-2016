/*Name: Edirin Okpikpi
 * Assignment 3
 * Student Number: 3078829
 */
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class decryptedfile
{
    public static void main(String[]args) throws IOException{
        //scanner tells the user to enter the file to be decrypted
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter file name ");
        String toBeDecryted = kb.next();
        String toBeDecrypted2 = toBeDecryted + ".txt";
        //scanner used to read the file
        Scanner file = new Scanner(new File(toBeDecrypted2));
        StringBuilder str = new StringBuilder();
        while(file.hasNext()) str.append(file.next());
        //stringbuilder created to decrypt the file
        StringBuilder alreadyEncrypted = new StringBuilder();
        //for loop used to run throught all the characters
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            //line of codes used to decrypt the file back to its orignal form, i.e 10 characters back
            int manipulate = (int) c;
            int moved = manipulate - 10;
            alreadyEncrypted.append(Character.toString((char) moved));
        }
        String decrypted = toBeDecryted+"Decrypted.txt";
        DataOutputStream out = new DataOutputStream(new FileOutputStream(decrypted));
        out.writeUTF(alreadyEncrypted.toString());
        out.close();
        System.out.println("success");
    }
}