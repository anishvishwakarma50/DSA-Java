public class Main {
    public static void main(String[] args) {
        // Array
        int[] arr = {2,3,5,23,45,12};

        // Target
        int target = 5;

        // State
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if( target == arr[i] ) {
                System.out.println("Number Exist index :" + i );
                found = true;
                break;
            }
        }
        
        if(!found) {
            System.out.println("Number Not Exist");
        }
    }
}
