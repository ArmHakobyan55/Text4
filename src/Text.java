import model.Book;
import service.BookService;

public class Text {
    public static void main(String[] args) {

        BookService bookService = new BookService();

        Book book = new Book();

        book.setId(8);
        book.setFlightNumber("Arman");
        book.setAirline("Arsen Gabrielyan");
        book.setFlightType("DOMESTIC");
        book.setDistanse(51);
        book.setDuration(30);
        book.setTicketPrice(100);
        book.setCapacity(10);
        book.setDepartureYear(2029);
        book.setAvailable(true);
        book.setPages(300);
        book.setPublishet(1980);
        if(book.isAvailable()){
            System.out.println("The book is available");
        }
        book.setRating(4.6);

        bookService.printBookInfo(book);
        boolean result = bookService.isExpensive(book);
        System.out.println(result);
        bookService.printBookRating(book);
        boolean result1 = bookService.canBorrowBook(book);
        System.out.println(result1);
        bookService.getBookCategory(book);
        boolean result2 = bookService.isClassicBook(book);
        System.out.println(result2);
    }
}