package com.example.demo.branch_Master_Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.branch_Master_Entity.branch_Master_Entity;

@Repository
public interface branch_Master_Repo extends JpaRepository<branch_Master_Entity, Integer>  {

}
