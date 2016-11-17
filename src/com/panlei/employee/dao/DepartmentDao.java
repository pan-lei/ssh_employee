package com.panlei.employee.dao;

import java.util.List;

import com.panlei.employee.domain.Department;

/*
 * 部门管理的DAO层接口
 */
public interface DepartmentDao {

	int findCount();

	List<Department> findByPage(int begin, int pageSize);

	void save(Department department);

	Department findById(Integer did);

	void update(Department department);

	void delete(Department department);

}
