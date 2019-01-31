/* Name: Okpikpi Edirin
 * Student number: 3078829
 * Lab 3
 */
public class lab3
{
    public static void main (String[]args){
        String sentence = "my best house";
        //the string we will be working on
        String output = latest(sentence);
        //latest a variable created to contain values of sentence
        System.out.println(output);
    }
    
    public static String latest(String words){
        //method created
        String latest1= "";
        for(String s: words.split(" +"))
        //to count each word
        latest1+=Character.toUpperCase(s.charAt(0))+ s.substring(1).toLowerCase();
        // to change the first letter to upper letters and the second to small letters
        return latest1;
        //latest1 now contains the output that would be returned.
    }
}

        