public class MethodEx {
    // static int greater(int a,int b){
    //     if(a>b)
    //         return a;
    //     else
    //         return b;
    // }

    // public static void main(String[] args){
    //     System.out.println(greater(20,15));
    // }


      static void check(int n){
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args){
        check(8);
    }
}
