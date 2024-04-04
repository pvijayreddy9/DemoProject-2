package com.demoproject.demo.dto;

public class EmployeeDto {

private Long empId;
    
    private String name;
    
    private DepartmentDto departmentId;
	
    private int salary;

	

	public EmployeeDto() {
		super();		
	}
	

	public EmployeeDto(Long empId, String name, DepartmentDto departmentId, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.departmentId = departmentId;
		this.salary = salary;
	}


	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentDto getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DepartmentDto departmentId) {
		this.departmentId = departmentId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto {empId : " + empId + ", name : " + name + ", departmentId : {departmentId : \" + departmentId + \", departmentName : \" + departmentName + \"} salary : "
				+ salary + "}";
	}
}
