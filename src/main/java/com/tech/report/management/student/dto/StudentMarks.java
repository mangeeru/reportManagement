package com.tech.report.management.student.dto;

public class StudentMarks {

	private String subject;
	private int marks;
	private String grade;
	private String result;

	private String quater;// which quater I or II or III or IV

	public StudentMarks() {
		// TODO Auto-generated constructor stub
	}

	public StudentMarks(String subject, int marks, String grade, String result, String quater) {
		super();
		this.subject = subject;
		this.marks = marks;
		this.grade = grade;
		this.result = result;
		this.quater = quater;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getQuater() {
		return quater;
	}

	public void setQuater(String quater) {
		this.quater = quater;
	}

}
