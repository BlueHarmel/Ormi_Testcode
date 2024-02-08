public class Car {
    String company = "Tesla";
    int price = 200;
    String sw = "Samsung";

    public Car() {

    }
    public Car(String company,int price){
        this.company = company;
        this.price = price;
    }
    public Car(String company, int price, String sw){
        this.company = company;
        this.price = price;
        this.sw = sw;
    }
    void changeSoftware(){
        this.sw = "Tesla";
    }

    void printSpec(){
        String spec = """
                회사 : %s
                가격 : %d
                소프트웨어 : %s
                """.formatted(this.company,this.price,this.sw);
        System.out.println(spec);
    }
}