import java.util.*;
public class loops{
    
    void main(){
        // for(int i = 1; i < 4; i++){
        //     for(int j = 1; j < 6; j++){
        //         System.out.print("* " );
        //     }
        //     System.out.println();
        // }

        // int n = 6;
        // for(int row = 1; row <= n ;row++){
        //     for(int col = col; j <= row; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for(int row = 1; row <= n; row++){
        //     // space firest print 
        //     for(int space = 1; space <= n - row; space++){
        //         System.out.print(" ");
        //     }

        //     for( int stars = 1; stars <= n; stars++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n+1-row; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for(int i = 1; i <= n; i++){
        //     //space
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //stars
        //     for(int j = 1; j <= 2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;

        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= row-1; col++){
        //         System.out.print(" ");
        //     }
        //     for(int col = 1; col <= 2*n-2*row+1; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= 6; j++){
        //         if(i == 1 || i == n){
        //             System.out.print("* ");
        //         }else {
        //             if(j == 1){
        //             System.out.print("* ");
        //         } else if(j == 6){
        //             System.out.print("* ");
        //         }else {
        //             System.out.print("  ");
        //         }
                

        //         }
        //     }
        //     System.out.println();
        // }
        
        int n = 10;

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                if(row == 1 || row == 2|| row == n){
                    System.out.print("*");
                }else {
                    if(col == 1 || col == row){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
}