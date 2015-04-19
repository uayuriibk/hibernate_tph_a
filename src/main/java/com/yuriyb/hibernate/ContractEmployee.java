package com.yuriyb.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee_tph_a")
public class ContractEmployee extends Employee {

	@Column(name = "hourlyrate")
	private float hourlyPay;

	@Column(name = "contract_duration")
	private String contractDuration;

	public float getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(float hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
}