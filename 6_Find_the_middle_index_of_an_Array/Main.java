public class Main {
    public static void main(String[] args) {

        int[] arr = {12,23,12,34,12,54,65,45};

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end) / 2;

        System.out.println("Middle Index: " + mid);
        System.out.println("Middle Element: " + arr[mid]);
    }
}