package com.example.demo.controller;

import com.example.demo.entity.CreateStaffEntity;
import com.example.demo.service.CreateStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/create-staff")
public class CreateStaffController {

    @Autowired
    private CreateStaffService createStaffService;

    @PostMapping
    public ResponseEntity<CreateStaffEntity> createExpFeeHead(@RequestBody CreateStaffEntity createStaffEntity) {
        CreateStaffEntity savedEntity = createStaffService.createStaff(createStaffEntity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }

    @GetMapping
    public List<CreateStaffEntity> getAll() {
        return createStaffService.getAll();
    }

    @GetMapping("/{id}")
    public CreateStaffEntity getById(@PathVariable int id) {
        return createStaffService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CreateStaffEntity> updateStaff(@PathVariable int id, @RequestBody CreateStaffEntity updatedStaff) {
        CreateStaffEntity updatedEntity = createStaffService.updateStaff(id, updatedStaff);
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        createStaffService.deleteById(id);
    }
}
