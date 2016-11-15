package com.panlei.employee.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panlei.employee.domain.Department;

/**
 * 部门管理的Action类
 * 利用模型驱动接收页面的参数
 * 然后调用service层
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{

	//模型驱动使用的对象
	private Department department = new Department();
	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return department;
	}

}
