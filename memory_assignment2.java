public class memory_assignment2 {

    public static void main(String[] args) {
        // Allocate a string in memory
        String message = new String("Hello!, this is memory management in Java");

        // Use the string
        printMessage(message);

        // Dereference to make it eligible for garbage collection
        message = null;

        // Suggest garbage collection
        System.gc();

        System.out.println("End of main method");

        // Add delay so VisualVM can attach before program exits
        try {
            Thread.sleep(50000);  // Waits for 50 seconds (50,000 ms)
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

    }

    public static void printMessage(String msg) {
        System.out.println("Message: " + msg);
    }
}
