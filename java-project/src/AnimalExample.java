public class AnimalExample {
    public static void main(String[] args) {
        Animal cat1 = new Animal();
        System.out.println("""
                고냥이 이름 : %s
                자고있냥? : %b        
                        """.formatted(cat1.name, cat1.sleep));

        Animal cat2 = new Animal("메건");
        System.out.println("""
                고냥이 이름 : %s
                자고있냥? : %b        
                        """.formatted(cat2.name, cat2.sleep));

        Animal cat3 = new Animal("로지라인", true);
        System.out.println("""
                고냥이 이름 : %s
                자고있냥? : %b        
                        """.formatted(cat3.name, cat3.sleep));
    }
}