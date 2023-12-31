package com.jsp.Employee.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Employee.Entity.Employee;
import com.jsp.Employee.Reposotory.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	@Autowired
	Employee e;
	
	public int addEmp(int id, String name, double sal) {
		e.setEmpId(id);
		e.setEmpName(name);
		e.setEmpSal(sal);
		return er.addEmp(e);
	}
	public List<Employee> getEmpById(int id)
	{
		List<Employee> emp= er.getEmpById(id);
		return emp;
	}
	public void updateEmpById(int id,String name,double sal)
	{
		e.setEmpId(id);
		e.setEmpName(name);
		e.setEmpSal(sal);
		 er.updateEmp(e);
	}

	public List<Employee> getAll() {
	
		return er.getAll();
		
	}
	public void deleteEmpById(int id) {
		er.deleteEmp(id);
		
	}
}
