public class Break {
    public static void main(String[] args) {
// Example : 1
        for (int i = 1; i < 10; i++) {
            if(i==6){
                break;
            }
            System.out.println(i);
        }

// Example : 2
            for (int attempt = 1; attempt <=3; attempt++) {
                if(attempt==3){
                    System.out.println("machine block");
                    break;
                }
            }
        
    }

}
