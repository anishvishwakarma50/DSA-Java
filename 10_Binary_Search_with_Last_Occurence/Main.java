public class Main {
    static int Binary_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int result = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                result = arr[mid];
                start = mid+1;
            }
            else if (target < arr[mid]) {
                end = arr[mid] - 1;
            }
            else {
                start = arr[mid] + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int bs = Binary_Search(arr, 4);
        
        System.out.println(bs);
    }
}
