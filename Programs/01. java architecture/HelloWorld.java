package pkg;

class HelloWorld1 {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}