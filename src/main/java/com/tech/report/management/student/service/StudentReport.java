package com.tech.report.management.student.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tech.report.management.file.util.FileUtil;
import com.tech.report.management.jrxml.pdf.PdfUtil;
import com.tech.report.management.student.dto.StudentInfo;
import com.tech.report.management.student.dto.StudentMarks;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class StudentReport {
	
	public static final String file_path ="D:\\Projects\\reportManagement";
	
	private static final Logger _logger = LoggerFactory.getLogger(StudentReport.class);
	
	public void generateReport() {
		
		JasperReport report = PdfUtil.compileJsper("", "");
		Map<String, Object> parameters= loadParameters();
		try {
			JasperPrint pdfPrint = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(pdfPrint, FileUtil.DEST_FILE_PATH+FileUtil.STD_FINAL_REPORT_NAME+"1"+FileUtil.PDF_FILE_EXT);
			_logger.info("Report generated successfully");
		} catch (JRException e) {
			_logger.error("Exception occure while generate Report");
			e.printStackTrace();
		}
	}
	
	public Map<String, Object> loadParameters(){
		Map<String, Object> params = new HashMap<>();
		
		ArrayList<StudentMarks> marks = new ArrayList<>();
		marks.add(new StudentMarks("Telugu", 90, "A", "P", "QI"));
		marks.add(new StudentMarks("Hindi", 75, "B", "P", "QI"));
		marks.add(new StudentMarks("English", 95, "A", "P", "QI"));
		marks.add(new StudentMarks("Mathes", 98, "A+", "P", "QI"));
		marks.add(new StudentMarks("Sceince", 80, "A-", "P", "QI"));
		marks.add(new StudentMarks("Social", 60, "C", "P", "QI"));
		
		StudentInfo stdInfo = new StudentInfo("Charan", "Konidal", "Sai Mounika", "VI", "A","2023-24");
		stdInfo.setFatherName("Maheswara");
		stdInfo.setMotherName("Pravanjanamma");
		stdInfo.setMarks(marks);
		
		stdInfo.setComments("Keep it up");
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(marks);
		params.put("studentInfo", stdInfo);
		params.put("marksDataSet", dataSource);
		_logger.info("Data loaded successfully...");
		
		return params;
	}

}
