package Classes.Task1;

public class BookTest {
    public static void main(String[] args) {
        Author author1 = new Author("Dgani", "Rodari");
        Author author2 = new Author("Stiven", "King");
        Book book1 = new Book("Chippoliono", author1, 1965);
        Book book2 = new Book("Mizery", author2, 1979);
        System.out.println(book2);
        book2.setYearPublication(1981);
        System.out.println(book2);
    }

}
