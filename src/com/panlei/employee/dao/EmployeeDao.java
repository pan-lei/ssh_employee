package com.panlei.employee.dao;

import com.panlei.employee.domain.Employee;

/**
 * 员工管理的DAO的接口
 */
public interface EmployeeDao {

	Employee findByUsernameAndPassword(Employee employee);
	
}
