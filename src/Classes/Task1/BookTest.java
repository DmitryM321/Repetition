package Classes.Task1;
import org.junit.Test;
import org.junit.Assert;
public class BookTest {

    public static void main(String[] args) throws Exception {
        Author author1 = new Author("Dgani", "Rodari");
        Author author2 = new Author("Stiven", "King");
        Book book1 = new Book("Chippoliono", author1, 1965);
        Book book2 = new Book("Mizery", author2, 1979);
        System.out.println(book2);
        book2.setYearPublication(1981);
        System.out.println(book2.getAuthor());
        System.out.println(book2);
    }
    @Test
    public void testBookAuthor() throws Exception {
        Author author = new Author("Stiven", "King");
      //    Book book2 = new Book("Mizery", author, 1979);
        Assert.assertEquals( "Stiven", author.getFirstName());
        Assert.assertEquals( "King", author.getLastName());
    }
    @Test
    public void testBook() throws Exception {
        Author author = new Author("Stiven", "King");
        Book book2 = new Book("Mizery", author, 1979);
        Assert.assertEquals("Mizery", book2.getNameBook());
        Assert.assertEquals(new Author("Stiven", "King"), book2.getAuthor());
        Assert.assertEquals(1979, book2.getYearPublication());
    }
}


