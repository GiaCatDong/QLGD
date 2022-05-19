package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblbxh")
public class Tblbxh {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Thang")
    private Integer thang;

    @Column(name = "Hoa")
    private Integer hoa;

    @Column(name = "Thua")
    private Integer thua;

    @Column(name = "Hang")
    private Integer hang;

    @Column(name = "Diem")
    private Integer diem;

    @Column(name = "Sotrandada")
    private Integer sotrandada;

    @Column(name = "Hieuso")
    private Integer hieuso;

    @Column(name = "tblDoibongId")
    private Integer tblDoibongId;

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

    public Integer getThang() {
        return this.thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    public Integer getHoa() {
        return this.hoa;
    }

    public void setHoa(Integer hoa) {
        this.hoa = hoa;
    }

    public Integer getThua() {
        return this.thua;
    }

    public void setThua(Integer thua) {
        this.thua = thua;
    }

    public Integer getHang() {
        return this.hang;
    }

    public void setHang(Integer hang) {
        this.hang = hang;
    }

    public Integer getDiem() {
        return this.diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public Integer getSotrandada() {
        return this.sotrandada;
    }

    public void setSotrandada(Integer sotrandada) {
        this.sotrandada = sotrandada;
    }

    public Integer getHieuso() {
        return this.hieuso;
    }

    public void setHieuso(Integer hieuso) {
        this.hieuso = hieuso;
    }

    public Integer getTblDoibongId() {
        return this.tblDoibongId;
    }

    public void setTblDoibongId(Integer tblDoibongId) {
        this.tblDoibongId = tblDoibongId;
    }
}
