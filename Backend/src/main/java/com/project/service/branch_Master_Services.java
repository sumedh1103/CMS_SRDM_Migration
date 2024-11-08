package com.example.demo.branch_Master_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.branch_Master_Entity.branch_Master_Entity;
import com.example.demo.branch_Master_Repo.branch_Master_Repo;

import java.util.List;
import java.util.Optional;

@Service
public class branch_Master_Services {

	@Autowired
    private branch_Master_Repo repository;

    // Create or Update a branch
    public branch_Master_Entity saveBranch(branch_Master_Entity branch) {
        return repository.save(branch);
    }

    // Get all branches
    public List<branch_Master_Entity> getAllBranches() {
        return repository.findAll();
    }

    // Get a branch by ID
    public Optional<branch_Master_Entity> getBranchById(int id) {
        return repository.findById(id);
    }

    // Delete a branch by ID
    public void deleteBranch(int id) {
        repository.deleteById(id);
    }
	
}
