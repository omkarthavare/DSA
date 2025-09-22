public class search {
    public static void main(String[] args) {

        int arr[] = { 4,5,8,18,28,38,48,58,68,78,88,98};
        int target = 3;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }

    static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid-1;
                
            }else if (target > arr[mid]) {
                start = mid + 1;
                
            }else{
                return mid;
            }
        }

        return -1;

    }
    
}
