package com.gradedprojectq12;

import java.io.Serializable;

public class Employee implements Serializable {
	String EmployeeId;
	String EmployeeName;
	String EmployeePhone;
	String EmployeeAddress;
	int EmployeeSalary;

	public Employee(String employeeId, String employeeName, String employeePhone, String employeeAddress,
			int employeeSalary) {
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.EmployeePhone = employeePhone;
		this.EmployeeAddress = employeeAddress;
		this.EmployeeSalary = employeeSalary;

	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeePhone="
				+ EmployeePhone + ", EmployeeAddress=" + EmployeeAddress + ", EmployeeSalary=" + EmployeeSalary + "]";
	}

}
