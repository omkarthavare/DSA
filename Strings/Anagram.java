import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "lsten";

        char[] c1 = str1.toCharArray();
        Arrays.sort(c1);

        char[] c2 = str2.toCharArray();
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2 )) {
            System.out.println("String are anagram");
            
        }else{
            System.out.println("String are not anagram");
        }
    }
            
    

    
    
}
