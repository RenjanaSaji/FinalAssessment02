package com.renjana02.Scripts;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.renjana02.base.Base;
import com.renjana02.constants.AutomationConstants;
import com.renjana02.pages.AddEmployeePage;
import com.renjana02.pages.HomePage;
import com.renjana02.pages.ListEmployeePage;
import com.renjana02.pages.LoginPage;
import com.renjana02.utilities.ExcelUtility;

public class TestClass extends Base{
	
	
	LoginPage objLogin;
	HomePage objHome;
	AddEmployeePage objAdd;
	ListEmployeePage objList;
	
	
	@Test(priority=0)
	  public void loginVerification() throws Exception {
	      
		  objLogin=new LoginPage(getDriver());
	      
	      String actualusername=ExcelUtility.getCellData(0, 11).getStringCellValue();
	      objLogin.setUserName(actualusername);
	      Assert.assertEquals(AutomationConstants.expusername, actualusername);
	     
	      
	      String actualpassword=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 12).getNumericCellValue());
	      objLogin.setPassword(actualpassword);
	      Assert.assertEquals(AutomationConstants.expPassword, actualpassword);
	
          objLogin.clickLogin();
          
          String actualvalue=getDriver().getTitle();
          Assert.assertEquals(AutomationConstants.ExpectedValue,actualvalue);
          System.out.println(actualvalue);

	  }
	
	@Test(priority=1)
	  public void homeVerification() throws Exception {
	      
		objHome=new HomePage(getDriver());
		
		objHome.applyEmp();
	  }
	
	
	
	  
	  @Test(priority=2)
	  public void addEmployee() throws Exception {
	      
		  objAdd=new AddEmployeePage(getDriver());
	      
	      String actualname=ExcelUtility.getCellData(0, 0).getStringCellValue();
	      objAdd.setName(actualname);
	      Assert.assertEquals(AutomationConstants.expname, actualname);
	      
          String actualpassword=ExcelUtility.getCellData(0, 1).getStringCellValue();
	      objAdd.setPassword(actualpassword);
	      Assert.assertEquals(AutomationConstants.exppassword, actualpassword);
	      
	      String actualemail=ExcelUtility.getCellData(0, 2).getStringCellValue();
	      objAdd.setMail(actualemail);
	      Assert.assertEquals(AutomationConstants.expemail, actualemail);
	      
	      String actualdesignation=ExcelUtility.getCellData(0, 3).getStringCellValue();
	      objAdd.setDesignation(actualdesignation);
	      Assert.assertEquals(AutomationConstants.expdesignation, actualdesignation);
	      
	      String actualreportingTo=ExcelUtility.getCellData(0, 4).getStringCellValue();
	      objAdd.setreportingTo(actualreportingTo);
	      Assert.assertEquals(AutomationConstants.expreportingto, actualreportingTo);
	      
          String actualmemberOf=ExcelUtility.getCellData(0, 5).getStringCellValue();
	      objAdd.setmemberOf(actualmemberOf);
	      Assert.assertEquals(AutomationConstants.expmemberof, actualmemberOf);
	      
	      String actualempId=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 6).getNumericCellValue());;
	      objAdd.setempId(actualempId);
	      Assert.assertEquals(AutomationConstants.expempid, actualempId);
	      
	      String actualpassword2=ExcelUtility.getCellData(0, 7).getStringCellValue();
	      objAdd.setPassword2(actualpassword2);
	      Assert.assertEquals(AutomationConstants.exppassword2, actualpassword2);
      
          String actualnumber=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 8).getNumericCellValue());;
          objAdd.setNumber(actualnumber);
          Assert.assertEquals(AutomationConstants.expnumber, actualnumber);
      
          String actualtype=ExcelUtility.getCellData(0, 9).getStringCellValue();
          objAdd.setempType(actualtype);
          Assert.assertEquals(AutomationConstants.exptype, actualtype);
      
          objAdd.clickreportingStaff();
      
	      String actualaddress=ExcelUtility.getCellData(0, 10).getStringCellValue();
	      objAdd.setAddress(actualaddress);
	      Assert.assertEquals(AutomationConstants.expaddress, actualaddress);
	      
          objAdd.clickLogin();
  }
  
		  

		@Test(priority=3)
		  public void listEmployee() throws Exception {
		      
			objList=new ListEmployeePage(getDriver());
			
			objList.homeClick();
			objList.applyEmp();
			objList.applyEditEmp();
			objList.homeClick();
			objList.applyEmp();
			objList.applyDeleteEmp();
			
		  }
	  
	  
}
