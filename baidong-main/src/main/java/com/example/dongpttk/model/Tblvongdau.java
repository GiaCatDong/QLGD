package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblvongdau")
public class Tblvongdau {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblBxhId")
    private Integer tblBxhId;

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

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getTblBxhId() {
        return this.tblBxhId;
    }

    public void setTblBxhId(Integer tblBxhId) {
        this.tblBxhId = tblBxhId;
    }

    public Integer getTblGiaidauId() {
        return this.tblGiaidauId;
    }

    public void setTblGiaidauId(Integer tblGiaidauId) {
        this.tblGiaidauId = tblGiaidauId;
    }
}
