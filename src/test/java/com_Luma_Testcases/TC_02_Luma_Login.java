package com_Luma_Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com_Luma_PageObjetcs.Luma_Login_Page;
import com_Luma_Utilities.XLUtils;

public class TC_02_Luma_Login extends Luma_Base_Class {
	
    @Test(dataProvider="LumaLoginData")
	public void loginTest(String Email, String Password) throws InterruptedException {
	Luma_Login_Page ll=new Luma_Login_Page(driver);
	
	       ll.setEmail(Email);
	       log.info("Login Email Address Entered");
	       Thread.sleep(3000);
	       ll.setPassword(Password);
	       log.info("Login Password Entered");
	       Thread.sleep(3000);
	       ll.clickSigninbutton();
	       log.info("Login Sign button Clicked");
	       Thread.sleep(3000);
	       ll.logout();
	       log.info("Logout");
	       Thread.sleep(3000); 
	      ll.clearEmail();
	      log.info("Login Email is Cleared");
	      Thread.sleep(3000);
	       ll.clearPassword();
	       log.info("Login Password is Cleared");
	       
	//       String Act_tittle= driver.getTitle();
	 //      String Exp_tittle="My Account";
	       
	    /*   if(Act_tittle.equals(Exp_tittle)) {
	    	   Assert.assertTrue(true);
	    	   System.out.println("Testcase is Pass");
	       }
	       else {
	    	   driver.navigate().refresh();
	    	   System.out.println("Testcase is Fail");
	    	   Assert.assertTrue(false);
	      } */
	  
	}
    
    @DataProvider(name="LumaLoginData")
    String [][] getData() throws IOException{
		
    	String path="C:\\Users\\pc\\Downloads\\Hybrid_Framework_Team29B30\\src\\test\\java\\com_Luma_Testdata\\LumaLoginData.xlsx";
    	
    	//identify the row count
    	int rownum=XLUtils.getRowCount(path, "Sheet1");
    	
    	//identify the col count
    	
    	int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
    	
    	String logindata[][]=new String[rownum][colcount];
    	
    	for(int i=1; i<=rownum; i++) { // it will represents rows
    		
    		for(int j=0; j<colcount; j++) { // it will respresnts columns
    			
    			logindata[i-1][j]=XLUtils.getcelldata(path, "Sheet1", i, j);	
    			
    		}
    		
    	}
    	
		return logindata;
    }
}	
    
	
	
	

