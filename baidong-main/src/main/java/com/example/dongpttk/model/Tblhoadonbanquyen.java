package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblhoadonbanquyen")
public class Tblhoadonbanquyen {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Tongtien")
    private Double tongtien;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblDoitacId")
    private Integer tblDoitacId;

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

    public Integer getTblDoitacId() {
        return this.tblDoitacId;
    }

    public void setTblDoitacId(Integer tblDoitacId) {
        this.tblDoitacId = tblDoitacId;
    }
}
