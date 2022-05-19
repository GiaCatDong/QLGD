package com.example.dongpttk.dao;

import com.example.dongpttk.model.Tbldoibong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface DoibongDao extends JpaRepository<Tbldoibong,Integer> {

    @Query("SELECT u FROM Tbldoibong u WHERE u.ten = :ten")
    Tbldoibong findByTen(@Param("ten") String ten);

}
