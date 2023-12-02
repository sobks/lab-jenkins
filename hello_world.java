public class HelloWorld {

    public String getMessage() {
        return "Salut, c’est notre première image Docker!!";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getMessage());
    }
}
