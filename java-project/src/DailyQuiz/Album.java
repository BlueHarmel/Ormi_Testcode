package DailyQuiz;

public class Album extends Item{
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    private String artist = "이서연";

    @Override
    public String toString() {
        return """
                이름 : %s
                가격 : %d
                id : %d
                작곡가 : %s
                """.formatted(this.getName(), this.getPrice(), this.getId(), this.getArtist());
    }
}

