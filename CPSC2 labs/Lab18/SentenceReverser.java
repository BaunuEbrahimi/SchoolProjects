import java.util.*;
import java.util.Scanner;
import java.util.Stack;
/**
Class for reversing the order of a sentence.
 */
public class SentenceReverser {
    /**
    Reverses the given sentence.
    @param sentence Sentence to be reversed.
    @return Reversed sentence.
     */
    public static String reverse(String sentence) {
        // create a scanner to scan the sentence
        Scanner scan = new Scanner(sentence); 
        // create a stack of string values
        Stack <String> st = new Stack <String>();  
        String words = " ";
        String reversedString = "";
        // while the sentence has another word
        while(scan.hasNext()) {          
            // make a variable to hold the words
            words = scan.next();
            // put each word into the stack
            st.push(words); 
            char lastCharOfWord = words.charAt(words.length() - 1);           
            if(lastCharOfWord == '.') {
                // edit the new first word of the sentence to be uppercase and not have a period
                String addUppercase = words.substring(0,1).toUpperCase() + words.substring(1);
                String finalFirstWord = addUppercase.replaceAll("[.]","");
                // make the new last word lowercase and have a period
                String finalLastWord = st.firstElement().toLowerCase() + ".";
                // set these words in there correct new positions in the stack
                int lastElementPosition = st.indexOf(st.lastElement());
                String setLastWord = st.set(0, finalLastWord); 
                String setFirstWord = st.set(lastElementPosition, finalFirstWord);
                // pop all values in the stack and make this the reversed String
                while(st.size() > 0) {              
                    reversedString = reversedString + st.pop() + " ";                    
                } 
            }            
        }
        // return the new reversed string
        return reversedString;
    }

    public static void main(String[] args) {
        String sentence = "Mary had a little lamb. Its fleece was white as snow.";
        // reverse the sentence 
        String reversed = reverse(sentence);
        // print the results 
        System.out.println("Given String: \n" + sentence);
        System.out.println("\nNew Reversed String: \n" + reversed);
        System.out.println("\nExpected Reversed String: \nLamb little a had mary. Snow as white was fleece its.");
    }
}