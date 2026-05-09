public class JavaString {
    public static void main(String[] args) {
// Basic 
        String name = "Gautam";
        System.out.println("Name : " + name);

// String Length
         String Bio = " My name is Gutam kumar.Im currently studing java by Devang sir";
         System.out.println("String Length : " + Bio.length());

// String Methods 
        String Fullname = "Gautam kumar";
        System.out.println("UPPERCASE : " + Fullname.toUpperCase());      // The toUpperCase() method converts a string to upper case letters
        System.out.println("LOWERCASE : " + Fullname.toLowerCase());     // The toLowerCase() method converts a string to lower case letters

// string indexOf()
        String Weather = "Today Weather is too hot!!";
        System.out.println("indexOf() weather : " + Weather.indexOf("too"));     // It tells at which position something is in the string.


// String charAt()
        String Hobby = "My hobby is to cook food  !!";
        System.out.println("Hobby : " + Hobby.charAt(23));        //charAt() method to access a character at a specific position in a string
    }

}
