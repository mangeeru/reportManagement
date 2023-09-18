package com.tech.report.management.student.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
	
	private String firstName;
	private String lastName;
	private String middleName;
	
	private String fatherName;
	private String motherName;
	
	private String teacherName;
	
	private String studentClass; //we can use class and section
	private String studentGrade;//we can use this for grade or level 
	
	private String yearOfSchool;
	
	private String comments;
	
	private List<StudentMarks> marks = new ArrayList<>();
	
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	

	public StudentInfo(String firstName, String lastName, String teacherName, String studentClass, String studentGrade,
			String yearOfSchool) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacherName = teacherName;
		this.studentClass = studentClass;
		this.studentGrade = studentGrade;
		this.yearOfSchool = yearOfSchool;
	}

	public StudentInfo(String firstName, String lastName, String middleName, String fatherName, String motherName,
			String teacherName, String studentClass, String studentGrade, String yearOfSchool, String comments,
			List<StudentMarks> marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.teacherName = teacherName;
		this.studentClass = studentClass;
		this.studentGrade = studentGrade;
		this.yearOfSchool = yearOfSchool;
		this.comments = comments;
		this.marks = marks;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getYearOfSchool() {
		return yearOfSchool;
	}

	public void setYearOfSchool(String yearOfSchool) {
		this.yearOfSchool = yearOfSchool;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<StudentMarks> getMarks() {
		return marks;
	}

	public void setMarks(List<StudentMarks> marks) {
		this.marks = marks;
	}

}
