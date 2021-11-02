
package entity;

import java.io.Serializable;
import java.util.Arrays;

public class Book implements Serializable{
    private String bookName;
    private Author[] authors;
    private int releaseYear;
    private int quantity;
    private int count;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + ",Авторы:  "+ Arrays.toString(authors)+",Год издания: "
                + releaseYear +",Кол-во эклемпляров: "+quantity+",Какой по счету: "+count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
