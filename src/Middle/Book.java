package Middle;

public class Book {
    private final String bookName;
    private final int yearPublishing;
    private final String autor;

    public  String getBookName() {
        return this.bookName;
    }
    public String getAutor() { return this.autor; }

    public int getYearPublishing() { return yearPublishing; }

    // конструктор класса
    public Book (String bookName, String autor, int yearPublishing) {
        this.bookName = bookName;
        this.autor = autor;
        this.yearPublishing = yearPublishing;
    }
}