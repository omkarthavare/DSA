import java.util.Arrays;


 public class secondlargestelement {
    static int secondlargeno(int [] arry){
        int n =arry.length;
        Arrays.sort(arry);


        for( int i=n-2;i>=0;i--){
             
            if(arry[i] != arry[n-1])
            return arry[i];

        }
        return -1;
    }

    public static void main(String[] args){
        int [] arry = {2,6,84,90,45};
        System.out.println(secondlargeno(arry));

   }
   


}