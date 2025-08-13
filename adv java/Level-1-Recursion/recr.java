// //  01 print 1-n number using recr 😏😏
// public class recr {

//     static void print1ToN(int n){

//         if(n==0) return;
//         print1ToN(n-1);
//         System.out.print(n + " ");
//     }

//     public static void main(String args[]){
//         int n= 5;
//         print1ToN(n);
//     }
// }

// 02 using user input and  with dec order 🥲🥲

// import java.util.Scanner;

// public class recr{

//     static void print1ToN(int n){
//         if(n==0) return;
//         System.out.print(n + " ");  // start from n first then dec to -1🔫🔫
//         print1ToN(n-1);

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Ohh Yess!!  enter the number please");
//         int n = sc.nextInt();
//         print1ToN(n);
//         sc.close();

//     }
// }

// 03 sum of natural no from i to n default🍼🍼

// public class recr{
//     static int sum(int n){
//         if(n==0) return 0;
//         return n + sum(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("sum is: " + sum(n));
//     }
// }

// 04 factorial 

// import java.util.Scanner;

// public class recr{
//     static int fact( int n ){
//         if(n==0 || n==1) return 1;
//         return  n* fact(n-1);

//     }
//     public static void main(String[] args) {
//         Scanner sc=  new Scanner(System.in);
//         System.out.println("Enter the number to find the factorial");
//         int n = sc.nextInt();
//         System.out.println("the factorial of number :" + fact(n));
//     }
// }  

//05 fab series

// public class recr{
//     static int fib(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return (fib(n-1) + fib(n-2));

//     }
//     public static void main(String[] args) {
//         int n = 7;
//         for (int i=0; i<n; i++){
//             System.out.print(fib(i) + " ");
//         }
//     }
// }

//06 revers a string
//  import java.util.Scanner;

//  public class recr{
//     static String revString(String str){
//         if(str.isEmpty()) return str;
//         return revString(str.substring(1)) + str.charAt(0);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String ! ");
//         String s = sc.nextLine();
//         System.out.println("reversed String is: "  + revString(s));
//     }
//  }

// 07 Palindrome or not

// import java.util.Scanner;

// public class recr{
//     static boolean isPalindrome(String str, int start, int end) {
//         if (start >= end) return true;
//         return str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String : ");
//         String str = sc.nextLine();
//         System.out.println("Is palindrome? " + isPalindrome(str, 0, str.length() - 1));
//     }
// }

// 08  square of the number and take the number as a input
// import java.util.Scanner;
// public class recr{
//     static int square(int x , int n){
//         if(n==0) return 1;
//         return (x * square(x, n-1));
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Base: ");
//         int x = sc.nextInt();

//         System.out.println("Enter the exponant: ");
//         int n = sc.nextInt();

//         System.out.println("the Power is: " + square(x, n));
//     }
// }

// 09 gcd(a, b) = gcd(b, a % b)

// public class recr{
//     static int gcd(int a, int b){
//         if(b==0) return a;
//         return gcd(b, (a % b));
//     }
//     public static void main(String[] args) {
//         int a = 48, b = 12;
//         System.out.println("the gdc is: "  + gcd(a, b));
//     }
// }

// 10 sum of n
// import java.util.Scanner;

// public class recr {
//     static int sumDigits(int n) {
//         if (n == 0) return 0;
//         return (n % 10) + sumDigits(n / 10);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int num = sc.nextInt();
//         System.out.println("Sum of digits = " + sumDigits(num));
//     }
// }
