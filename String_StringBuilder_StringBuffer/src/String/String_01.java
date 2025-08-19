package String;

public class String_01 {

    public static void main(String[] args) {
        // String is immutable in Java; we cannot change or modify the original string object.
        stringWithLiteralImmutable();
        //Strings are immutable in Java; concat() returns a new String object, does not modify str2
        stringWithObjectMutable();
    }


    /*
    This method demonstrates string immutability using a string literal in Java.
    It shows that calling concat() on a string does not change the original string, but returns a new one.
    The method prints the length of the string and then attempts to concatenate another string, illustrating that the original value remains unchanged.
    */
    public static void stringWithLiteralImmutable() {
        String str = "Hello";
        // Print the length of the string
        System.out.println("Length of the string: " + str.length());
        str.concat("world");
        // Print the concatenated string
        System.out.println("Concatenated string: " + str);    // String is immutable in Java; we cannot change or modify the original string object.
    }


    /*
    This method demonstrates how strings work in Java.
    It shows that strings are immutable, meaning their values cannot be changed after creation.
    When you use the concat() method to add text to a string, it creates a new string instead of changing the original one.
    The method prints the length of the original string and the result of concatenation. This helps you understand that string operations return new objects, not modify the existing ones.
     */
    public static void stringWithObjectMutable() {
        String str2 = "Hello";
        // Print the length of the string
        System.out.println("Length of the string: " + str2.length());
        String concat = str2.concat("world");  //Strings are immutable in Java; concat() returns a new String object, does not modify str2
        // Print the concatenated string
        System.out.println("Concatenated string: " + concat);
    }
}
