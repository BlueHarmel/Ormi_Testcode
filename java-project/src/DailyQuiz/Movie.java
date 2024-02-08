package DailyQuiz;

public class Movie extends Item{
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    private String director = "클린스만";
    private String actor = "백지헌";

    public String toString(){
        return """
                이름 : %s
                가격 : %d
                id : %d
                감독 : %s
                배우 : %s
                """.formatted(this.getName(),this.getPrice(),this.getId(),this.getDirector(),this.getActor());
    }
}
