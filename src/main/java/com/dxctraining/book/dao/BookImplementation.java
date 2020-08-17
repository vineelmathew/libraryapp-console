package com.dxctraining.book.dao;

import com.dxctraining.book.entities.Book;
import com.dxctraining.book.exceptions.BookNotFoundException;
import com.dxctraining.book.exceptions.InvalidArgumentException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class BookImplementation implements IbookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book findBookId(String id) {
        Book book=entityManager.find(Book.class,id);
        if(book==null)
        {
            throw new BookNotFoundException("Book not found or id is wrong");
        }
        return book;

    }

    @Override
    public void addBook(Book book) {
        validateBook(book);
        entityManager.persist(book);

    }

    private void validateBook(Book book) {
        if(book==null)
        {
            throw new InvalidArgumentException("book cant be null");
        }
    }

    @Override
    public void removeBook(String id) {
        entityManager.remove(id);
    }

    @Override
    public List showBooks() {
        String jpaQuery = "from Books";
        Query query = entityManager.createQuery(jpaQuery);
        query.setParameter("books",query);
        List<Book> list = query.getResultList();
        Book book = null;
        if (!list.isEmpty()) {
            book = list.get(0);
        }
        return list;
    }

}
