public class Animal {
    String name = "하냥";
    Boolean sleep = false;

    public Animal() {

    }
    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, Boolean sleep) {
        this.name = name;
        this.sleep = sleep;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void sleep(){
        this.sleep = true;
    }
}
