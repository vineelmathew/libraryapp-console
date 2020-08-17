package com.dxctraining.author.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    public Author()
    {
        this("1","Vineel");
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
        Author author = (Author) o;
        return id.equals(author.id);
    }

    @Override
    public int hashCode() {
        int hashid=id.hashCode();
        return hashid;
    }




}
