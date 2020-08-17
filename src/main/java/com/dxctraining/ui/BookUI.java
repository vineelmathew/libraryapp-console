package com.dxctraining.ui;

import com.dxctraining.author.entities.Author;
import com.dxctraining.author.services.IAuthorService;
import com.dxctraining.book.entities.Book;
import com.dxctraining.book.entities.CSbook;
import com.dxctraining.book.entities.Fictionbook;
import com.dxctraining.book.services.Ibookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class BookUI {
    @Autowired
    private Ibookservice bookservice;
    @Autowired
    private IAuthorService authorService;
    @PostConstruct
    public void runApp() {
Author author1=new Author("2","rudrapati");
Author author2=new Author("1","vineel");
authorService.addAuthor(author1);
authorService.addAuthor(author2);
authorService.addAuthor(author1);
authorService.addAuthor(author2);
        Book book1=new Book("java edition1",author1,"b1");
        Book book2=new Book("gullivers travels",author2,"b2");
        Book book3=new Book("harry potter",author2,"b3");
        bookservice.addBook(book1);
        bookservice.addBook(book2);
        bookservice.addBook(book3);
        Showbooks();
    }
    public void Showbooks() {
        System.out.println("displaying the books details");
        List<Book>list= bookservice.showBooks();
        for(Book book:list)
        {
            displayAll(book); //display all books
            boolean isFiction=book instanceof Fictionbook;
            if(isFiction)
            {
                fictionBook(book);
            }
            else
            {
                itBook(book);
            }

        }
    }
    private void displayAll(Book book) {

        Author author=book.getAuthor();
        System.out.println("The author is="+author.getName()+" Name of the book="+book.getName()+
              " Author ID="+author.getId()+" The book Id "+book.getId());
    }

    public void fictionBook(Book book)
    {

        Author author=book.getAuthor();
        System.out.println("The author is="+author.getName()+" Name of the book="+book.getName()+
                " Author ID="+author.getId()+" The book Id "+book.getId());
    }

    private void itBook(Book book) {
        Author author=book.getAuthor();
        System.out.println("The author is="+author.getName()+" Name of the book="+book.getName()+
                " Author ID="+author.getId()+" The book Id "+book.getId());
    }
}
