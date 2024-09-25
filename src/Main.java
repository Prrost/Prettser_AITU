import additional1.Book;
import additional1.BookAvailability;
import additional1.StringFormatter;
import additional1.JsonFormatter;
import additional1.XmlFormatter;
import additional1.Formatter;

public class Main {
    public static void main(String[] args) {
        // Создаем новую книгу
        Book book = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        // Проверяем доступность книги
        BookAvailability availability = new BookAvailability(true);
        System.out.println("Is the book available? " + availability.isAvailable());

        // Форматирование книги в строковом формате
        Formatter stringFormatter = new StringFormatter();
        System.out.println(stringFormatter.format(book));

        // Форматирование книги в формате JSON
        Formatter jsonFormatter = new JsonFormatter();
        System.out.println(jsonFormatter.format(book));

        // Форматирование книги в формате XML
        Formatter xmlFormatter = new XmlFormatter();
        System.out.println(xmlFormatter.format(book));
    }
}
