package com.dxctraining.book.entities;

import com.dxctraining.author.entities.Author;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CSbook extends Book{
    private String id;
    private String iname;
    public CSbook(String name, Author author, String id) {
        super(name,author,id);
        this.id=id;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CSbook cSbook = (CSbook) o;
        return id.equals(cSbook.id);
    }

    @Override
    public int hashCode() {
        int hashid=id.hashCode();
        return hashid;
    }



}
