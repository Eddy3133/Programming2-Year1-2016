//Name: Edirin Okpikpi
//Student Number: 3078829
//Lab: 2

import java.time.LocalDate;
import java.time.Period;

public class L2{

    public static int myAge(String ddmmyyyy){

        String arg = ddmmyyyy;
        

        int dd = Integer.parseInt(ddmmyyyy.substring (0,2));
        int mm = Integer.parseInt(ddmmyyyy.substring (3,5));
        int yyyy = Integer.parseInt(ddmmyyyy.substring (6,10));

        LocalDate birthday = LocalDate.of(yyyy,mm,dd);
        LocalDate today = LocalDate.now();

        Period p = Period.between(birthday, today);
        return p.getYears();
    }

    public static void main (String [] args){
        int age = myAge("20-07-1999");

        assert age>0: "Age must be positive"; 
        // Need to ensure  -ea is used in project run properties.
        System.out.println(age);
    }
}

