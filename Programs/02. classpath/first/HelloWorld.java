public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world from first program");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}