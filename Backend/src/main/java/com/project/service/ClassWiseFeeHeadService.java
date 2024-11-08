package com.project.service;

import com.project.entity.tbl_Class_Wise_Fee_Head;
import com.project.repository.ClassWiseFeeHeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassWiseFeeHeadService {

    @Autowired
    private ClassWiseFeeHeadRepository repository;

    // Create or update
    public tbl_Class_Wise_Fee_Head saveOrUpdate(tbl_Class_Wise_Fee_Head feeHead) {
        return repository.save(feeHead);
    }

    // Read all
    public List<tbl_Class_Wise_Fee_Head> getAll() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<tbl_Class_Wise_Fee_Head> getById(String id) {
        return repository.findById(id);
    }

    // Delete by ID
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
