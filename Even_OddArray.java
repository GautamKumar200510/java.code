import java.util.Random;

public class Even_OddArray {
    public static void main(String[] args) {

        Random r = new Random();

        int arr[] = new int[10];

        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);

            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}