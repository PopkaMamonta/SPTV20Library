
package entity;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {
    private Book book;
    private User user;
    private Date givenBook;
    private Date returnBook;
    
    public History(){
    
}

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getGivenBook() {
        return givenBook;
    }

    public void setGivenBook(Date givenBook) {
        this.givenBook = givenBook;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }
}
