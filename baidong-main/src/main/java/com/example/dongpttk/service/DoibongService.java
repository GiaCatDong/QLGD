package com.example.dongpttk.service;

import com.example.dongpttk.dao.CauthuDao;
import com.example.dongpttk.dao.DoibongDao;
import com.example.dongpttk.model.Tblcauthu;
import com.example.dongpttk.model.Tbldoibong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.*;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 10:43 PM
 */
@Service
public class DoibongService {
    @Autowired
    private DoibongDao doibongDao;

    @Autowired
    private CauthuDao cauthuDao;

    public Tbldoibong findByTen(String ten){
        return doibongDao.findByTen(ten);
    }
    public Optional<Tbldoibong> findById(Integer id){
        return doibongDao.findById(id);
    }


    public List<Tblcauthu> findByDoibongid(Integer id){
        return cauthuDao.findByDoibongid(id);
    }
}
