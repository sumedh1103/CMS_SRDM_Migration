package com.example.demo.class_Master_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.class_Master_Entity.class_Master_Ent;
import com.example.demo.class_Master_Repo.class_Master_Repo;

import java.util.List;
import java.util.Optional;

@Service

public class class_Master_Services {
		
	 @Autowired
	    private class_Master_Repo classMasterRepository;

	    // Method to save a new ClassMaster
	    public class_Master_Ent saveClass(class_Master_Ent classMasterEntity) {
	        return classMasterRepository.save(classMasterEntity);
	    }

	    // Method to get all ClassMaster entities
	    public List<class_Master_Ent> getAllClasses() {
	        return classMasterRepository.findAll();
	    }

	    // Method to get a ClassMaster by its id
	    public Optional<class_Master_Ent> getClassById(int id) {
	        return classMasterRepository.findById(id);
	    }

	    // Method to delete a ClassMaster by its id
	    public void deleteClass(int id) {
	        classMasterRepository.deleteById(id);
	    }

	
}	
