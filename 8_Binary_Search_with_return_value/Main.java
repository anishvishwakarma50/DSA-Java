public class Main {
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,34,45,46,48,49,52,62,64};
        int bs = BinarySearch(arr, 50);

        if (bs >= 0) {
            System.out.println("Found Index " + bs);
        }
        else {
            System.out.println("Not Found Index");
        }
    }

}
