// public class pattern {
// ****
// ***
// **
// *

//     public static void printTriangle(int rows, int cols, int total) {
//         if (rows > total) return; // Base case

//         if (cols < rows) {
//             System.out.print("*");
//             printTriangle(rows, cols + 1, total);
//         } else {
//             System.out.println();
//             printTriangle(rows + 1, 0, total);
//         }
//     }

//     public static void main(String[] args) {
//         printTriangle(1, 0, 4);
//     }
// }

// right tir📞📞

// public class pattern {

//     public static void printTriangle(int rows, int cols, int total) {
//         if (rows > total) return; // Base case

//         if (cols < rows) {
//             System.out.print("*");
//             printTriangle(rows, cols + 1, total);
//         } else {
//             System.out.println();
//             printTriangle(rows + 1, 0, total);
//         }
//     }

//     public static void main(String[] args) {
//         printTriangle(1, 0, 5);
//     }
// } 

// dia pttr
// public class pattern {

//     public static void printDiamond(int n, int i) {
//         if (i >= n * 2 - 1) return; // Base case

//         int stars = i < n ? (2 * i + 1) : (2 * (n * 2 - 2 - i) + 1);
//         int spaces = (n * 2 - 1 - stars) / 2;

//         // Print spaces
//         printChars(spaces, ' ');
//         // Print stars
//         printChars(stars, '*');

//         System.out.println();
//         printDiamond(n, i + 1);
//     }

//     private static void printChars(int count, char ch) {
//         if (count == 0) return;
//         System.out.print(ch);
//         printChars(count - 1, ch);
//     }

//     public static void main(String[] args) {
//         printDiamond(3, 0);
//     }
// }

// //
// public class pattern{

//     public static void printPyramid(int currentRow, int col, int totalRows) {
//         if (currentRow > totalRows) return; // Base case

//         if (col == 0) printSpaces(totalRows - currentRow);

//         if (col < currentRow) {
//             System.out.print((col + 1) + " ");
//             printPyramid(currentRow, col + 1, totalRows);
//         } else {
//             System.out.println();
//             printPyramid(currentRow + 1, 0, totalRows);
//         }
//     }

//     private static void printSpaces(int count) {
//         if (count == 0) return;
//         System.out.print(" ");
//         printSpaces(count - 1);
//     }

//     public static void main(String[] args) {
//         printPyramid(1, 0, 4);
//     }
// }


public class pattern{
    public static void main(String args[]){
        for (int i=0; i<11; i++){
            System.out.print("hello " + i);
        }
    }
}
