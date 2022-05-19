package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblcauthu")
public class Tblcauthu {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Namsinh")
    private String namsinh;

    @Column(name = "Vitrithidau")
    private String vitrithidau;

    @Column(name = "Chieucao")
    private String chieucao;

    @Column(name = "Chanthuan")
    private String chanthuan;

    @Column(name = "tbl_doibong_id")
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

    public String getNamsinh() {
        return this.namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getVitrithidau() {
        return this.vitrithidau;
    }

    public void setVitrithidau(String vitrithidau) {
        this.vitrithidau = vitrithidau;
    }

    public String getChieucao() {
        return this.chieucao;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public String getChanthuan() {
        return this.chanthuan;
    }

    public void setChanthuan(String chanthuan) {
        this.chanthuan = chanthuan;
    }

    public Integer getTblDoibongId() {
        return this.tblDoibongId;
    }

    public void setTblDoibongId(Integer tblDoibongId) {
        this.tblDoibongId = tblDoibongId;
    }
}
