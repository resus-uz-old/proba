package uz.resus.yangi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.resus.yangi.entity.Mahsulot;
import uz.resus.yangi.service.MahsulotService;

import java.util.List;

@RestController
@RequestMapping("/api/mahsulot")
@CrossOrigin
public class MahsulotController {
    @Autowired
    MahsulotService mahsulotService;

    @GetMapping()
    public ResponseEntity<List<Mahsulot>> getAll(){
//        return ResponseEntity.ok(this.mahsulotService.getAll());
        return new ResponseEntity<>(this.mahsulotService.getAll(), HttpStatus.OK);
    }



}
