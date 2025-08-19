

public class CheckingThePerformance {

    public static void main(String[] args) {
        long totalStringTime = 0, totalStringBuilderTime = 0, totalStringBufferTime = 0;

        for (int j = 0; j < 10; j++) {
            long startTime, endTime;

            // Measure time for String concatenation
            startTime = System.nanoTime();
            concatWithString(10000);
            endTime = System.nanoTime();
            totalStringTime += (endTime - startTime);

            // Measure time for StringBuilder concatenation
            startTime = System.nanoTime();
            concatWithStringBuilder(10000);
            endTime = System.nanoTime();
            totalStringBuilderTime += (endTime - startTime);

            // Measure time for StringBuffer concatenation
            startTime = System.nanoTime();
            concatWithStringBuffer(10000);
            endTime = System.nanoTime();
            totalStringBufferTime += (endTime - startTime);
        }
        System.out.println("Total time for String concatenation: " + totalStringTime / 10 + " ns");
        System.out.println("Total time for StringBuilder concatenation: " + totalStringBuilderTime /10  + " ns");
        System.out.println("Total time for StringBuffer concatenation: " + totalStringBufferTime /10  + " ns");
    }



    public static void concatWithString(int times) {
        String result = "java";
        for (int i = 0; i < times; i++) {
            result += " Programing ";
        }
    }

    public static void concatWithStringBuilder(int times) {
        StringBuilder result = new StringBuilder("java");
        for (int i = 0; i < times; i++) {
            result.append(" Programing");
        }
    }

    public static void concatWithStringBuffer(int times) {
        StringBuffer result = new StringBuffer("java");
        for (int i = 0; i < times; i++) {
            result.append(" Programing");
        }
    }
}
