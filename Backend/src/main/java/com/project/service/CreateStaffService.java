package com.example.demo.service;

import com.example.demo.entity.CreateStaffEntity;
import com.example.demo.repository.CreateStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreateStaffService {

    @Autowired
    private CreateStaffRepository createStaffRepository;

    public CreateStaffEntity createStaff(CreateStaffEntity createStaffEntity) {
        return createStaffRepository.save(createStaffEntity);
    }
    
    public CreateStaffEntity save(CreateStaffEntity createStaffEntity) {
        return createStaffRepository.save(createStaffEntity);
    }

    public List<CreateStaffEntity> getAll() {
        return createStaffRepository.findAll();
    }

    public CreateStaffEntity getById(int id) {
        return createStaffRepository.findById(id).orElse(null);
    }

    public void deleteById(int id) {
        createStaffRepository.deleteById(id);
    }

    public CreateStaffEntity updateStaff(int id, CreateStaffEntity updatedStaff) {
        Optional<CreateStaffEntity> existingStaffOpt = createStaffRepository.findById(id);
        
        if (existingStaffOpt.isPresent()) {
            CreateStaffEntity existingStaff = existingStaffOpt.get();
            // Using exact field names from CreateStaffEntity
            existingStaff.setemployee_name(updatedStaff.getemployee_name());
            existingStaff.setDesignation(updatedStaff.getDesignation());
            existingStaff.setprofessor_type(updatedStaff.getprofessor_type());
            existingStaff.setSubject(updatedStaff.getSubject());
            existingStaff.setPay(updatedStaff.getPay());
            existingStaff.setsalary_pay_band(updatedStaff.getsalary_pay_band());
            existingStaff.setGp(updatedStaff.getGp());
            existingStaff.setDa(updatedStaff.getDa());
            existingStaff.setHra(updatedStaff.getHra());
            existingStaff.setVa(updatedStaff.getVa());
            existingStaff.setTa(updatedStaff.getTa());
            existingStaff.setother_allowance(updatedStaff.getother_allowance());
            existingStaff.setEmp_date(updatedStaff.getEmp_date());
            existingStaff.setEmp_time(updatedStaff.getEmp_time());
            existingStaff.setemp_by_user(updatedStaff.getemp_by_user());
            return createStaffRepository.save(existingStaff);
        } else {
            throw new RuntimeException("Staff with ID " + id + " not found.");
        }
    }
}
