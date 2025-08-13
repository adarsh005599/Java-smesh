// public class recr{

//     // Recursive function to find the maximum
//     static int findMax(int[] arr, int index) {
//         // Step 1: Base case - if at last element, return it
//         if (index == arr.length - 1) return arr[index];

//         // Step 2: Recursively find max in remaining array
//         int maxInRest = findMax(arr, index + 1);

//         // Step 3: Compare and return bigger value
//         return Math.max(arr[index], maxInRest);
//     }

//     public static void main(String[] args) {
//         int[] numbers = {10, 25, 3, 47, 15};
//         System.out.println("Maximum: " + findMax(numbers, 0));
//     }
// }

// 