package com.project.shoponline1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	  @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   private String empName;
	   private String empAddress;
	   private String empMobileNos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpMobileNos() {
		return empMobileNos;
	}
	public void setEmpMobileNos(String empMobileNos) {
		this.empMobileNos = empMobileNos;
	}
	   
	   
}
