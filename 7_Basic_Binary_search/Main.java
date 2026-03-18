// public class Main {
//     public static void main(String[] args) {
//         // Array
//         int[] arr = {2,4,6,8,12,14};

//         int start = 0;
//         int end = arr.length - 1;
//         int target = 10;
//         int mid = 0;
//         boolean found = false;
//         while (start <= end) {
//             mid = (start + end) / 2;
//             if (arr[mid] == target) {
//                 found = true;
//                 break;
//             }
//             else if(arr[mid] >= target) {
//                 end = mid - 1;
//             }
//             else if(arr[mid] <= target) {
//                 start = mid + 1;
//             }
//         }

//         if (!found) {
//             System.out.println("Target Not Found!!");
//         }
//         else {
//             System.out.println("Target Found at index " + mid);
//         }
//     }
// }

// Complexity of Algorithm is O(log n)
// Following is the improved version
public class Main {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14};

        int start = 0;
        int end = arr.length - 1;
        int target = 10;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                System.out.println("Target Found at index " + mid);
                return;
            }

            else if(target < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        System.out.println("Target not found");
    }
}