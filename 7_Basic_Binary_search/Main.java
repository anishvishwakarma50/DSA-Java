public class Main {
    public static void main(String[] args) {
        // Array
        int[] arr = {2,4,6,8,10,12,14};

        int start = 0;
        int end = arr.length;
        int target = 10;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Target Found at index " + mid);
                return;
            }
            else if(arr[mid] >= target) {
                end = mid;
            }
            else if(arr[mid] <= target) {
                start = mid;
            }
        }
    }
}
