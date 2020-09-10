package tasks.classes;

public class Book {
    {
        allBooks++;
    }

    private static int allBooks = 0;
    private int id = allBooks;

    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberPages;
    private int price;
    private String bidingType;

    public Book(String name, String author, String publishingHouse, int year, int numberPages, int price, String bidingType) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberPages = numberPages;
        this.price = price;
        this.bidingType = bidingType;
    }

    public Book(String name, String author, String publishingHouse, int year) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
    }

    public Book(String name, String author, String publishingHouse, int year, int numberPages) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberPages = numberPages;
    }

    public Book(String name, String author, String publishingHouse, int year, String bidingType) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.bidingType = bidingType;
    }

    public static int getAllBooks() {
        return allBooks;
    }

    public static void setAllBooks(int allBooks) {
        Book.allBooks = allBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBidingType() {
        return bidingType;
    }

    public void setBidingType(String bidingType) {
        this.bidingType = bidingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", numberPages=" + numberPages +
                ", price=" + price +
                ", bidingType='" + bidingType + '\'' +
                '}';
    }
}
