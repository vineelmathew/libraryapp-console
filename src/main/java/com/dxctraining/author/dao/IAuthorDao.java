package com.dxctraining.author.dao;

import com.dxctraining.author.entities.Author;

public interface IAuthorDao {
    public Author findAuthorID(String id);
    public void addAuthor(Author author);
    Author updateName(Author author,String name);
    public void removeAuthor(String id);
}
