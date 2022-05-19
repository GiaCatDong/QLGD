package com.example.dongpttk.service;

import com.example.dongpttk.dao.TrandaucauthuDao;
import com.example.dongpttk.model.Tbltrandaucauthu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/20/2021 12:54 AM
 */
@Service
public class TrandaucauthuService {

    @Autowired
    private TrandaucauthuDao trandaucauthuDao;

    public List<Tbltrandaucauthu> saveall(List<Tbltrandaucauthu> saveall){
        return trandaucauthuDao.saveAll(saveall);
    }
}
