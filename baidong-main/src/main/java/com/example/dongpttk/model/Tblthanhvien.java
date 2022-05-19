package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblthanhvien")
public class Tblthanhvien {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Ngaysinh")
    private java.sql.Date ngaysinh;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "Email")
    private String email;

    @Column(name = "Mota")
    private String mota;

    @Column(name = "tblDiachiId")
    private Integer tblDiachiId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Date getNgaysinh() {
        return this.ngaysinh;
    }

    public void setNgaysinh(java.sql.Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getTblDiachiId() {
        return this.tblDiachiId;
    }

    public void setTblDiachiId(Integer tblDiachiId) {
        this.tblDiachiId = tblDiachiId;
    }
}
