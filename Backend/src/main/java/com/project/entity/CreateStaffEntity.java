package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Create_Staff")
public class CreateStaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String employee_name;
    private String designation;
    private String professor_type;
    private String subject;
    private String pay;
    private String salary_pay_band;
    private String gp;
    private String da;
    private String hra;
    private String va;
    private String ta;
    private String other_allowance;
    private String emp_date;
    private String emp_time;
    private String emp_by_user;

    // Constructors, Getters, Setters, and ToString methods
    public CreateStaffEntity() {}

    public CreateStaffEntity(int id, String employee_name, String designation, String professor_type, 
                              String subject, String pay, String salary_pay_band, String gp, String da, 
                              String hra, String va, String ta, String other_allowance, String emp_date, 
                              String emp_time, String emp_by_user) {
        this.id = id;
        this.employee_name = employee_name;
        this.designation = designation;
        this.professor_type = professor_type;
        this.subject = subject;
        this.pay = pay;
        this.salary_pay_band = salary_pay_band;
        this.gp = gp;
        this.da = da;
        this.hra = hra;
        this.va = va;
        this.ta = ta;
        this.other_allowance = other_allowance;
        this.emp_date = emp_date;
        this.emp_time = emp_time;
        this.emp_by_user = emp_by_user;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getemployee_name() {
		return employee_name;
	}

	public void setemployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getprofessor_type() {
		return professor_type;
	}

	public void setprofessor_type(String professor_type) {
		this.professor_type = professor_type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getsalary_pay_band() {
		return salary_pay_band;
	}

	public void setsalary_pay_band(String salary_pay_band) {
		this.salary_pay_band = salary_pay_band;
	}

	public String getGp() {
		return gp;
	}

	public void setGp(String gp) {
		this.gp = gp;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public String getHra() {
		return hra;
	}

	public void setHra(String hra) {
		this.hra = hra;
	}

	public String getVa() {
		return va;
	}

	public void setVa(String va) {
		this.va = va;
	}

	public String getTa() {
		return ta;
	}

	public void setTa(String ta) {
		this.ta = ta;
	}

	public String getother_allowance() {
		return other_allowance;
	}

	public void setother_allowance(String other_allowance) {
		this.other_allowance = other_allowance;
	}

	public String getEmp_date() {
		return emp_date;
	}

	public void setEmp_date(String emp_date) {
		this.emp_date = emp_date;
	}

	public String getEmp_time() {
		return emp_time;
	}

	public void setEmp_time(String emp_time) {
		this.emp_time = emp_time;
	}

	public String getemp_by_user() {
		return emp_by_user;
	}

	public void setemp_by_user(String emp_by_user) {
		this.emp_by_user = emp_by_user;
	}

	@Override
	public String toString() {
		return "CreateStaffEntity [id=" + id + ", employee_name=" + employee_name + ", designation=" + designation
				+ ", professor_type=" + professor_type + ", subject=" + subject + ", pay=" + pay + ", salary_pay_band="
				+ salary_pay_band + ", gp=" + gp + ", da=" + da + ", hra=" + hra + ", va=" + va + ", ta=" + ta
				+ ", other_allowance=" + other_allowance + ", emp_date=" + emp_date + ", emp_time=" + emp_time
				+ ", emp_by_user=" + emp_by_user + "]";
	}

    
}
