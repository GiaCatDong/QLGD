package com.example.dongpttk.service;

import com.example.dongpttk.dao.VongdauDao;
import com.example.dongpttk.model.Tblvongdau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 6:07 PM
 */
@Service
public class VongdauService {

    @Autowired
    private VongdauDao vongdauDao;

    public List<Tblvongdau> findAll() {
        return vongdauDao.findAll();
    }

    public Tblvongdau findById(Integer id){
        return vongdauDao.getById(id);
    }
}
