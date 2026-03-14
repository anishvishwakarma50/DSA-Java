public class Main {
    public static void main(String[] args){
        // Array
        int[] arr = { 34, 2, 5, 2, 1, 45 ,65, 12 };
        // Target
        int target = 65;

        for(int i = 0; i < arr.length; i++) {
            if( target == arr[i]) {
                System.out.println("Target Found on index "+ i);
                return;
            }
        }
    }
}
