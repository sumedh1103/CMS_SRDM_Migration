package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class tbl_Class_Wise_Fee_Head {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "fee_Head")
    private String feeHead;

    private String amount;

    @Column(name = "class")
    private String class_;

    @Column(name = "fee_Type")
    private String feeType;

    private String section;

    private String branch;

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for feeHead
    public String getFeeHead() {
        return feeHead;
    }

    public void setFeeHead(String feeHead) {
        this.feeHead = feeHead;
    }

    // Getter and Setter for amount
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    // Getter and Setter for class_
    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    // Getter and Setter for feeType
    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    // Getter and Setter for section
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // Getter and Setter for branch
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
