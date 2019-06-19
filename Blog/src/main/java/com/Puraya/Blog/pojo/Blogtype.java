package com.Puraya.Blog.pojo;

public class Blogtype {
    private Integer typeId;

    private String typename;

    private Integer father;

    public Blogtype(Integer typeId, String typename, Integer father) {
        this.typeId = typeId;
        this.typename = typename;
        this.father = father;
    }

    public Blogtype() {
        super();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getFather() {
        return father;
    }

    public void setFather(Integer father) {
        this.father = father;
    }
}