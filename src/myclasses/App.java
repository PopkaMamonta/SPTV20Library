
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.User;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class App {
    private Book[] books=new Book[10];
    private User[] users=new User[10];
    private History[] histories=new History[10];
    public void run(){
        String repeat="yes";
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Выберите номер задачи: ");
            System.out.println("0: Закрыть программу");
            System.out.println("1: Добавить пользователя");
            System.out.println("2: Добавить книгу");
            System.out.println("3: Список кинг");
            System.out.println("4: Выдать книгу читателю");
            int task=scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    repeat="no";
                    break;
                case 1:
                    User user= new User();
                    System.out.print("Введите имя пользователя: ");
                    user.setFirstName(scanner.nextLine());
                    System.out.print("Введите фамилию пользователя: ");
                    user.setLastName(scanner.nextLine());
                    System.out.print("Введите номер телефона пользователя: ");
                    user.setTel(scanner.nextLine());
                    System.out.println("Пользователь инициирован: "+user.toString());
                    for (int i = 0; i < users.length; i++) {
                        if (users[i]==null) {
                            users[i]=user;
                            break;
                        }
                    }
                    break;
                case 2:
                    Book book=new Book();
                    System.out.print("Введите название книги: ");
                    book.setBookName(scanner.nextLine());
                    System.out.print("Введите количество авторов книги: ");
                    int countAuthors=(scanner.nextInt());scanner.nextLine();
                    Author[] authors=new Author[countAuthors];
                    for (int i = 0; i < countAuthors; i++) {
                        Author author=new Author();
                        System.out.print("Введите имя автора "+(i+1)+": ");
                        author.setFirstName(scanner.nextLine());
                        System.out.print("Введите фамилию автора: ");
                        author.setLastName(scanner.nextLine());
                        System.out.print("Введите год рождения автора: ");
                        author.setBirthYear(scanner.nextInt());scanner.nextLine();
                        authors[i]=author;
                    }
                    book.setAuthors(authors);
                    for (int i = 0; i < books.length; i++) {
                        if(books[i]==null);
                        books[i]=book;
                        break;
                    }
                    System.out.print("Введите год издания книги: ");
                    book.setReleaseYear(scanner.nextInt());scanner.nextLine();
                    System.out.println("Книга инициирована: "+book.toString());
                    break;
                case 3:
                    System.out.println("Список книг: ");
                    for (int i = 0; i < books.length; i++) {
                        if (books[i]!=null) {
                            System.out.printf("%d %s %s %d.%n"
                                ,i+1
                                ,books[i].getBookName()
                                ,Arrays.toString(books[i].getAuthors())
                                ,books[i].getReleaseYear()
                            );
                        }
                    }
                    break;
                case 4:
                    System.out.println("----- Выдать книгу -----");
                    System.out.println("Список книг: ");
                    for (int i = 0; i < books.length; i++) {
                        if (books[i]!=null) {
                            System.out.printf("%d %s %s %d.%n"
                                ,i+1
                                ,books[i].getBookName()
                                ,Arrays.toString(books[i].getAuthors())
                                ,books[i].getReleaseYear()
                            );
                        }
                    }
                    System.out.print("Выберите номер книги: ");
                    int numberBook=scanner.nextInt();scanner.nextLine();
                    System.out.println("Список читателей: ");
                    for (int i = 0; i < users.length; i++) {
                        if (users[i]!=null) {
                            System.out.printf("%d %s %s %s.%n"
                                ,i+1
                                ,users[i].getFirstName()
                                ,users[i].getLastName()
                                ,users[i].getTel()
                            );
                        }
                    }
                    System.out.print("Выберите номер читателя: ");
                    int numberUser=scanner.nextInt();scanner.nextLine();
                    History history=new History();
                    history.setBook(books[numberBook-1]);
                    history.setUser(users[numberUser-1]);
                    Calendar c=new GregorianCalendar();
                    history.setGivenBook(c.getTime());
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i]==null){
                            histories[i]=history;
                            break;
                        }
                    }
                    System.out.println("------------------------");
                    break;
                default:
                    System.out.println("Выберите номер из списка!");
            }
        }while("yes".equals(repeat));
        System.out.println("Пока!");
                
    }
}
