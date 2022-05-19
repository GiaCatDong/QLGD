package com.example.dongpttk.dto;

import com.example.dongpttk.model.Tbllichthidau;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;



public class trandaudto {

    private Integer id;
    private String ten;
    private String tyso;

    private String tenDoiNha;

    private String tenDoiKhach;

    private Tbllichthidau tblLichthidauId;

    private Integer tblVongdauId;

    private Date thoigianthidau;


    public trandaudto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTyso() {
        return tyso;
    }

    public void setTyso(String tyso) {
        this.tyso = tyso;
    }

    public String getTenDoiNha() {
        return tenDoiNha;
    }

    public void setTenDoiNha(String tenDoiNha) {
        this.tenDoiNha = tenDoiNha;
    }

    public String getTenDoiKhach() {
        return tenDoiKhach;
    }

    public void setTenDoiKhach(String tenDoiKhach) {
        this.tenDoiKhach = tenDoiKhach;
    }

    public Tbllichthidau getTblLichthidauId() {
        return tblLichthidauId;
    }

    public void setTblLichthidauId(Tbllichthidau tblLichthidauId) {
        this.tblLichthidauId = tblLichthidauId;
    }

    public Integer getTblVongdauId() {
        return tblVongdauId;
    }

    public void setTblVongdauId(Integer tblVongdauId) {
        this.tblVongdauId = tblVongdauId;
    }

    public Date getThoigianthidau() {
        return thoigianthidau;
    }

    public void setThoigianthidau(Date thoigianthidau) {
        this.thoigianthidau = thoigianthidau;
    }
}
