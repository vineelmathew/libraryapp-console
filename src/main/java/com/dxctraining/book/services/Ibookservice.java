package com.dxctraining.book.services;

import com.dxctraining.book.entities.Book;

import java.util.List;

public interface Ibookservice {
   public Book findBookId(String id);
    public void removeBook(String id);
    public void addBook(Book book);
    public List<Book> showBooks();
}
