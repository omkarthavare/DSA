import java.util.Arrays;

public class thirdLargest {

    static int thirdLargestNo (int [] arr){
        int n=arr.length;

        Arrays.sort(arr);
        
        for(int i=n-3; i>0; i++){
            if(arr[i] != arr[n-2])
            return arr[i];
        }

        return -1;
    }
     public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        System.out.println(thirdLargestNo(arr));
     }
    
}
