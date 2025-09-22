import java.util.Arrays;
import java.util.Scanner;

public class ThreeCandidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int p = scanner.nextInt();
        int[] arr  =new int[p];

        System.out.println("Enter the elements of array");
        for(int i=0;i<p;i++){
            arr[i]=scanner.nextInt();
        }

           Arrays.sort(arr);
        //System.out.println("sorted array"  + arr );
         int n = arr.length;

        int largeProduct = arr[n-1]*arr[n-2]*arr[n-3];
        int smallProduct = arr[0]*arr[1]*arr[n-1];

        int maxProduct=Math.max(largeProduct, smallProduct);

        System.out.println("There are three great candidate" + maxProduct);

        scanner.close();
    }
    
}
