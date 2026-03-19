public class Main {

    static int firstOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

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

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int index = firstOccurrence(arr, target);

        if (index != -1) {
            System.out.println("First Occurrence at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}