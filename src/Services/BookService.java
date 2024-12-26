package Services;
import models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private List<Book> books=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void addBook() {
        Book book=new Book();
        System.out.println("Enter title: ");
        String bookTitle=sc.nextLine();
        System.out.println("Enter author: ");
        String bookAuthor=sc.nextLine();
        System.out.println("Enter isbn: ");
        int bookIsbn=sc.nextInt();
        book.setId(bookIsbn);
        book.setTitle(bookTitle);
        book.setAuthor(bookAuthor);
        books.add(book);
        System.out.println("Book added");

    }


}
