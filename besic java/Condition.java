// public class Condition {
//     public static void main(String[] args) {
        
//         for(int i=0; i<11; i++){
//             System.out.print(i + " ");
//         }
//     }
// }

// import java.util.*;

// class Condition{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the age!");
//         int age = sc.nextInt();
//         if(age>=18){System.out.println("you can vote!" + age);}
//         else{System.out.println("Opps!! you can not vote!!" + age);}

// //     }
// // }

// // // class Condition {
// // //     public static void main(String args[]) {
// // //         for (int i = 0; i < 5; i++) {
// // //             for (int j = 0; j < 4; j++) {
// // //                 System.out.print("00");
// // //             }
// // //         }
// // //         System.out.println();
// // //     }
// // // }

// // // quad equn. finding roots

// // import java.util.Scanner;

// // class Condition{
// //     public static void main(String args[]){

// //         Scanner input = new Scanner(System.in);

// //         System.out.println("input a"); double a = input.nextDouble();
// //         System.out.println("input b"); double b= input.nextDouble();
// //         System.out.println("input c"); double c = input.nextDouble();

// //         double result = (b * b) - (4 * a * c);

// //         if(result>0){
// //             double root1 =(-b + Math.pow(result, 0.5))/ (2.0 *a);
// //             double root2 =(-b - Math.pow(result, 0.5))/ (2.0 *a);
// //             System.out.println("Roots are " + root1 +  " and " + root2);
// //         }
// //         else if(result==0){
// //             double root1 = (-b / (2.0 *a));
// //             System.out.println("Roots are " + root1);
// //         }
// //         else{
// //             System.out.println("roots are not natural");
// //         }
       


// //     }
// // }

// // vowel or const

// import java.util.Scanner;
//  class Condition{
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         System.out.println("enter a char to know vowel? or const? :");
//        String input = in.next().toLowerCase();
     

//        boolean uppercase = input.charAt(0)>= 65 && input.charAt(0) <=90;
//        boolean lowerCase = input.charAt(0)>=97 && input.charAt(0) <=122;

//         boolean vowel = input.equals("a") || input.equals("e") ||  input.equals("i") || input.equals("o") || input.equals("u");

//         if(input.length() >1){System.out.println("Error , Not a single character");}
//         else if(!(uppercase || ! lowerCase)){System.out.println("Error, Enter a Upper or lowercase char: ");}
//         else if(vowel){System.out.println("Inout char is a vowel:");}
//         else{System.out.println("input char is Constant: ");}
        

//     }
//  }

