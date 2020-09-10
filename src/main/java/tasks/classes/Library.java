package tasks.classes;


import java.util.List;

public class Library {
    public static void main(String[] args) {

        LibrarySection librarySection = new LibrarySection("Fantasy");

        librarySection.addBook(new Book("451 градус по Фаренгейту", "Брэдбери Р.", "Азбука", 1953, "мягкий"));
        librarySection.addBook(new Book("Вино из одуванчиков", "Брэдбери Р.", "Азбука", 1957, "твёрдый"));
        librarySection.addBook(new Book("Цветы для Элджернона", "Киз Д.", "Эксмо", 2007, "твёрдый"));
        librarySection.addBook(new Book("Черновик", "Лукъяненко С.", "АСТ", 2004, "твёрдый"));
        librarySection.addBook(new Book("Инферно", "Браун Д.", "АСТ", 2013, "твёрдый"));
        librarySection.addBook(new Book("11/22/63", "Кинг С.", "АСТ", 2011, "твёрдый"));
        librarySection.addBook(new Book("Зелёная миля", "Кинг С.", "АСТ", 1996, "твёрдый"));
        librarySection.addBook(new Book("Шериф", "Ильин В.", "Альфа-книга", 2014, "мягкий"));
        librarySection.addBook(new Book("Катастрофа", "Тармашев С.", "Популярная литература", 2008, "мягкий"));
        librarySection.addBook(new Book("Чистовик", "Лукъяненко С.", "АСТ", 2007, "твёрдый"));

        List<Book> listBooksByAuthor = librarySection.getBookListByAuthor("Лукъяненко С.");
        for (Book book : listBooksByAuthor) {
            System.out.println(book);
        }

        List<Book> listBooksByPublishingHouse = librarySection.getBookListByPublishingHouse("АСТ");
        for (Book book : listBooksByPublishingHouse) {
            System.out.println(book);
        }

        List<Book> listBooksAfterThisYear = librarySection.getBookListAfterYear(2000);
        for (Book book : listBooksAfterThisYear) {
            System.out.println(book);
        }
    }
}
