package com.example.dongpttk.controller;

import com.example.dongpttk.dao.DoibongDao;
import com.example.dongpttk.dao.TrandaucauthuDao;
import com.example.dongpttk.dto.cauthudto;
import com.example.dongpttk.model.*;
import com.example.dongpttk.service.DoibongService;
import com.example.dongpttk.service.TrandauService;
import com.example.dongpttk.service.TrandaucauthuService;
import com.example.dongpttk.service.VongdauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/")
@Controller
public class danhsachcauthuController {
    @Autowired
    private VongdauService vongdauService;

    @Autowired
    private TrandauService trandauService;

    @Autowired
    private DoibongService doibongService;

    @Autowired
    private TrandaucauthuService trandaucauthuService;

    @GetMapping("/")
    public String Gethome(Model model){
        return "home";
    }

    @GetMapping("/dangkycauthu")
    public String Getdangky(Model model){
        model.addAttribute("vongdau",vongdauService.findAll());
        model.addAttribute("vong",new Tblvongdau());
        return "DangKyDS";
    }

    @PostMapping("/lichthidau")
    public String Getlichthidau(Model model , @ModelAttribute Tblvongdau tblvongdau){
        if(tblvongdau.getId() ==null){
            model.addAttribute("erro","chọn da");
            model.addAttribute("vongdau",vongdauService.findAll());
            model.addAttribute("vong",new Tblvongdau());
            return "DangKyDS";
        }
        else{
            Integer id =  tblvongdau.getId();
            Tblvongdau vongdau= vongdauService.findById(id);
            model.addAttribute("ten",vongdau.getTen());
            model.addAttribute("trandau",trandauService.findByvongdauId(tblvongdau.getId()));
        }
        return "LichThiDau";
    }

    @GetMapping("/trandau/{id}")
    public String Gettrandau(Model model , @PathVariable Integer id){
        Tbltrandau trandau = trandauService.findById(id);
        Tbldoibong doinha = doibongService.findByTen(trandau.getTenDoiNha());
        Tbldoibong doikhach = doibongService.findByTen(trandau.getTenDoiKhach());
        model.addAttribute("trandau" , trandau);
        model.addAttribute("doinha" , doinha);
        model.addAttribute("doikhach" , doikhach);
        return "TranDau";
    }

    @GetMapping("/DSCauThu/{id}/{idtrandau}")
    public String Gettrandau(Model model , @PathVariable Integer id,@PathVariable Integer idtrandau){
        Tbltrandau trandau = trandauService.findById(idtrandau);
        model.addAttribute("trandau" , trandau);
        cauthudto cauthus = new cauthudto();
        for(Tblcauthu item:doibongService.findByDoibongid(id)){
            cauthus.addCauthu(item);
        }
        model.addAttribute("form" , cauthus);
        return "DSCauThu";
    }

    @PostMapping("/DSCauThu/{idtrandau}")
    public String savecauthu(Model model , @ModelAttribute cauthudto cauthudto, @PathVariable Integer idtrandau){
        Tbltrandau trandau = trandauService.findById(idtrandau);
        model.addAttribute("trandau" , trandau);

        List<Tbltrandaucauthu> tbltrandaucauthuList = new ArrayList<>();
        for(Tblcauthu item:cauthudto.getCauthu()){
            if(item.getId() != null){
                Tbltrandaucauthu trandaucauthu = new Tbltrandaucauthu();
                trandaucauthu.setTblCauthuId(item.getId());
                trandaucauthu.setTblTrandauId(idtrandau);
                tbltrandaucauthuList.add(trandaucauthu);
            }
        }
        try {
            trandaucauthuService.saveall(tbltrandaucauthuList);
        }catch( Exception e){
            System.out.println(e);
        }

        return "home";
    }
}
