package com.panlei.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.panlei.employee.dao.EmployeeDao;
import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.Employee;
import com.panlei.employee.domain.PageBean;
import com.panlei.employee.service.EmployeeService;

/**
 * 员工管理的实现类
 */
@Transactional
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

	@Override
	//业务层实现分页查询的功能
	public PageBean<Employee> findByPage(Integer currPage) {
		PageBean<Employee> pageBean = new PageBean<Employee>();
		//封装当前页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		int pageSize = 3;	//每页显示3条
		pageBean.setPageSize(pageSize);
		//封装总记录数
		int totalCount = employeeDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数
		double tc = totalCount;
		Double num = Math.ceil(tc/pageSize);	//向上取整
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据
		int begin = (currPage - 1)*pageSize;
		List<Employee> list = employeeDao.findByPage(begin, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	//业务层实现员工的保存方法
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	//业务层根据员工id查询员工的方法
	public Employee findById(Integer eid) {
		return employeeDao.findById(eid);
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
	}

	@Override
	//业务层删除员工的方法
	public void delete(Employee employee) {
		employeeDao.delete(employee);
	}

}
