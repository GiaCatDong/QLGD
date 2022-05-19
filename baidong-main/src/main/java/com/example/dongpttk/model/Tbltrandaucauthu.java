package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tbltrandaucauthu")
public class Tbltrandaucauthu {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tbl_trandau_id")
    private Integer tblTrandauId;

    @Column(name = "tbl_cauthu_id")
    private Integer tblCauthuId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTblTrandauId() {
        return this.tblTrandauId;
    }

    public void setTblTrandauId(Integer tblTrandauId) {
        this.tblTrandauId = tblTrandauId;
    }

    public Integer getTblCauthuId() {
        return this.tblCauthuId;
    }

    public void setTblCauthuId(Integer tblCauthuId) {
        this.tblCauthuId = tblCauthuId;
    }
}
