package com.project.controller;

import com.project.entity.tbl_Class_Wise_Fee_Head;
import com.project.service.ClassWiseFeeHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fee-heads")
public class ClassWiseFeeHeadController {

    @Autowired
    private ClassWiseFeeHeadService service;

    // Create or Update a fee head
    @PostMapping
    public ResponseEntity<tbl_Class_Wise_Fee_Head> createOrUpdate(@RequestBody tbl_Class_Wise_Fee_Head feeHead) {
        return ResponseEntity.ok(service.saveOrUpdate(feeHead));
    }

    // Get all fee heads
    @GetMapping
    public ResponseEntity<List<tbl_Class_Wise_Fee_Head>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // Get a fee head by ID
    @GetMapping("/{id}")
    public ResponseEntity<tbl_Class_Wise_Fee_Head> getById(@PathVariable String id) {
        Optional<tbl_Class_Wise_Fee_Head> feeHead = service.getById(id);
        return feeHead.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete a fee head by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
