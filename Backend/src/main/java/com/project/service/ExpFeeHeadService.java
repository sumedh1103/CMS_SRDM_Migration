package com.example.demo.service;

import com.example.demo.entity.ExpFeeHeadEntity;
import com.example.demo.repository.ExpFeeHeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Update Method
    public ExpFeeHeadEntity updateExpFeeHead(int id, ExpFeeHeadEntity updatedFeeHead) {
        Optional<ExpFeeHeadEntity> existingFeeHeadOpt = expFeeHeadRepository.findById(id);
        
        if (existingFeeHeadOpt.isPresent()) {
            ExpFeeHeadEntity existingFeeHead = existingFeeHeadOpt.get();
            // Using exact field names from ExpFeeHeadEntity
            existingFeeHead.setfee_head(updatedFeeHead.getfee_head());
            existingFeeHead.setAmount(updatedFeeHead.getAmount());
            existingFeeHead.setDate(updatedFeeHead.getDate());
            existingFeeHead.setTime(updatedFeeHead.getTime());
            existingFeeHead.setBy_user(updatedFeeHead.getBy_user());
            return expFeeHeadRepository.save(existingFeeHead);
        } else {
            throw new RuntimeException("Fee head with ID " + id + " not found.");
        }
    }
}
