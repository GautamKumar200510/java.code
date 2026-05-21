public class BreakandContinue {
    public static void main(String[] args) {
// Example : 1 a list of numbers where you want to skip negative values, but stop completely if you find a zero:
       int num[] = {2, 4, 9, -7,30,0};
       for (int Num : num){
        if(Num<0){
            continue;
        }
        if(Num==0){
            break;
        }
        System.out.println(Num);

       }
       
    }

}
