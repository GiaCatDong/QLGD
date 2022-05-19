package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblnhataitro")
public class Tblnhataitro {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Diachi")
    private String diachi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblGiaidauId")
    private Integer tblGiaidauId;

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

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getTblGiaidauId() {
        return this.tblGiaidauId;
    }

    public void setTblGiaidauId(Integer tblGiaidauId) {
        this.tblGiaidauId = tblGiaidauId;
    }
}
