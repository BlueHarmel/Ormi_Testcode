public class ChangeNumbers {
    public static void main(String[] args) {
        int x = 1;
        int y = 20;
        int z = 300;

        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}