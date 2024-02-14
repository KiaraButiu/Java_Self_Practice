package day10_wrapperclass_arraylist;

public class UpperAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCase = 0;                 // to get number of character
        int lowerCase = 0;

        for (char ch : str.toCharArray()) {     // used to get the length: returns how many elements in a string
            if (Character.isUpperCase(ch)){
                upperCase++;

            }else if(Character.isLowerCase(ch)){
                lowerCase++;
            }
        }
       // boolean isEqualChar = upperCase == lowerCase;

        System.out.println(upperCase == lowerCase);
    }
}
/* Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
        2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

        Example:  str = "JAVA java";
                    output: true  */