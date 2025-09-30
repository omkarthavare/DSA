import java.util.Scanner;

public class Reverse {
    public static void reverseString(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i)); // print on same line
        }
        System.out.println(); // new line at end
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.next();
        reverseString(input);
    }
    
}
