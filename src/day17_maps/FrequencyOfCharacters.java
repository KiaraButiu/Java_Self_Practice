package day17_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

       String str = "bbcccaaaaa";

       Map<Character, Integer> output = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {       // to access each character

            if (output.containsKey(each)){                 // if map contains character
                output.put(each, output.get(each) + 1);     // add each same character value if it contains
            }else{
                output.put(each, 1);                    // else each character value remains 1
            }
        }
        System.out.println(output);
    }

}
/* Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}*/