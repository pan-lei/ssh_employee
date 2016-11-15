package com.panlei.employee.service.impl;

import com.panlei.employee.dao.EmployeeDao;
import com.panlei.employee.domain.Employee;
import com.panlei.employee.service.EmployeeService;

/**
 * 员工管理的实现类
 */
public class EmployeeServiceImpl implements EmployeeService {
	//注入DAO层的对象
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	//业务层的登陆方法
	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		Employee existEmployee = employeeDao.findByUsernameAndPassword(employee);
		return existEmployee;
	}

}
