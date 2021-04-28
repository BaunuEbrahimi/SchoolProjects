/*
 * Programming Assignment 1: Letter Counter   
 * Programmer:  Baunu Ebrahimi
 */
import java.util.*;
import java.io.*;
public class LetterCounter_ArrayApp {
    /*
     * Return an array of the frequencies of 26 letters 
     * for a given string for a given string
     *
     * Note: /* You only need count the frequency for 26 letters
     * i.e., "abcdefghijklmnopqrstuvwxyz".
     * you should count both uppercase and lower case letters 
     */

    // set a constant for the array size of 26 (letters)
    static final int LETTER_AMOUNT = 26;
    public static int [] countLetter(String str) { 
        // create an array with the length of 26
        int[] frequencyCounter = new int[LETTER_AMOUNT];
        // make sure that all letters are lowercase so that regardless of case they are counted
        str = str.toLowerCase();
        // For each letter in the array (26)...
        for (int i = 0; i < str.length(); i++) {
            // if the char is between a-z...
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                // count the occurence of the letter in the Array
                frequencyCounter[str.charAt(i) - 'a']++;
            }    
        }
        // return the Array
        return frequencyCounter;
    }

    /*
     * Print the letters, their frequencies, and frequency representations
     * @countArray: an array of 26 letters frequencies in an alphabetic order *
     * Note: Only print those frequencies > 0.
     */

    public static void printLetterFreq(int [] countArray) { 
        // check for each letter (26)... 
        for (int i = 0; i < LETTER_AMOUNT; i++) {
            // if the letter occurs at least once in the string...
            if(countArray[i] > 0) {
                // (goes to the next letter alphabetically)
                char letters = (char)('a' + i);
                // print the letter and the amount of times it occurs and then show its frequency in asterisks
                System.out.println(letters + "(  " + countArray[i] + "):" + numToStar(countArray[i])); 

            }

        }
    }

    /*
     * Return a string with a number of stars (*) corresponding to the input
     * "num", For instance, if num = 5, then you should return "*****"
     *
     * Note: This method will be invoked in the method of printLetterFreq()
     */

    public static String numToStar(int num) { 
        StringBuffer asterisks = new StringBuffer();
        // as many times as a letter occurs in the Array print out a star "*"
        for(int i = 0; i < num; i++) {
            asterisks.append("*");
        }
        // using a StringBuffer create a string with the asterisks and return it
        return asterisks.toString();
    }

    /*
     * Find the most frequent letter in all 26 letter frequencies.
     * @countArray: an array of 26 letters frequencies in an alphabetic order *
     * Note: If there are more than one letters with highest frequencies,
     * then return the first most frequent letter.
     */

    public static char mostFreqLetter(int [] countArray) { 
        int freqLetter = 0;
        // default the most frequent letter as 'a'
        int mostFrequent = countArray[0];
        // scan through each letter (26)...
        for (int i = 0; i < LETTER_AMOUNT; i++) {
            // if the current letter frequency is greater than the previous...
            if(countArray[i] > mostFrequent) {
                // set it equal to the new most frequent
                mostFrequent = countArray[i];
                // declare that letter in the array as the most frequent letter
                freqLetter = i;
            }
        }
        // return that letter
        return (char)('a' + freqLetter);
    }

    public static void main(String[] args) {
        String str0 = "counting the frequencies of letters";

        String str1 = "Computer programming II is fun";

        String str2 = "After a fairly tame season so far -- especially " + 
            "compared to the last one -- a monster storm loomed Friday over "
            + "the Carolinas north to New England, spurring people to hunker " + 
            "down with their shovels, coffee and ideally firewood, given real fears " +
            "that powerful winds and heavy snow and ice could knock out power. " + 
            "Roughly 75 million people total are in the path, 30 million of whom are " +
            "under blizzard watches or warnings.";

        String str3 = "Our department boasts an employment rate for graduates of " +
            "nearly 100% in the field. Graduating students have recently been placed in " + 
            "a wide variety of organizations, including: Cisco Systems, Hershey Foods, " + 
            "IBM, Lockheed Martin, Merck, New York Life, National Security Agency (NSA), " + 
            "Pocono Medical Center, Proteus Technologies, Sanofi-Pasteur, Situational " + 
            "Awareness Systems, Space and Naval Warfare Systems (SPAWAR), US Army R&D Center " + 
            "at Picatinny Arsenal, NJ, Vanguard Investments, Verizon, and Vonage.";

        // print the String you are counting the letter frequency of
        System.out.println("Letter Frequency: counting the frequencies of letters in " + "\"" + str0 + "\"" );
        // make an array with the necessary letter information by passing in the String you want to count the letter frequency of into the countLetter method  
        int countArray[] = countLetter(str0);
        // get all of the letter frequency data for the array
        printLetterFreq(countArray);
        // print out what letter is the most frequent in the array
        System.out.println("The most frequent letter in the String is: " + mostFreqLetter(countArray));

    }
}

