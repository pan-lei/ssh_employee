package com.panlei.employee.service;

import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.PageBean;

/**
 * 部门业务层的接口
 */
public interface DepartmentService {

	PageBean<Department> findByPage(Integer currPage);

}
