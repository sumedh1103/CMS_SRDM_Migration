package com.example.demo.service;

import com.example.demo.entity.ExpFeeHeadEntity;
import com.example.demo.repository.ExpFeeHeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpFeeHeadService {

    @Autowired
    private ExpFeeHeadRepository expFeeHeadRepository;

    public ExpFeeHeadEntity createExpFeeHead(ExpFeeHeadEntity expFeeHeadEntity) {
        return expFeeHeadRepository.save(expFeeHeadEntity);
    }
    
    public ExpFeeHeadEntity save(ExpFeeHeadEntity expFeeHeadEntity) {
        return expFeeHeadRepository.save(expFeeHeadEntity);
    }

    public List<ExpFeeHeadEntity> getAll() {
        return expFeeHeadRepository.findAll();
    }

    public ExpFeeHeadEntity getById(int id) {
        return expFeeHeadRepository.findById(id).orElse(null);
    }

    public void deleteById(int id) {
        expFeeHeadRepository.deleteById(id);
    }
}
