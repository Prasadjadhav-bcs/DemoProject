package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelService;
import com.example.demo.service.PdfService;
import com.example.demo.service.WorldService;

public class Factory {
		
	public static DocumentService getObject(String type){
		if(type.equals("PDF")) {
			PdfService pdf = new PdfService();
			return pdf;
		}
		if(type.equals("EXCEL")) {
			ExcelService excel = new ExcelService();
			return excel;
		}
		if(type.equals("world")) {
			WorldService ws = new WorldService();
			return ws;
		}
		return null;
	}
}
