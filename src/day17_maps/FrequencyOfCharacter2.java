package day17_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class FrequencyOfCharacter2 {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";

        String[] Character = str.split("");

        System.out.println(new LinkedHashSet<>(Arrays.asList(Character)));
    }



}
/* Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}*/