package com.example.demo.repository;

import com.example.demo.entity.CreateStaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateStaffRepository extends JpaRepository<CreateStaffEntity, Integer> {
}

