
package entity;

import java.io.Serializable;

public class Book implements Serializable{
    private String bookName;
    private Author[] authors;
    private int releaseYear;

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
        return "Название книги: " + bookName + ", Год издания: " + releaseYear;
    }
    
}
