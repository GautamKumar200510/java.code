public class Desending {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,};            // i=0   arr[]
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0+i; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j ]= temp;
                    
                }
                
            }      
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Descending Order:" + arr[i]);
            
        }


        
    }

}
