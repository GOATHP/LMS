package FinalAssignment;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String title;
    private String publishDate;
    private String author;
    private String publisher;
    private String bookInfo;
    private String isbn;
    private boolean avaliable = true;
    private LocalDate borrowedDate;
    private LocalDate returnDate;
    private boolean extended;
    private static ArrayList<Book> bookList = new ArrayList<Book>(); 

    public Book(String title, String publishDate, String author, String publisher
            ,String bookInfo, String isbn, boolean avaliable, boolean extended) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.publisher = publisher;
        this.bookInfo = bookInfo;
        this.isbn = isbn;
        this.avaliable = avaliable;
        bookList.add(this);
        this.extended = true;
    }
    
    public static void loadBooksFromCSV() {
        CSVReader csvReader = new CSVReader();
        ArrayList<String[]> dataRows = csvReader.getDataRows();
        
        for (String[] data : dataRows) {
            String title = data[0];
            String publishDate = data[1];
            String author = data[2];
            String publisher = data[3];
            String bookInfo = data[4];
            String isbn = data[5];
            boolean avaliable = false;
            boolean extended = true;
            Book book = new Book(title,publishDate,author,publisher,bookInfo,isbn,avaliable, extended);
        }
    }
    public static void addNewBook(String title, String publishDate, String author, String publisher
            ,String bookInfo, String isbn, boolean avaliable, boolean extended) {
        Book book = new Book(title, publishDate, author, publisher, bookInfo, isbn, avaliable, extended);
    }
    
    public void extendBorrowPeriod() {
        if (this.isExtended() || LocalDate.now().isAfter(this.returnDate)) {
            System.out.println("대출 연장이 불가능합니다.");
            return;
        }
        this.returnDate = this.returnDate.plus(1, ChronoUnit.WEEKS);
        this.extended = true;
        System.out.println("대출 기간이 연장되었습니다. 반납일자: " + this.returnDate);
    }
    
    public boolean isExtended() {
        return extended;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(String bookInfo) {
        this.bookInfo = bookInfo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public static void setBookList(ArrayList<Book> bookList) {
        Book.bookList = bookList;
    }
    public void borrowBook() {
        this.borrowedDate = LocalDate.now();
        this.returnDate = this.borrowedDate.plus(2, ChronoUnit.WEEKS);
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", publishDate=" + publishDate + ", author=" + author + ", publisher=" + publisher
                + ", bookInfo=" + bookInfo + ", isbn=" + isbn + ", avaliable=" + avaliable + "]";
    }
    public static void main(String[] args) {
        Book.loadBooksFromCSV();
        ArrayList<Book> bookList = Book.getBookList();
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}



