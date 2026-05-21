public class NestedLoop {
    public static void main(String[] args) {
// Example 1:
        int school = 1;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Class :"  + i);
        
        for(int j = 1; j<=2 ; j++){
            System.out.println("Student : " + j );
        }
        System.out.println();
    }

// Example 2:
        
        for (int i = 1; i < 4; i++) {
            System.out.print("*" );
        for (int j = 1; j < 4; j++) {
            System.out.print("*" );
            
        }  
        System.out.println();
        }

// Example 3:
    for (int i = 0; i < 6; i++) {
         System.out.print("*");
    for (int j = 0; j <i; j++) {
        System.out.print("*");
        
    }
    System.out.println();
    }
    }
}
