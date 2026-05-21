<<<<<<< HEAD
import java.util.*;
public class Array {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[5];
    int odd = 0;
    int even =0;
    int arr2[]={0,2,0,4,5}; //  print - 12045   actual output - 24500
    


    System.out.println("Enter 5 values");

    for(int i = 0 ; i<5 ; i++){
         arr[i] = sc.nextInt();
    }


    // even number 

    System.out.println("Even number");

    // System.out.println("Numbers are :");

    // for(int i = 0 ; i<5 ; i++){
    //     System.out.println("numbers are: "+arr[i]);
    // }
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 2==0)
           even++;
        else{
           odd++;
        }

        
    }

    System.out.println("Even count is :"+even);
    System.out.println("Odd countt is : "+odd);

    sc.close();
}

=======
public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
    }

>>>>>>> e79f71bf8e0c9199374de0589f6b21da3d789d0d
}
