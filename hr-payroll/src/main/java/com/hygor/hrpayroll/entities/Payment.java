package com.hygor.hrpayroll.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncome;
	}
	
}
