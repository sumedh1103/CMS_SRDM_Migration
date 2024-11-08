package com.example.demo.class_Master_Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.class_Master_Entity.class_Master_Ent;

@Repository

public interface class_Master_Repo extends JpaRepository<class_Master_Ent, Integer> {

	
}
