public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world from second program");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

//jar cf program.jar *.class
//jar cfe program.jar HelloWorld *.class