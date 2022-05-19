package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblhoadontrongtai")
public class Tblhoadontrongtai {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Tongtien")
    private Double tongtien;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblTrongtaiId")
    private Integer tblTrongtaiId;

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

    public Double getTongtien() {
        return this.tongtien;
    }

    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getTblTrongtaiId() {
        return this.tblTrongtaiId;
    }

    public void setTblTrongtaiId(Integer tblTrongtaiId) {
        this.tblTrongtaiId = tblTrongtaiId;
    }
}
