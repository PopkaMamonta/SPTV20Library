
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.User;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class App {
    public void run(){
        //System.out.println("Hello");
        Book book=new Book();
        book.setBookName("Voina i mir");
        book.setReleaseYear(2010);
        Author[] authors= new Author[1];
        Author author= new Author();
        author.setFirstName("Lev");
        author.setLastName("Tolstoy");
        author.setBirthYear(1828);
        User user= new User();
        user.setFirstName("Andrei");
        user.setLastName("Koni");
        user.setTel("+37256843420");
        authors[0]= author;
        book.setAuthors(authors);
        System.out.printf("Создана книга: %s, автор: %s %s, год издания: %d%n",
                book.getBookName(),
                book.getAuthors()[0].getFirstName(),
                book.getAuthors()[0].getLastName(),
                book.getReleaseYear()
                );
        System.out.printf("Имя пользователя: %s , фамилия: %s , номер телефона: %s%n",
                user.getFirstName(),
                user.getLastName(),
                user.getTel()
                );
        History history= new History();
        history.setBook(book);
        history.setUser(user);
        Calendar c=new GregorianCalendar();
        history.setGivenBook(c.getTime());
        System.out.printf("Пользователь %s %s взял книгу \"%s\", %s%n",
                history.getUser().getFirstName(),
                history.getUser().getLastName(),
                history.getBook().getBookName(),
                history.getGivenBook()
                );
        c=new GregorianCalendar();
        history.setReturnBook(c.getTime());
        System.out.printf("Пользователь %s %s взял книгу \"%s\", %s%n",
                history.getUser().getFirstName(),
                history.getUser().getLastName(),
                history.getBook().getBookName(),
                history.getReturnBook()
                );
    }
}
