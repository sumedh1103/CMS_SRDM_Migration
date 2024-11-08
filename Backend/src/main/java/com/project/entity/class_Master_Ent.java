package com.example.demo.class_Master_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_class_master")  // This is optional; you can change the table name if needed
public class class_Master_Ent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String class_Name;
    private String section;
    private String branch;

    // Default constructor (required by JPA)
    public class_Master_Ent() {}

    // Getters and setters
    public String getClass_Name() {
        return class_Name;
    }

    public void setClass_Name(String class_Name) {
        this.class_Name = class_Name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Optionally, you can add other constructors, toString(), equals(), and hashCode() if needed
}
