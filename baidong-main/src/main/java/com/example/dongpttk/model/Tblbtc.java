package com.example.dongpttk.model;

import javax.persistence.*;

@Entity
@Table(name = "tblbtc")
public class Tblbtc {

    @Column(name = "vitri")
    private String vitri;

    @Id
    @Column(name = "tblThanhvienId")
    private Integer tblThanhvienId;

    @Column(name = "tblHoadontrongtaiId")
    private Integer tblHoadontrongtaiId;

    @Column(name = "tblHoadonbanquyenId")
    private Integer tblHoadonbanquyenId;

    @Column(name = "tblHoadondoibongId")
    private Integer tblHoadondoibongId;

    @Column(name = "tblGiaidauId")
    private Integer tblGiaidauId;


    public String getVitri() {
        return this.vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public Integer getTblThanhvienId() {
        return this.tblThanhvienId;
    }

    public void setTblThanhvienId(Integer tblThanhvienId) {
        this.tblThanhvienId = tblThanhvienId;
    }

    public Integer getTblHoadontrongtaiId() {
        return this.tblHoadontrongtaiId;
    }

    public void setTblHoadontrongtaiId(Integer tblHoadontrongtaiId) {
        this.tblHoadontrongtaiId = tblHoadontrongtaiId;
    }

    public Integer getTblHoadonbanquyenId() {
        return this.tblHoadonbanquyenId;
    }

    public void setTblHoadonbanquyenId(Integer tblHoadonbanquyenId) {
        this.tblHoadonbanquyenId = tblHoadonbanquyenId;
    }

    public Integer getTblHoadondoibongId() {
        return this.tblHoadondoibongId;
    }

    public void setTblHoadondoibongId(Integer tblHoadondoibongId) {
        this.tblHoadondoibongId = tblHoadondoibongId;
    }

    public Integer getTblGiaidauId() {
        return this.tblGiaidauId;
    }

    public void setTblGiaidauId(Integer tblGiaidauId) {
        this.tblGiaidauId = tblGiaidauId;
    }
}
