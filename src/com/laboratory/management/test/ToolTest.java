package com.laboratory.management.test;

import java.io.FileOutputStream;

import org.junit.Test;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class ToolTest {
	
	@Test
	public void createPdfTest() {
		
		Document document = new Document();
		try {
			

			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("C:/xhc/text.pdf"));
			
			document.open();
			
			document.add(new Paragraph("hello World!"));
			
			document.close();
			
		}catch (Exception e) {
			System.err.println(e);
		}
		
		
		
	}

}
