package com.example.dongpttk.dao;

import com.example.dongpttk.model.Tbltrandaucauthu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrandaucauthuDao extends JpaRepository<Tbltrandaucauthu,Long> {
}
