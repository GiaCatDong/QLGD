package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblhoadondoibong")
public class Tblhoadondoibong {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Tongtien")
    private String tongtien;

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

    public String getTongtien() {
        return this.tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
