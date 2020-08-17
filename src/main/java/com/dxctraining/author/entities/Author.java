package com.dxctraining.author.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Authors")
public class Author {
    @Id
    private String id;
    private String name;

    public Author(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Author() {
       super();
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




}
