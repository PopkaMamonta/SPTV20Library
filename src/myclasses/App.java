
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.User;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class App {
    public void run(){
        String repeat="yes";
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Выберите номер задачи: ");
            System.out.println("0: Закрыть программу");
            System.out.println("1: Добавить пользователя");
            System.out.println("2: Добавить книгу");
            int task=scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    repeat="no";
                    break;
                case 1:
                    User user= new User();
                    System.out.println("Введите имя пользователя: ");
                    user.setFirstName(scanner.nextLine());
                    System.out.println("Введите фамилию пользователя: ");
                    user.setLastName(scanner.nextLine());
                    System.out.println("Введите номер телефона пользователя: ");
                    user.setTel(scanner.nextLine());
                    System.out.println("Пользователь инициализирован: "+user.toString());
                    break;
                case 2:
                    Book book=new Book();
                    Author author=new Author();
                    System.out.println("Введите название книги");
                    book.setBookName(scanner.nextLine());
                    System.out.println("Введите имя автора книги");
                    author.setFirstName(scanner.nextLine());
                    System.out.println("Введите фамилию автора книги");
                    author.setLastName(scanner.nextLine());
                    System.out.println("Введите год издания книги");
                    book.setReleaseYear(scanner.nextInt());
                    System.out.println("Книга добавлена: " +book.toString());
                    System.out.println("Автор: " +author.toString());
                default:
                    System.out.println("Выберите номер из списка!");
            }
        }while("yes".equals(repeat));
        System.out.println("Пока!");
                
    }
}
