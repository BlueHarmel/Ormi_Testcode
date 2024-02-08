package DailyQuiz;

public class Book extends Item{
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    private String author = "베르나르 베르베르";
    private int isbn = 123345;

    @Override
    public String toString() {
        return """
                이름 : %s
                가격 : %d
                id : %d
                작가 : %s
                ISBN : %d
                """.formatted(this.getName(),this.getPrice(),this.getId(),this.getAuthor(),this.getIsbn());
    }
}
