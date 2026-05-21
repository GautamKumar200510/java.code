public class NestedIf {
    public static void main(String[] args) {
// if statement inside another if. This is called a nested if statement.

// Example : 1
        int age = 18;
        int weight = 60;
        if(age>=18){
            System.out.println("fit for gym");
        }
        if (weight>=60) {
            System.out.println("also fit for gym");
        }

// Example : 2 if a person is old enough to vote, and if they are a citizen 
        int Age = 18;
        boolean Citizen = true;
        if (Age>=18) {
            System.out.println("Able to vote");
        
        if (Citizen == true) { 
            System.out.println("You are Citizen So you can vote");
        }
        else{
            System.out.println("you must be citizen");
        }
    }else{
        System.out.println("not able to vote");
    }
    }

}
