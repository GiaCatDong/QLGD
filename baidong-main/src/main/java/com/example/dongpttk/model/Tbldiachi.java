package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tbldiachi")
public class Tbldiachi {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Sonha")
    private String sonha;

    @Column(name = "Xaphuong")
    private String xaphuong;

    @Column(name = "Quanhuyen")
    private String quanhuyen;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSonha() {
        return this.sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getXaphuong() {
        return this.xaphuong;
    }

    public void setXaphuong(String xaphuong) {
        this.xaphuong = xaphuong;
    }

    public String getQuanhuyen() {
        return this.quanhuyen;
    }

    public void setQuanhuyen(String quanhuyen) {
        this.quanhuyen = quanhuyen;
    }
}
