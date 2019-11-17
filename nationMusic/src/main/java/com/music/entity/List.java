package com.music.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class List {
    private int listid;
    private String listname;

    @Id
    @Column(name = "listid", nullable = false)
    public int getListid() {
        return listid;
    }

    public void setListid(int listid) {
        this.listid = listid;
    }

    @Basic
    @Column(name = "listname", nullable = false, length = 255)
    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        List list = (List) o;

        if (listid != list.listid) return false;
        if (listname != null ? !listname.equals(list.listname) : list.listname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = listid;
        result = 31 * result + (listname != null ? listname.hashCode() : 0);
        return result;
    }
}
