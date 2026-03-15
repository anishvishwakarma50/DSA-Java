public class Main {
    public static void main(String[] args) {
        // Array
        int[] arr = {12,43,35,56,12,4};

        // Counter
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even Number's Count is " + count);
    }
}
