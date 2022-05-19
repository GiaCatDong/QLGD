package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblgiaidau")
public class Tblgiaidau {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "ThoigianBD")
    private java.sql.Date thoigianBd;

    @Column(name = "ThoigianKT")
    private java.sql.Date thoigianKt;

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

    public java.sql.Date getThoigianBd() {
        return this.thoigianBd;
    }

    public void setThoigianBd(java.sql.Date thoigianBd) {
        this.thoigianBd = thoigianBd;
    }

    public java.sql.Date getThoigianKt() {
        return this.thoigianKt;
    }

    public void setThoigianKt(java.sql.Date thoigianKt) {
        this.thoigianKt = thoigianKt;
    }
}
