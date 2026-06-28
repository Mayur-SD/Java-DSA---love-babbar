import java.util.*;
public class array1 {

    //find avg of array
    public static double findAvg(int arr[]){
        double sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        double avg = sum / n;
        return avg;
    }

    //multiply eac element of array by 10;
    public static int[] multArr(int arr[]){
        int crr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            crr[i] = arr[i] * 10;
        }
        return crr;
    }

    //find element in array by using linear search
    public static void linearSearch(int arr[]){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i = 1; i < arr.length; i++){
            if(target == arr[i]){
                System.out.println(i);
            }
        }
        System.out.println("Invalid no, Not present in Array");
    }

    //find Maximum element in array
    public static int maxValue(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void getsum(int brr[]){
        int possum = 0;
        int negsum = 0;
        for(int i = 0; i < brr.length; i++){
            if(brr[i] > 0){
                possum += brr[i];
            }
            else {
                negsum += brr[i];
            }
        }
        System.out.println("Positive number of array " + possum);
        System.out.println("Negative number of array " + negsum);
    }

    //count no of zeros and one
    public static void count1or0(int crr[]){
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < crr.length; i++){
            if(crr[i] == 0){
                count0 += 1;
            }
            if(crr[i] == 1){
                count1 += 1;
            }
        }
        System.out.println("Count of 0 in this array is " + count0);
        System.out.println("Count of 1 in this array is " + count1);
    }

    //find first unsorted array
    public static int findUnsortedEle(int drr[]){
        for(int i = 0; i < drr.length; i++){
            if(drr[i] >= drr[i+1]){
            return drr[i+1];
            }
        }
        return -1;
    }

    //Homework Questions
    public static void swapAltNo(int arr[]){
        for(int i = 0; i < arr.length - 1; i+=2){
            int a = arr[i];
            arr[i] = arr[i+1];
            arr[i + 1] = a;
        }
    }

    public static void itrSecArr(int arr[],int err[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < err.length; j++){
                if(arr[i] == err[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }



    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        // swapAltNo(arr);   // Call the method

        // Print the array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        

        int brr[] = {2,-4,6,-8,5,3,-1};
        
        int crr[] = {1,0,2,4,1,0,3,0,1,5,29,0,4,1};
        
        int drr[] = {1,2,3,4,5,2,8,9,10};

        int err[] = {9,7,8,4,2,0};
       
    }
}