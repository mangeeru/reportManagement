package com.tech.report.management.jrxml.pdf;

import java.io.File;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;

public class PdfUtil {
	
	private static final Logger _logger = LoggerFactory.getLogger(PdfUtil.class);
	
	public static JasperReport compileJsper(String fileName, String transactionId) {
		JasperReport report = null;
		try {
			File jrxmlFile = ResourceUtils.getFile("classpath:jrxmlTemplates\\StudentFinalReport.jrxml");
			_logger.info("jasper File loaded successully...");
			report = JasperCompileManager.compileReport(jrxmlFile.getAbsolutePath());
			_logger.info("Jasper report compiled successfully...");
		} catch (FileNotFoundException | JRException e) {
			_logger.error("Exception occure while compile jasper");
			e.printStackTrace();
		}
		return report;
	}

}
