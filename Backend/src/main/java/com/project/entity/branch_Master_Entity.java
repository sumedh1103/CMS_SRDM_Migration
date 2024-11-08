package com.example.demo.branch_Master_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_branch_master")  // This is optional; you can change the table name if needed

public class branch_Master_Entity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String branch;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
