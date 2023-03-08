// Initialize Scanner
import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {

            //leave the below unedited:
            Scanner inp = new Scanner(System.in);
            System.out.print("# in:");
            int amt = inp.nextInt();
            inp.nextLine(); //this line is necessary
            System.out.print("word:");
            String word = inp.nextLine();
            //leave the above unedited, write your code below:

            // Close scanner
            inp.close();

           //initialize string to store plurals
String pluralWord;

//check if the amt is 0 or 1
if (amt == 0 || amt == 1) {
    //if amt is 0 or 1, the word is singular
    pluralWord = word;
} else {
    //if the word ends in "fe", replace the "fe" with "ves"
    if (word.endsWith("fe")) {
        pluralWord = word.substring(0, word.length() - 2) + "ves";

    } else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy")) {
        //if the word ends in "y", replace the "ies" with "ies"
        pluralWord = word.substring(0, word.length() - 1) + "ies";
    } else if (word.endsWith("sh")) {
        //if the word ends in "sh", replace the "sh" with "es"
        pluralWord = word + "es";
    } else if (word.endsWith("ch")) {
        //if the word ends in "ch", replace the "ch" with "es"
        pluralWord = word + "es";
    } else if (word.endsWith("us")) {
        //if the word ends in "us", replace the "us" with "i"
        pluralWord = word.substring(0, word.length() - 2) + "i";
    } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
        // If the word ends in "ay", "oy", "ey", or "uy", add "s" to the end
        pluralWord = word + "s";
    } else {
        // For all other cases, add "s" to the end
        pluralWord = word + "s";
    }
}
System.out.println(amt + " " + pluralWord);
}
}
