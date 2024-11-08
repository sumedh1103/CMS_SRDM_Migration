package com.example.demo.service;

import com.example.demo.entity.CreateStaffEntity;
import com.example.demo.repository.CreateStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateStaffService {

    @Autowired
    private CreateStaffRepository createStaffRepository;

    public CreateStaffEntity createStaff(CreateStaffEntity createStaffEntity) {
        // If you are doing any transformations or checks here, ensure they are correct.
        return createStaffRepository.save(createStaffEntity);
    }
    
    public CreateStaffEntity save(CreateStaffEntity createStaffEntity) {
        return createStaffRepository.save(createStaffEntity);
    }

    public List<CreateStaffEntity> getAll() {
        return createStaffRepository.findAll();
    }

    public CreateStaffEntity getById(int id) {
        return createStaffRepository.findById(id).orElse(null);
    }

    public void deleteById(int id) {
        createStaffRepository.deleteById(id);
    }
}
