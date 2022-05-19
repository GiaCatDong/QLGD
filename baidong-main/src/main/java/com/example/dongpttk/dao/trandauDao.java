package com.example.dongpttk.dao;

import com.example.dongpttk.model.Tbltrandau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface trandauDao extends JpaRepository<Tbltrandau,Integer> {
}
