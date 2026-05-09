import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {

//Example 1 : check whether a number is divisible by both 5 and 11 or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value : ");
        int Num1 = sc.nextInt();
        if (Num1% 5 == 0 && Num1%11 == 0) {                  // && means AND (both condition must be true )
            System.out.println("Divsible  by 5 & 11");     
         }

          else{
            System.out.println("Not Divisible by 5&11");

          }

// Example 2 : Leap Year or not
            System.out.println("Year :");
            int year = sc.nextInt();
            if ((year%4 == 0 && year % 100 !=0) || year%400 == 0 ){
                System.out.println("Leap Year");
            } else {
                System.out.println("Not");
            }
        }
        

        
    }

