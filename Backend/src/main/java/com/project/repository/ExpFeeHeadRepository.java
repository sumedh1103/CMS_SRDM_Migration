package com.example.demo.repository;

import com.example.demo.entity.ExpFeeHeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpFeeHeadRepository extends JpaRepository<ExpFeeHeadEntity, Integer> {
}