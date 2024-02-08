public class CarExample {
    public static void main(String[] args) {
        Car sonata1 = new Car("Hyundai", 100);
        sonata1.changeSoftware();
        sonata1.printSpec();

        Car sonata2 = new Car();
        sonata2.printSpec();

        Car sonata3 = new Car("Apple",10000,"Mac");
        sonata3.printSpec();
        sonata3.changeSoftware();
        sonata3.printSpec();
    }
}