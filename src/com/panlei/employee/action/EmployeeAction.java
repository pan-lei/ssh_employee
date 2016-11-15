package com.panlei.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panlei.employee.domain.Employee;
import com.panlei.employee.service.EmployeeService;

/**
 * 员工管理的Action类
 * 利用模型驱动接收页面的参数
 * 然后调用service层
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	//这里的employee会直接被页面传过来的值赋值
	private Employee employee = new Employee();
	@Override
	public Employee getModel() {
		return employee;
	}
	
	//注入业务层类
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * 登陆执行的方法
	 */
	public String login() {
		System.out.println("login执行了...");
		//调用业务层的类
		Employee existEmployee = employeeService.login(employee);
		if(existEmployee == null) {
			//登陆失败
			this.addActionError("用户名或密码错误！");
			return INPUT;
		} else{
			//登陆成功就将用户信息存入session对象
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			return SUCCESS;
		}
	}
	
}
