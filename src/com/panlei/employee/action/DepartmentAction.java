package com.panlei.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.PageBean;
import com.panlei.employee.service.DepartmentService;

/**
 * 部门管理的Action类
 * 利用模型驱动ModelDriven<Department>接收页面的参数,可以是表单提交的数据，也可以是某个参数值
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
	
	//添加部门的方法
	public String saveUI() {
		return "saveUI";
	}
	
	//添加部门执行的方法
	public String save() {
		departmentService.save(department);
		return "saveSuccess";
	}
	
	//编辑部门的方法
	public String edit() {
		department = departmentService.findById(department.getDid());
		return "editSuccess";
	}
	
	//修改部门执行的方法
	public String update() {
		departmentService.update(department);
		return "updateSuccess";
	}
	
	//删除部门的方法
	public String delete() {
		//删除之前先查询是否有该部门
		department = departmentService.findById(department.getDid());
		departmentService.delete(department);
		return "deleteSuccess";
	}
	
}
