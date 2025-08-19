package StringBuilder;

// Demonstrating the use of StringBuilder in a multi-threaded environment
/*StringBuilder is not thread-safe because its methods are not synchronized. When multiple threads modify a single StringBuilder instance concurrently,
it can lead to data corruption or unexpected results. In your code, both Task threads append to the same StringBuilder object, which may cause race conditions.
 */
public class StringBuilder_02 {

    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        Task task1 = new Task(sb);
        Task task2 = new Task(sb);
        task1.start();
        task2.start();
        task1.join();
        task2.join();

        System.out.println("Final Length: "+sb.length());
    }
}

class Task extends Thread {
    private StringBuilder sb;

    public Task(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("a ");
        }
    }
}

