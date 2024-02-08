public class AutoBoxingPerformanceExample {
    //오토박싱 연산
    public static void main(String[] args) {
        long startTimeMs = System.currentTimeMillis();
        Long sum = 0L;
        for (int i = 0; i < 1000000000; i++) {
            sum = sum + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");
        test();
    }
    //형변환 연산
    public static void test() {
        long startTimeMs = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 0; i < 1000000000; i++) {
            sum = sum + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");
    }
}
