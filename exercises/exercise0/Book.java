public class Book {

    //properties
    String isbn;
    String title;
    String author;
    String publisher;
    double price;
    String language;
    double numberOfPages;
    String publicationYear;

    // print a statement in constructor
    public Book(String isbn, String title, String author, String publisher, double price, String language, double numberOfPages, String publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.language = language;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;

        System.out.println("Book information: \nISBN: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nPrice: " + price + "\nLanguage: " + language + "\nNumber of pages: " + numberOfPages + "\nPublication Year: " + publicationYear);
    }

    // methods
    public void readBook() {
        System.out.println("Reading " + title);
    }

    public void lendBook() {
        System.out.println("Lending " + title);
    }

    public void returnBook() {
        System.out.println("Returning " + title);
    }

    // a Main method to instantiate 3 objects
    public static void main(String[] args) {
        Book book1 = new Book("978-0137673810", "Core Java, Volume I: Fundamentals, 12th Edition", "Cay Horstmann", "Oracle Press", 49, "English", 944, "2021");
        book1.readBook();
        System.out.println("====================");

        Book book2 = new Book("978-0131872486", "Thinking in Java, 4th Edition", "Bruce Eckel", "Pearson", 51, "English", 1150, "2006");
        book2.lendBook();
        System.out.println("====================");

        Book book3 = new Book("978-0596009205", "Head First Java, 2nd Edition", "Kathy Sierra", "O'Reilly Media",45,"English", 688, "2005");
        book3.returnBook();
    }

}
