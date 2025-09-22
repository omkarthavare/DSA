import java.util.Scanner;

public class reverseArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n numbers elements");
        
         int n = scanner.nextInt();
        int [] arr = new int[n];

        //enter the array elements
        System.out.println("enter the n elements of array");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int start=0;
        int end = n-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] =arr[ end ];
           arr[ end ]= temp ;

            start++;
            end--;
            
            
        }

        //reverse array
        System.out.println("reversed Array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + "");

        }

        scanner.close();

       
        
    }
}
