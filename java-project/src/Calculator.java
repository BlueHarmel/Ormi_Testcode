public class Calculator {
    int prefixOperator(int a) {
        return ++a;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        a = calculator.prefixOperator(a);
        System.out.println(a);          // a = 2로 출력되도록 메소드 수정하기
    }
}
