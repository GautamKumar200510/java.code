
public class ForLoop {

    public static void main(String[] args) {

// Example 1: Print 1 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(" Print 1 to 10 : " + i);
        }

// Example  2: Print even numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even No. : " + i);
            }
        }

// Example 3: Print Table of 3
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 + " * " + i + " = " + i * 5);

        }

// Example 4: Sum of Numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Sum of no. :" + sum);
            sum = sum + i;
        }

// Example 5: Salary Growth
        int Salary = 10000;
        for (int year = 1; year <= 5; year++) {
            Salary += 500;
        }
        System.out.println("Salry growth : " + Salary);

// Example 6 :
        int steps = 0;
        for(int  day =1; day <=7; day++){
            steps += 435;

        }
        System.out.println("Steps count : " + steps);

    }

}
