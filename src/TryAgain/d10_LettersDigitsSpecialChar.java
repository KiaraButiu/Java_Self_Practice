package TryAgain;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class d10_LettersDigitsSpecialChar {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters = "";
        String Digits = "";
        String specialChar = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                letters += each;
            } else if (Character.isDigit(each)) {
                Digits += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("Digits = " + Digits);
        System.out.println("Special Characters = " + specialChar);

    }

}
/* 1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";*/