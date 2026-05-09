import java.util.Scanner;   // Import before Scanner class
public class IfElse {
    public static void main(String[] args) {

//Example : 1
        float CGPA = 7.5f;
        if (CGPA>=8.5){                                     // if to specify a block of code to be executed, if a specified condition is true
            System.out.println("Student : Eligble for Placement" );
        }
        else{                                               // else to specify a block of code to be executed, if the same condition is false
            System.out.println("Student : Not Eligble for Placement");
        }

//Example : 2
        int time = 21;
        if(time<18){
            System.out.println("Say : Good Morning");
        }
        else{
            System.out.println("Say : Good Evening");
        }

//Example : 3
        int age =13;
        if (age>=18) {
            System.out.println("Vote: You are Eligble");
            
        } else {
            System.out.println("Vote: You are not Eligble");
        }

//Example : 4
        
        Scanner sc = new Scanner(System.in);      // Create Object
        System.out.println("Input Num1:");
        int Num1 = sc.nextInt();                 // Take Input from the user
        System.out.println("Input Num2:");
        int Num2 = sc.nextInt();

        if (Num1 > Num2) {
            System.out.println("Maximun : " + Num1);
        } else {
            System.out.println("Minimum : " + Num2);
        }
        
        //sc.close();                             // Closing the Scanner after using  (it saves memory)

// Example : 5 

        System.out.println("Input Value :");
        int InputValue = sc.nextInt();
        
        if (InputValue%2==0) {
            System.out.println(" Even");
            
        } else {
            System.out.println("Odd");
        }




        }
    }


