package com.example.dongpttk.service;

import com.example.dongpttk.dao.lichthidauDao;
import com.example.dongpttk.dao.trandauDao;
import com.example.dongpttk.dto.trandaudto;
import com.example.dongpttk.model.Tbllichthidau;
import com.example.dongpttk.model.Tbltrandau;
import com.example.dongpttk.model.Tblvongdau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 7:47 PM
 */
@Service
public class TrandauService {

    @Autowired
    private trandauDao trandauDao;

    @Autowired
    private lichthidauDao lichthidauDao;

    public List<trandaudto> findByvongdauId(Integer vongdauid){
        List<trandaudto> trandauDto = new ArrayList<>();
        List<Tbltrandau> trandaus = trandauDao.findAll();

        for(Tbltrandau item:trandaus){
            if( item.getTblVongdauId() == vongdauid){
                trandaudto trandau = new trandaudto();
                trandau.setId(item.getId());
                trandau.setTen(item.getTen());
                trandau.setTenDoiNha(item.getTenDoiNha());
                trandau.setTenDoiKhach(item.getTenDoiKhach());
                Optional<Tbllichthidau> tbllichthidau = lichthidauDao.findById(item.getTblLichthidauId());
                trandau.setThoigianthidau(tbllichthidau.get().getThoigianthidau());
                trandauDto.add(trandau);
            }

        }
        return trandauDto;
    }

    public Tbltrandau findById(Integer id){
        return trandauDao.getById(id);
    }
}
