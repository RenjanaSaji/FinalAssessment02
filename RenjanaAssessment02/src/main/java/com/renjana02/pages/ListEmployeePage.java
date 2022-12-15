package com.renjana02.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.renjana02.utilities.PageUtility;
	  
	 public class ListEmployeePage {

	  

	     WebDriver driver;

	     @FindBy(linkText="Employee")
	     private WebElement clickEmployee;

	     @FindBy(linkText="List Employee")
	     private WebElement clickListEmployee;
	     
	     @FindBy(linkText="Home")
	     private WebElement homeClick;
	     
	     @FindBy(linkText="Edit")
	     private WebElement editEmployee;
	     
	     @FindBy(linkText="Delete")
	     private WebElement deleteEmployee;

	  

	     public ListEmployeePage(WebDriver driver) {
	         this.driver=driver;
	         PageFactory.initElements(driver, this);
	     }

	      public void applyEmp(){

	             PageUtility.hoverEg(driver, clickEmployee);
	             PageUtility.clickBtn(driver, clickListEmployee);

	         }
	      public void applyListEmp(){

	             PageUtility.hoverEg(driver, clickListEmployee);

	         }
	      
	      public void homeClick() {
	    	  
	          PageUtility.clickBtn(driver, homeClick);
	      }
	      
	      
	      public void applyEditEmp(){
	    	   
	    	  PageUtility.enterKeyEg(driver);	             
	    	  PageUtility.clickBtn(driver, editEmployee);

	         }
	        
	      
	      public void applyDeleteEmp(){
	    	   
	    	  PageUtility.enterKeyEg(driver);	             
	    	  PageUtility.clickBtn(driver, deleteEmployee);
	    	  PageUtility.alertEg(driver);

	         }
	      


	 }
	 
	
