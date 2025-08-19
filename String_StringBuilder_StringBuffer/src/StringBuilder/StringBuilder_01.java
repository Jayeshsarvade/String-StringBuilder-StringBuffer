package StringBuilder;

public class StringBuilder_01 {
    public static void main(String[] args) {

        // Demonstrating string concatenation using immutable String
        concatWithString();

        // Demonstrating string concatenation using mutable StringBuilder
        concatWithStringBuilder();
    }

    /*
        Demonstrates string concatenation using immutable String.
        Each concatenation creates a new String object.
        The time complexity of the selected method is O(n²), where n is the number of iterations (10 in this case).

        This is because string concatenation using the + operator inside a loop creates a new string object each time,
        copying all previous characters, resulting in quadratic time complexity. For each iteration, the string grows, and copying takes longer.
    */
    public static void concatWithString() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // Concatenating strings using the + operator
            result += "Hello " + i + " ";
        }
        System.out.println("Concatenated string using + operator: " + result);
    }

    /*
        Demonstrates string concatenation using mutable StringBuilder.
        Efficient for repeated modifications.
        The time complexity of the selected method is O(n), where n is the number of iterations (10 in this case).
        This is because StringBuilder maintains a mutable sequence of characters, allowing for efficient appending without creating new objects.
    */
    public static void concatWithStringBuilder() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            // Concatenating strings using StringBuilder
            result.append("Hello ").append(i).append(" ");
        }
        System.out.println("Concatenated string using StringBuilder: " + result.toString());
    }
}
