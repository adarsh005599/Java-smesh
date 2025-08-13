// // import java.util.Scanner;

// // // public class Func{
// // //     public static void printMyName(String name){
// // //         System.out.println("the name is : "+  name);
// // //     }
// // //     public static void main(String args[]){
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("enter your name: ");
// // //         String name  = sc.next();
// // //         printMyName(name);
// // //     }
// // // }

// // public class Func{

// //     public static int CalSum(int a , int b){
// //         return  a*b;
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("enter the both numbers: ");
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();

// //         int mul  = CalSum(a,b);
// //         System.out.println("the mul is :" + mul);
        
// //     }
// // }
// // factorial of a number n
// import java.util.*;
// public class Func{
//     public static int fact(int n){
//         if(n<=0){
//             System.out.println("the fact of this num is not cal:");
//             return -1;
//         }
//         int factorial = 1;
//         for (int i=1; i<=n; i++){
//             factorial*=i;
//         }
//         return factorial;
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number for the factorial:");
//         int n = sc.nextInt();
//         int result = fact(n);
//         System.out.println(result);
//     }
// }