package com.example.demo.controller;

import com.example.demo.entity.ExpFeeHeadEntity;
import com.example.demo.service.ExpFeeHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exp-fee-heads")
public class ExpFeeHeadController {

    @Autowired
    private ExpFeeHeadService expFeeHeadService;

    @PostMapping
    public ResponseEntity<ExpFeeHeadEntity> createExpFeeHead(@RequestBody ExpFeeHeadEntity expFeeHeadEntity) {
        ExpFeeHeadEntity savedEntity = expFeeHeadService.createExpFeeHead(expFeeHeadEntity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }

    @GetMapping
    public List<ExpFeeHeadEntity> getAll() {
        return expFeeHeadService.getAll();
    }

    @GetMapping("/{id}")
    public ExpFeeHeadEntity getById(@PathVariable int id) {
        return expFeeHeadService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        expFeeHeadService.deleteById(id);
    }
}
