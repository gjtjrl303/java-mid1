package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] part = email.split("@");
        for (String s : part) {
            System.out.println("s = " + s);
        }
    }
}
