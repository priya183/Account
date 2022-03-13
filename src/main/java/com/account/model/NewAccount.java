package com.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class NewAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	private String accName;
	private String accType;
	private Integer accNo;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public NewAccount(int aid, String accName, String accType, Integer accNo) {
		super();
		this.aid = aid;
		this.accName = accName;
		this.accType = accType;
		this.accNo = accNo;
	}
	public NewAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NewAccount [aid=" + aid + ", accName=" + accName + ", accType=" + accType + ", accNo=" + accNo + "]";
	}

}
