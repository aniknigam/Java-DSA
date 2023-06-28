// firtst method

//public class advancePatternPascal {
//     public static void main(String[] args){
//         int n = 4;
//         int space = n;
//         int number = 1;
//         for(int i = 0; i<n; i++){
//             //printing spcaces
//             for(int j = n; j>=i; j--){
//                 System.out.print(" ");
//             }
//             number = 1;
//             for(int j = 0; j<=i; j++){
//                 System.out.print(number + " ");
//                 number = number * (i - j)/(j+1);
//             }
//             System.out.println();
//         }
//     }
// }

//second method

import java.util.*;

public class advancePatternPascal {
    public static void main(String[] args) {
        System.out.println("Enter a number to get the pascal triangle of that length.");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int number = 1;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j<=input-i; j++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                 System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
               
            }
            System.out.println();
        }
        sc.close();
    }
}


// Enter a number to get the pascal triangle of that length.
// 5
//       1 
//      1 1 
//     1 2 1 
//    1 3 3 1 
//   1 4 6 4 1 