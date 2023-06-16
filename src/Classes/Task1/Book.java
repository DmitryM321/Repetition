package Classes.Task1;

public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
