package com.panlei.employee.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门的实体
 */
public class Department {

	private Integer did;	//部门id
	private String dname;	//部门名称
	private String ddesc;	//部门描述
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

}
