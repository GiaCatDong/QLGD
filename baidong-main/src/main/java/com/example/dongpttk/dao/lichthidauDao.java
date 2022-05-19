package com.example.dongpttk.dao;

import com.example.dongpttk.model.Tbllichthidau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface lichthidauDao extends JpaRepository<Tbllichthidau,Integer> {
}
