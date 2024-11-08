package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Exp_fee_heads")
public class ExpFeeHeadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fee_head;
    private String amount;
    private String date;
    private String time;
    private String by_user;

    // Constructors, Getters, Setters, and ToString methods
    public ExpFeeHeadEntity() {}

    public ExpFeeHeadEntity(int id, String fee_head, String amount, String date, String time, String by_user) {
        this.id = id;
        this.fee_head = fee_head;
        this.amount = amount;
        this.date = date;
        this.time = time;
        this.by_user = by_user;
    }
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfee_head() {
		return fee_head;
	}

	public void setfee_head(String fee_head) {
		this.fee_head = fee_head;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getBy_user() {
		return by_user;
	}

	public void setBy_user(String by_user) {
		this.by_user = by_user;
	}

	@Override
	public String toString() {
		return "ExpFeeHeadEntity [id=" + id + ", fee_head=" + fee_head + ", amount=" + amount + ", date=" + date
				+ ", time=" + time + ", by_user=" + by_user + "]";
	}

	
}
