package com.example.demo.branch_Master_Controller;

import com.example.demo.branch_Master_Entity.branch_Master_Entity;
import com.example.demo.branch_Master_Services.branch_Master_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/branches")
public class branch_Master_Controller {

    @Autowired
    private branch_Master_Services service;

    // Create or update branch
    @PostMapping("/add")
    public ResponseEntity<branch_Master_Entity> createOrUpdateBranch(@RequestBody branch_Master_Entity branch) {
        branch_Master_Entity savedBranch = service.saveBranch(branch);  // Correct method name
        return ResponseEntity.ok(savedBranch);
    }

    // Get all branches
    @GetMapping
    public List<branch_Master_Entity> getAllBranches() {
        return service.getAllBranches();
    }

    // Get branch by ID
    @GetMapping("/{id}")
    public ResponseEntity<branch_Master_Entity> getBranchById(@PathVariable int id) {
        Optional<branch_Master_Entity> branch = service.getBranchById(id);
        return branch.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete branch by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBranch(@PathVariable int id) {
        service.deleteBranch(id);
        return ResponseEntity.noContent().build();
    }
}
