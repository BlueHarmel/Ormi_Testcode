package DailyQuiz;

public class Item {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int id;
    private String name;
    private int price;

    Item(){
        id=1234;
        name="박지원";
        price=1000;
    }
}
