public class hello_world {

    public String getMessage() {
        return "Salut, c’est notre première image Docker!!";
    }

    public static void main(String[] args) {
        hello_world helloWorld = new hello_world();
        System.out.println(helloWorld.getMessage());
    }
}
