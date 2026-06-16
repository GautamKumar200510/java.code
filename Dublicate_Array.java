import java.util.Random;

public class Dublicate_Array{
    public static void main(String[] args) {

        Random r = new Random();

        int arr[] = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }

        System.out.println("Duplicate Elements:");

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}