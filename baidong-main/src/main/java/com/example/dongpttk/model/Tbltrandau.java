package com.example.dongpttk.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbltrandau")
@Data
public class Tbltrandau {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Tyso")
    private String tyso;

    @Column(name = "tendoinha")
    private String tenDoiNha;

    @Column(name = "tendoikhach")
    private String tenDoiKhach;

    @Column(name = "tbllichthidauid")
    private Integer tblLichthidauId;

    @Column(name = "tbllichphancongid")
    private Integer tblLichphancongId;

    @Column(name = "tbl_hoadonbanquyen_id")
    private Integer tblHoadonbanquyenId;

    @Column(name = "tbl_hoadondoibong_id")
    private Integer tblHoadondoibongId;

    @Column(name = "tbl_vongdau_id ")
    private Integer tblVongdauId;

}
