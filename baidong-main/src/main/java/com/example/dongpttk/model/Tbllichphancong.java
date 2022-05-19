package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tbllichphancong")
public class Tbllichphancong {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Vitri")
    private String vitri;

    @Column(name = "Mota")
    private String mota;

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

    public String getVitri() {
        return this.vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
