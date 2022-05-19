package com.example.dongpttk.dao;

import com.example.dongpttk.model.Tblcauthu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface CauthuDao extends JpaRepository<Tblcauthu,Long> {

    @Query("SELECT u FROM Tblcauthu u WHERE u.tblDoibongId = :doibongid")
    List<Tblcauthu> findByDoibongid(@Param("doibongid") Integer doibongid);
}
