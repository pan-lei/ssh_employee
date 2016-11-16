package com.panlei.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.PageBean;
import com.panlei.employee.service.DepartmentService;

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
		return department;
	}
	//注入部门管理的service
	private DepartmentService departmentService;
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	//分页功能
	private Integer currPage=1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	//提供查询的方法
	public String findAll() {
		PageBean<Department> pageBean = departmentService.findByPage(currPage);
		//将pageBean存入值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	
}
