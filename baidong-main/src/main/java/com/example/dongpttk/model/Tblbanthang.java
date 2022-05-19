package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblbanthang")
public class Tblbanthang {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Thoigian")
    private String thoigian;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblCauthuId")
    private Integer tblCauthuId;

    @Column(name = "tblTrandauId")
    private Integer tblTrandauId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThoigian() {
        return this.thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getTblCauthuId() {
        return this.tblCauthuId;
    }

    public void setTblCauthuId(Integer tblCauthuId) {
        this.tblCauthuId = tblCauthuId;
    }

    public Integer getTblTrandauId() {
        return this.tblTrandauId;
    }

    public void setTblTrandauId(Integer tblTrandauId) {
        this.tblTrandauId = tblTrandauId;
    }
}
