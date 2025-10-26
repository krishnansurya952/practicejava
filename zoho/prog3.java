// Write a program that will take one string as input. The program will then 
// remove vowels a, e, i, o, and u (in lower or upper case ) from the string. 
// If there are two or more vowels that occur together then the program shall 
// ignore all of those vowels.

// Example 1

// Input:  Cat
// Output:  Ct
// Example 2

// Input:  Compuuter
// Output: Cmpuutr

import java.util.*;

public class prog3 {
    public static boolean isVowel(char c){
        char lowercase=Character.toLowerCase(c);
        return lowercase=='a'|| lowercase=='e'|| lowercase=='i'|| lowercase=='o'|| lowercase=='u';
    }
    public static String removeVowels(String s){
        StringBuilder result=new StringBuilder();
        for(char c: s.toCharArray()){
            if(!isVowel(c)){
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String result=removeVowels(input);
        System.out.println(result);
    }
    
}
