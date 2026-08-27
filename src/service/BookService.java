package service;
import model.Book;

public class BookService {
    public void printBookInfo(Book book) {
        System.out.println(book.getId());
        System.out.println(book.getAirline());
        System.out.println(book.getFlightType());
        System.out.println(book.getDistanse());
        System.out.println(book.getDuration());
        System.out.println(book.getTicketPrice());
        System.out.println(book.getCapacity());
        System.out.println(book.getDepartureYear());
        System.out.println(book.isAvailable());
        System.out.println(book.getRating());
        System.out.println(book.getPages());
        System.out.println(book.getPublishet());
    }

    public boolean isExpensive(Book book){
        if (book.getTicketPrice() > 50){
            return  true;
        }
        return  false;
    }
    public  void  printBookRating(Book book){
        if(book.getRating() >= 4.5){
            System.out.println("Excellent book");
        }else if(book.getRating() >= 3.0){
            System.out.println("Good book");
        }else{
            System.out.println("Low rated book");
        }
    }

    public boolean canBorrowBook(Book book) {
        return book.isAvailable();
    }
    public  void getBookCategory(Book book){
        if(book.getPages() <= 200){
            System.out.println("Short");
        }else if(book.getPages() >= 200 && book.getPages() <= 500){
            System.out.println("Medium");
        }else if(book.getPages() > 500){
            System.out.println("Long");
        }
    }
    public boolean isClassicBook (Book book){
        if (book.getPublishet() == 1980){

            return  true;
        }
        return  false;
    }

}
