package com.sjsu;

import java.util.*;

public class employee {
private int empid;
private String name, department;
private Set<String> customer;


public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Set<String> getCustomer() {
	return customer;
}
public void setCustomer(Set<String> customer) {
	this.customer = customer;
}



}
