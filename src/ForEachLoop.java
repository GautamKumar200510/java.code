public class ForEachLoop {
    public static void main(String[] args) {
// Example : 1
        int arr[] = {10,20,30,40,50};
        for(int num : arr){
            System.out.println(num);
        }
// Exapmle : 2
        String name[] = {"gautam", "Brishal"};
        for(String Name : name){
            System.out.println(Name);
        }
// Example : 3
        int fact = 1;
        for (int i = 1; i <=5; i++) {
            fact = fact*i;}
            System.out.println(fact);
            
        

    }

}
