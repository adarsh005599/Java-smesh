
// // // // // // import java.util.Scanner;

// // // // // // public class arr2d{
// // // // // //     public static void main(String[] args) {
// // // // // //         Scanner sc = new Scanner(System.in);

// // // // // //         int [][] matrix = new int[2][3] ;
        
        
// // // // // // //         System.out.println("enter the 6 eleemts: ");
// // // // // // //         for(int i=0; i<2; i++){
// // // // // // //             for (int j=0; j<3; j++){
// // // // // // //                 matrix[i][j] = sc.nextInt();
// // // // // // //             }
// // // // // // //         }
// // // // // // //         // print out
// // // // // // //         System.out.println("matrix");
// // // // // // //         for(int [] row :  matrix){
// // // // // // //             for (int val: row){
// // // // // // //                 System.out.print(val + " ");
// // // // // // //             }
// // // // // // //             System.out.println();
// // // // // // //         }
// // // // // // //         sc.close();
// // // // // // //     }
// // // // // // // }

// // // // // // sun of the 2d array
// // // // // // public class arr2d{
// // // // // //     public static void main(String[] args) {
// // // // // //         int[][] matrixSum = {{1,2,3}, {1,2,3,4}};
// // // // // //         int sum = 0;
// // // // // //         for (int [] row: matrixSum){
// // // // // //             for(int val : row){
// // // // // //                 sum +=val;
// // // // // //             }
            
// // // // // //         }
// // // // // //     System.out.println("the sum is : "  + sum);
// // // // // // }
// // // // // // }
// // // // // // adding the array ele using the input from user

// // // // // import java.util.Scanner;

// // // // // public class arr2d{
// // // // //     public static void main(String args[]){
// // // // //         Scanner sc= new Scanner(System.in);
        
// // // // //         System.out.println("enter the no of rows:!");
// // // // //         int rows = sc.nextInt();
// // // // //         System.out.println("enter the no of cols:!");
// // // // //         int cols = sc.nextInt();

// // // // //         int [][] sumOfArray = new int[rows][cols];
// // // // //         int sum = 0;

// // // // //         System.out.print("enter the number of elements: ");

// // // // //         for(int i=0; i<rows; i++){
// // // // //             for(int j =0; j< cols; j++){
// // // // //                 sumOfArray[i][j] = sc.nextInt();
// // // // //                 sum +=sumOfArray[i][j];

// // // // //             }
// // // // //         }
// // // // //         System.out.println("the sum is: " + sum);
// // // // //         sc.close();
// // // // //     }
// // // // // }

// // // // // row wise sum
// // // // public  class arr2d{
// // // //  public static void main(String[] args) {
// // // //      int [][] rowSum = {{1,2,3}, {4,5,6}};

// // // //      System.out.println("the row wise sum: ");
// // // //      for(int [] row: rowSum){
// // // //         int sum = 0;
// // // //         for(int val: row){
// // // //             sum += val;
// // // //         }
// // // //          System.out.println("Row "  + " sum: " + sum);
// // // //      }
// // // //  }
// // // // }
// // // // column sum 
// // // // import java.util.Scanner;
// // // // public class arr2d{
// // // //     public static void main(String[] args) {
// // // //         Scanner sc = new Scanner(System.in);

// // // //         int [][] matrix  = new int[2][4];
// // // //         System.out.println("enter the 8 elements: ");
// // // //         for(int i=0; i<2; i++){
// // // //             for(int j =0; j<4; j++){
// // // //                 matrix[i][j] = sc.nextInt();
// // // //             }
// // // //         }
// // // //         // col wise sum
// // // //         System.out.println("hear is your col wise sum: ");
// // // //         for(int [] row: matrix){
// // // //             int colSum = 0;
// // // //             for(int val: row){
// // // //                 colSum = val;
// // // //             }
// // // //             System.out.println("col wise sum is: " + colSum);
// // // //         }
// // // //         sc.close();
// // // //     }
// // // // }

// // // // transpose 

// // // // public class arr2d {
// // // //     public static void main(String[] args) {
// // // //         int[][] matrix = {
// // // //             {1, 2, 3},
// // // //             {4, 5, 6}
// // // //         };

// // // //         System.out.println("Transpose:");
// // // //         for (int i = 0; i < 3; i++) { // cols
// // // //             for (int j = 0; j < 2; j++) { // rows
// // // //                 System.out.print(matrix[j][i] + " ");
// // // //             }
// // // //             System.out.println();
// // // //         }
// // // //     }
// // // // }

// // // // diognoal of the the given matrix

// // // import java.util.Scanner;

// // // public class arr2d{
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
        
// // //         int [][] matrix = new int[3][3];

// // //         System.out.print("enter the 9 elements: ");
// // //         for(int i=0; i<3; i++){
// // //             for(int j=0; j<3; j++){
// // //                 matrix[i][j] = sc.nextInt();
// // //             }
// // //         }
// // //         // diagonal ele
// // //         for(int i=0; i<3; i++){
// // //             System.out.print(matrix[i][i] + " ");
// // //         }

// // //     }
// // // }
// // //

// // // multiply of 2d matrix

// // public class arr2d{
// //     public static void main(String[] args) {
// //         int [][] a={
// //             {1,2},
// //             {3,4}
// //         };
// //         int [][] b= {
// //             {5,6},
// //             {7,8}
// //         };
// //         int [][]multiArr = new int [2][2];

// //         System.out.println("Multi stated!!");
// //         for(int i=0; i<2;i++){
// //             for(int j=0; j<2; j++){
// //                 for(int k=0; k<2; k++){
// //                     multiArr[i][j] = a[i][k]* b[k][j];
// //                 }
// //             }
// //         }
// //         System.out.println("result");
// //         for(int [] rows: multiArr){
// //             for(int val: rows){
// //                 System.out.print(val + " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// //find the preticular ele it the 2d-arr
// import java.util.Scanner;
// class arr2d{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int [][] matrix = new int [2][2];

//         System.out.println("enter the 4 elements: ");
//         for(int i=0; i<2; i++){
//             for(int j=0; j<2; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
            
//         }
//         System.out.println("Enter the key element to find the positon");
//         int key  = sc.nextInt();
//         boolean found = false;
//         for(int i=0; i<2; i++){
//             for(int j=0; j<2; j++){
//               if(key==matrix[i][j]){
//                 System.out.println("Found at position: (" + i + ", " + j + ")");
//                 found = true;
//               }
//             }
//     }
//     if(!found){
//         System.out.println("Opps!! key value not found!");
//     }
// }
// }