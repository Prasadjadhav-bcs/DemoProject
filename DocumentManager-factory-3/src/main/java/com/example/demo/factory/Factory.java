package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelService;
import com.example.demo.service.PdfService;
import com.example.demo.service.WorldService;

public class Factory {
		
	public static DocumentService getObject(String type){
		if(type.equals("pdf")) {
			PdfService pd = new PdfService();
			return pd;
		}
		if(type.equals("excel")) {
			ExcelService ex = new ExcelService();
			return ex;
		}
		if(type.equals("world")) {
			WorldService ws = new WorldService();
			return ws;
		}
		return null;
	}
}
