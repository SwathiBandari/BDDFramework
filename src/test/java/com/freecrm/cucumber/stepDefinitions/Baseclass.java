package com.freecrm.cucumber.stepDefinitions;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;

public class Baseclass {
protected WebDriver driver;
	
	public void BaseClass(WebDriver driver) {
		this.driver= driver;
	}
	
	public File Screenshot() {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date(0));
		File dest= new File("C:\\Users\\sbandari\\Desktop\\BDD Screenshots\\"+"FormPage"+"_"+timestamp+".jpg");
		return dest;
				
	}
	

}
