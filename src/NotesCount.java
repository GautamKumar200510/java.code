public class NotesCount {
    public static void main(String[] args) {
        int notes = 575;
        int note500 = notes/500; 
        System.out.println("500 = " + note500);
        notes%= 500;
        int notes100 = notes/100;
        notes%= 100;
        int notes50 = notes/50;
        notes%= 50;
        int notes20 = notes/20;
        notes%= 20;
        int notes10 = notes/10;
        notes%= 10;
        int notes5 = notes/5;
        notes%= 5;

        System.out.println("100 = " + notes100);
        System.out.println("50 = " + notes50);
        System.out.println("20 = " + notes20);
        System.out.println("10 = " + notes10);
        System.out.println("5 = " + notes5);

        
        
    

    
    }

}
