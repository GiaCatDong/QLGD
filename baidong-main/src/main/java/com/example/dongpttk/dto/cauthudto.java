package com.example.dongpttk.dto;

import com.example.dongpttk.model.Tblcauthu;

import java.util.ArrayList;
import  java.util.List;


public class cauthudto {
    private List<Tblcauthu> cauthu;

    public cauthudto(List<Tblcauthu> cauthu) {
        this.cauthu = cauthu;
    }
    public cauthudto() {
        this.cauthu = new ArrayList<>();
    }

    public List<Tblcauthu> getCauthu() {
        return cauthu;
    }

    public void setCauthu(List<Tblcauthu> savecauthu) {
        this.cauthu = savecauthu;
    }

    public void addCauthu(Tblcauthu savecauthu) {
        this.cauthu.add(savecauthu);
    }
}
