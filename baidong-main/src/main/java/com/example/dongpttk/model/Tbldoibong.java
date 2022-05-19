package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tbldoibong")
public class Tbldoibong {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Trangphuctruyenthong")
    private String trangphuctruyenthong;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblSanvandongId")
    private Integer tblSanvandongId;

    @Column(name = "tblLichthidauId")
    private Integer tblLichthidauId;

    @Column(name = "tblHoadondoibongId")
    private Integer tblHoadondoibongId;

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

    public String getTrangphuctruyenthong() {
        return this.trangphuctruyenthong;
    }

    public void setTrangphuctruyenthong(String trangphuctruyenthong) {
        this.trangphuctruyenthong = trangphuctruyenthong;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getTblSanvandongId() {
        return this.tblSanvandongId;
    }

    public void setTblSanvandongId(Integer tblSanvandongId) {
        this.tblSanvandongId = tblSanvandongId;
    }

    public Integer getTblLichthidauId() {
        return this.tblLichthidauId;
    }

    public void setTblLichthidauId(Integer tblLichthidauId) {
        this.tblLichthidauId = tblLichthidauId;
    }

    public Integer getTblHoadondoibongId() {
        return this.tblHoadondoibongId;
    }

    public void setTblHoadondoibongId(Integer tblHoadondoibongId) {
        this.tblHoadondoibongId = tblHoadondoibongId;
    }
}
