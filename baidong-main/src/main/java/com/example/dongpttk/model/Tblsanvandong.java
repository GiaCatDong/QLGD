package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblsanvandong")
public class Tblsanvandong {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Diachi")
    private String diachi;

    @Column(name = "Succhua")
    private String succhua;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSucchua() {
        return this.succhua;
    }

    public void setSucchua(String succhua) {
        this.succhua = succhua;
    }
}
