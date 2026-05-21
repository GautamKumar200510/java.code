public class Operators {
    public static void main(String[] args) {

// ARITHMECTIC OPERATORS 
    int x = 4;
    int y= 9;

    System.out.println("Addition = " + (x+y ));                        // Adds together two values
    System.out.println( "Subtraction = " + (x-y));                    // Subtracts one value from another
    System.out.println("Multiply = " + x*y);                         // Multiplies two values
    System.out.println("Divison = " + x/y );                        // Divides one value by anothe
    System.out.println("Module = " + x%y);                         // Returns the division remainder

// INCREMENT & DECREMENT
     int a = 7;
     System.out.println("Increment : " + ++a );   // Increases the value of a variable by 1

     int b = 5;
     System.out.println("Decrement : " + --b);   //  Decreases the value of a variable by 1

// COMPARISION OPERATORS
      int l = 3;
      int m = 6;
      System.out.println("Equal to : " + (l == m));
      System.out.println(" Not equal : " + (l !=  m));
      System.out.println("Less than : " + (l <m));
      System.out.println("Greater than :  " + (l>m));
      System.out.println( "Less than or equal to : "  + (l<=m));
      System.out.println("Greater than or equal to : " + (l>=m));

// LOGICAL OPERATORS
     int age = 20;

     System.out.println("Logical and : " + (age > 18 && age < 30));       // Returns true if both statements are true
     System.out.println("Logical or : " + (age > 18 || age < 10));       // Returns true if one of the statements is true
     System.out.println("Logical not : " + !(age > 18));                //  Reverse the result, returns false if the result is true
        
        
    }

}
