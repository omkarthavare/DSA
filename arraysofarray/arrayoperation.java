package arraysofarray;

import java.util.Arrays;

public class arrayoperation {
    public static void main(String[] args) {
        int arr[] = {20,10,15,25,13,9};
        Arrays.sort(arr);
        int key=25;
        System.out.println("array integer as list" + Arrays.asList(arr));

        //arrays as stream
        System.out.println("array as stream" + Arrays.stream(arr));

        //array converted into toString
        System.out.println("array to string" + Arrays.toString(arr));
        //deeptosring is similar to to string but in that there is strong tostring available

        //Arrays copyof operation
        System.out.println("array of copy of " + arr  + Arrays.copyOf(arr, 0));
        // In the copyof operation we also copy element in specific range using copyOfRange method
        System.out.println(Arrays.copyOfRange(arr, 1, 5));

        //search can implement using binary search
         Arrays.binarySearch(arr, key);

    }
    
}
