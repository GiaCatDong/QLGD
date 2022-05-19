package com.example.dongpttk.dao;


import com.example.dongpttk.model.Tblthanhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<Tblthanhvien,Long> {

    @Query("SELECT u FROM Tblthanhvien u WHERE u.username = :username")
    Tblthanhvien getUserByUsername(@Param("username") String username);
}
