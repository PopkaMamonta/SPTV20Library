
package myclasses;

import entity.Author;
import entity.Book;


public class App {
    public void run(){
        System.out.println("Hello");
        Book book=new Book();
        book.setBookName("Voina i mir");
        book.setReleaseYear(2010);
        Author[] authors= new Author[1];
        Author author= new Author();
        author.setFirstName("Lev");
        author.setLastName("Tolstoy");
        author.setBirthYear(1828);
        authors[0]= author;
        book.setAuthors(authors);
        System.out.printf("Создана книга: %s, автор: %s %s, год издания: %d%n",
                book.getBookName(),
                book.getAuthors()[0].getFirstName(),
                book.getAuthors()[0].getLastName(),
                book.getReleaseYear()
                );
    }
}