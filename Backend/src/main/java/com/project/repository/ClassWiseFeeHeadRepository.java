package com.project.repository;

import com.project.entity.tbl_Class_Wise_Fee_Head;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassWiseFeeHeadRepository extends JpaRepository<tbl_Class_Wise_Fee_Head, String> {
}
