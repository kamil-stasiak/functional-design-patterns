public class MainJava {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println(MainGroovy.hello());
    }

    public static String hello() {
        return "Hello from Java";
    }
}
