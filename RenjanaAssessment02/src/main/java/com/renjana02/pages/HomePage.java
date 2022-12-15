package com.renjana02.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.renjana02.utilities.PageUtility;
	  
	 public class HomePage {

	  

	     WebDriver driver;

	     @FindBy(linkText="Employee")
	     private WebElement clickEmployee;

	     @FindBy(linkText="Add Employee")
	     private WebElement clickAddEmployee;

	     public HomePage(WebDriver driver) {
	         this.driver=driver;
	         PageFactory.initElements(driver, this);
	     }

	      public void applyEmp(){

	             PageUtility.hoverEg(driver, clickEmployee);
	             PageUtility.clickBtn(driver, clickAddEmployee);

	         }
	      public void applyAddEmp(){

	             PageUtility.hoverEg(driver, clickAddEmployee);

	         }


	 }
	 
	

