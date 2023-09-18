package com.tech.report.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.report.management.student.service.StudentReport;

@SpringBootApplication
@RestController
public class ReportManagementApplication {
	
	@Autowired
	private StudentReport report;
	
	@GetMapping("/final-report")
	private String generateStdReport() {
		report.generateReport();
		return "report generated successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(ReportManagementApplication.class, args);
	}

}
