package com.casbank.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CheckingTransaction {
	private Long id;
	private Date date;
	private String description;
	private String type;
	private String status;
	private double amount;
	private BigDecimal avaiableBalance;
	
	public CheckingTransaction() {
	}

	public CheckingTransaction(Date date, String description, String type, String status, double amount,
			BigDecimal avaiableBalance) {
		super();
		this.date = date;
		this.description = description;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.avaiableBalance = avaiableBalance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigDecimal getAvaiableBalance() {
		return avaiableBalance;
	}

	public void setAvaiableBalance(BigDecimal avaiableBalance) {
		this.avaiableBalance = avaiableBalance;
	}
	
	
	
	
}
