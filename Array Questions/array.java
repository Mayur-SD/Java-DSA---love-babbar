public class array{
    public static revArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j){
            //swap
            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
            //increment i
            i++
            //decrement j
            j--
        }
    }



    public static void main(){
        int arr[] = {1,2,3,4,5,6,7,8};
        revArray(arr);
    }
}