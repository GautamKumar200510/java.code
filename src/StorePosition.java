public class StorePosition {
 
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int position = 2;
        int value = 99;

        arr[position] = value;

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

