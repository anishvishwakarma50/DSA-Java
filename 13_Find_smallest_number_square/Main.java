// Find smallest Square number using Binary Search
public class Main {

    static int sqrt(int n) {

        int start = 0;
        int end = n;
        int result = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }

            else if (mid * mid >= n) {
                result = mid;       // store possible answer
                end = mid - 1;    // try smaller
            }

            else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(20));
    }
}