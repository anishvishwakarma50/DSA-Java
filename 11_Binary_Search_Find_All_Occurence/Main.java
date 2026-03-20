public class Main {
    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int result = -1;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;       // store answer
                end = mid - 1;      // move LEFT
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }
        return result;
    }
    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int result = -1;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;       // store answer
                start = mid + 1;      // move Right
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }
        return result;
    }
    static int countOccurrences(int[] arr, int target) {
        int fo = firstOccurrence(arr, target);
        int lo = lastOccurrence(arr, target);
        
        return lo - fo + 1;    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int co = countOccurrences(arr, target);

        System.out.println("Total Count of " + target + " is " + co);
    }
}
