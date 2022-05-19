package com.example.dongpttk.dao;

import com.example.dongpttk.model.Tblvongdau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VongdauDao extends JpaRepository<Tblvongdau,Integer> {
}
