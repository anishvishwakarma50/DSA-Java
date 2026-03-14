public class Main {
    public static void main(String[] args){
        // Array
        int[] arr = {3,5,1,6};
        
        // Sum variable
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Array is : " + sum);
    }
}
