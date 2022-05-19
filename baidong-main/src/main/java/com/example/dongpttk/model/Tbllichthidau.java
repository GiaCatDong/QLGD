package com.example.dongpttk.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbllichthidau")
@Data
public class Tbllichthidau {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Thoigianthidau")
    private Date thoigianthidau;

    @Column(name = "Mota")
    private String mota;

    public Date getThoigianthidau() {
        return thoigianthidau;
    }

    public void setThoigianthidau(Date thoigianthidau) {
        this.thoigianthidau = thoigianthidau;
    }
}
