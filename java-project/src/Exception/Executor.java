package Exception;

public class Executor {
    public static void main(String[] args) {
        exceptionTest();
//        exceptionTest2();
    }

    public static void exceptionTest(){
        throw new RunXXXException("런타임 예외 던지기");
    }

    public static void exceptionTest2() throws XXXException {
        throw new XXXException("checked 예외 던지기");
    }
}
