package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tbltrongtai")
public class Tbltrongtai {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "Quoctich")
    private String quoctich;

    @Column(name = "tblLichphancongId")
    private Integer tblLichphancongId;

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

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getQuoctich() {
        return this.quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public Integer getTblLichphancongId() {
        return this.tblLichphancongId;
    }

    public void setTblLichphancongId(Integer tblLichphancongId) {
        this.tblLichphancongId = tblLichphancongId;
    }
}
