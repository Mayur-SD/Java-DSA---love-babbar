import java.util.*;
public class array {

    //max value in array
    public static void findMaxIndex(int arr[]){
        int n = arr.length;
        int max = arr[0];

        for(int i = 0; i <= n-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("the max value in this array is " + max);
    }


    //minimum value in array
    public static void findMinIndex(int arr[]){
        int n = arr.length;
        int min = arr[0];

        for(int i = 0; i <= n-1; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("the max value in this array is " + min);
    }

    public static void printTwodArray(int[][] brr){
        int n = brr.length;
        for(int i = 0; i <= n-1; i++){
            for(int j = 0; j <= brr[0].length-1; j++){
                System.out.print(brr[i][j]);
            }
            System.out.println();
        }

    }

    public static void sumPrint(int brr[][]){
        int sum = 0;
        for(int i = 0; i < brr.length; i++){
            for(int j = 0; j < brr[i].length; j++){
                sum += brr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void mulPrint(int brr[][]){
        int mul = 1;
        for(int i = 0; i < brr.length; i++){
            for(int j = 0; j < brr[i].length; j++){
                mul += brr[i][j];
            }
        }
        System.out.println(mul);
    }

    public static void maxNoTwo(int brr[][]){
        int max = 0;
        for(int i = 0; i < brr.length; i++){
            for(int j = 0 ; j < brr[i].length; j++){
                if(max < brr[i][j]){
                    max = brr[i][j];
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        int arr[] = {10,29,-2,50,0};
        int brr[][] = {
            {10,20},
            {22,30},
            {33,40}
        };
        maxNoTwo(brr);

    }
    
}
