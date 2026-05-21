public class ArrayQuestion {
    
// Array Sorted h ya nhi??
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,3};

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted)
            System.out.println("Array Sorted Hai");
        else
            System.out.println("Array Sorted Nahi Hai");

// 1,2,2,3,4,4 Remove duplicate from an array
       
    }

}