package com.dxctraining.book.dao;

import com.dxctraining.book.entities.Book;

import java.util.List;

public interface IbookDao {
    public Book findBookId(String id);
    void addBook(Book book);
    void removeBook(String id);
    public List<Book>showBooks();
}
