//Name: Edirin Okpikpi
//Student Number: 3078829
//Assignment: 1
public class passCheck
{
    public String accepted(String password){
        String result = "Valid Password";// returns valid password.
        int length = 0;
        int digitCount = 0;
        int upperCount = 0;
        int lowerCount = 0;

        for(int ct = 0; ct < password.length(); ct++){// this for loop goes through all the characters in the password.
            if(password.charAt(ct) >= 97 && password.charAt(ct) <= 122 || password.charAt(ct) >= 65 && password.charAt(ct)<=90||
            password.charAt(ct) > 48 && password.charAt(ct)<= 57){// to check if password meets requirements.
            }
            else{System.out.println("Invalid characters. only use required elements");
            }
            if (password.charAt(ct) >= 97 && password.charAt(ct) <= 122){
                lowerCount++;
            }
            if (password.charAt(ct) >= 65 && password.charAt(ct) <= 90){
                upperCount++;
            }
            if (password.charAt(ct) >= 48 && password.charAt(ct) <=57 ){
                digitCount++;
            }
            //all the if statements above are used to increment their respective variables
        }

        if(lowerCount < 1){
            result = "Invalid Password";
        }
        //number of lowercases less than 1
        if(upperCount < 1){
            result = "Invalid Password";
        }
        //number of uppercases less than 1
        if(digitCount < 1){
            result = "Invalid Password";
        }
        //number of digits is less than 1
        if(length > 6){
            result = "Invalid Password";
        }
        return result;
        //retruns result if you met the requirements or not
    }
}