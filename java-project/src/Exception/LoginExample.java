package Exception;

public class LoginExample {

    public static void main(String[] args) {
        System.out.println(testReturnInTryBlock());
    }

    public static String testReturnInTryBlock() {
        try {
            return "Try block executed";
        } catch (Exception e) {
            return "Catch block executed";
        } finally {
            System.out.println("Finally block executed");
        }
    }
}