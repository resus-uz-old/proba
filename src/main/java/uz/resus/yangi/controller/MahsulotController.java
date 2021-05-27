package uz.resus.yangi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity<Page<Mahsulot>> getAll(@RequestParam(value = "page", defaultValue = "0") int page,
                                                 @RequestParam(value = "size", defaultValue = "10") int size){
//        return ResponseEntity.ok(this.mahsulotService.getAll());

        Pageable p = PageRequest.of(page, size);


        return new ResponseEntity<>(this.mahsulotService.getAll(p), HttpStatus.OK);
    }



}
