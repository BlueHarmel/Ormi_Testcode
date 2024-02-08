package DailyQuiz;

public class ItemManager {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Album album = new Album();
        Book book = new Book();
        
        movie.setActor("이채영");
        album.setPrice(50000);
        book.setName("노지선");

        System.out.println(movie);
        System.out.println(album);
        System.out.println(book);
    }
}
