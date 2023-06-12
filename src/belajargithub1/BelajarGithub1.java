package belajargithub1;

import java.util.Calendar;

public class BelajarGithub1 {
    public static void main(String[] args) {

Calendar c = Calendar.getInstance();        
        
        String str = "Wahyudhi Noma H";
        String str1 = str.substring (0,5);
        String str2 = str.substring (3,8);
            System.out.println("Nama Depan : " + str1);
            System.out.println("Nama Depan : " + str2);
        

System.out.format("%tB %te, %tY%n", c, c, c);
System.out.format("%tl:%tM %tp%n", c, c, c);
System.out.format("%tD%n", c);
    }
    
}
