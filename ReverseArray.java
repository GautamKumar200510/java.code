import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {

        Random r = new Random();

        int arr[] = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        System.out.println("Original Array:");

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Array:");

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}