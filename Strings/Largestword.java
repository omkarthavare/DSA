import java.util.Scanner;

public class Largestword {
    public static void main(String[] args) {
        //Write a program to find a largest word in a sentenece.

        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");

        String sentence = sc.nextLine();

        //splitting the sentence into words
        String[] words = sentence.split(" ");

        //taking the  largest word as empty String.
        String Largestword = " ";

        //taking the maxlength as 0.
        int maxlength = 0;

        //iterating through the words array using for each Loop.
        for (  String word: words) {
            //checking the length of each word and comparing it with maxLength.
            if (word.length()> maxlength) {
                maxlength = word.length();
                Largestword = word;

               
                
            }
            
            
        }
                System.out.println("Largest word is :" + Largestword);
                System.out.println("Length of Largest word is :" + maxlength);




    }
    
}
