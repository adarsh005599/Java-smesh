
// // import java.util.Scanner;

// // public class array{
// //     public static void main(String args[]){
// //         int [] numbers  = {10,20,30,40,50};

// //         for (int num: numbers){
// //             System.out.print(num + " ");
// //         }
// //     }
// // }

// // sum of the all elements of the array
// // public class array{
// //     public static void main(String args[]){
// //         int [] sumArr = {10, 20, 30};
// //         int sum=0;
// //         for (int num: sumArr){
// //             sum +=num;
// //             System.out.println(sum);
// //         }
// //     }
// // }

// // find the max and the min in the given array
// // class array{
// //     public static void main(String args[]){
// //         int [] maxNum = {10,3,466,67};
// //         int max = maxNum[0];
// //         int min = maxNum[max];
// //         for (int num: maxNum){
// //             if(num>max){
// //                 max=num;
// //             }
// //             if(min<max){
// //                 min=max;
// //             }
// //         }
// //         System.out.println("the max number is: " + max);
// //         System.out.println("the max number is: " + min);
// //     }
// // }

// // class array{
// //     public static void main(String args[]){
// //         int [] reverseArr = {10, 20, 30, 40, 50};
// //             System.out.println(" reversed");
// //             for(int i = reverseArr.length-1; i>=0; i--){
// //                 System.out.print(reverseArr[i]+ " ");
// //             }
// //     }
// // }
// // revers the array ele using taking the input
// // import  java.util.Scanner;

// // public class array{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("enter the elements of the array: ");
// //         int n = sc.nextInt();

// //         int [] revArr = new int[n];

// //         // printing the elements of the array
// //         for (int i=0; i<n; i++){
// //             revArr[i] = sc.nextInt();        
// //         }
// //         // rev the array
// //         System.out.println("reversed array!: ");
// //         for (int i= n-1; i>=0; i--){
// //             System.out.println(revArr[i] + " ");
// //         }
// //     sc.close();
   
// //     }
// // }

// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take array size
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         // Take array elements
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Reverse and print
//         System.out.print("Reversed array: ");
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }
