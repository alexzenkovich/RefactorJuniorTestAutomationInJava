package tasks.classes;

import java.util.ArrayList;
import java.util.List;

public class LibrarySection {
    private final String sectionName;
    private final List<Book> books = new ArrayList<>();

    public LibrarySection(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionName() {
        return sectionName;
    }

    void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBookListByAuthor(String author) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<Book> getBookListByPublishingHouse(String publishingHouse) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<Book> getBookListAfterYear(int year) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                bookList.add(book);
            }
        }
        return bookList;
    }
}
