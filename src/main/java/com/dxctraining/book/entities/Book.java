package com.dxctraining.book.entities;

import com.dxctraining.author.entities.Author;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Books")
@Inheritance(strategy =InheritanceType.JOINED)
public class Book {

        @Id
        private String id;
        private String name;
        @ManyToOne(cascade = CascadeType.ALL)
        private Author author;
        public Book(String name,Author author,String id) {
            this.name = name;
            this.author=author;
            this.id=id;
        }
    public Book() {
       super();
    }

        public Author getAuthor() {
            return author;
        }
        public void setAuthor(Author author) {
            this.author = author;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
       int strid=id.hashCode();
       return strid;
    }
    }
