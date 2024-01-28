package com.tech.report.management.student.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tech.bean.report.employee.dto.EmployeeInfo;

@Service
public class EmployeeReport {
	
	private Map<String, Object> loadParameters(){
		Map<String, Object> map =new HashMap<>();
		EmployeeInfo employeeInfo = new EmployeeInfo("EMP1001", "Anji", "Mangeeru", null);
		
		return map;
	}

}
