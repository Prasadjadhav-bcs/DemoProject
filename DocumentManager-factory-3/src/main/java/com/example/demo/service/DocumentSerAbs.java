package com.example.demo.service;

public abstract class DocumentSerAbs implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Read data from db");
	}


	@Override
	public String printDocument() {
		// TODO Auto-generated method stub
		readData();
		processData();
		return printData();
	}

}
