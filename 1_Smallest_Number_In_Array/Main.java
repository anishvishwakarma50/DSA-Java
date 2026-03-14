public class Main {
    public static void main(String[] args) {
        int[] arr = {12,2,43,0};

        int smallestNum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(smallestNum > arr[i]) {
                smallestNum = arr[i];
            }
        }
        System.out.println("Smallest Integer of Array is : " + smallestNum);
    }
}
