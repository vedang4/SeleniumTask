package com_Luma_Testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_Luma_PageObjetcs.Luma_Registration_Page;



public class TC_01_Luma_Registration extends Luma_Base_Class{

	@Test
	public void LumaRegistrationtest(){

		Luma_Registration_Page lr=new Luma_Registration_Page(driver);


		/*	lr.clickCreateAnAccountLink();
		lr.setFirstName(null);
		lr.setLastName(null);
		lr.setEmailAddress(null);
		lr.setPassword(null);
		lr.setConfirmPassword(null);
		lr.clickCreateAnAccountbtn(); */

		lr.clickCreateAnAccountLink();
		//log.info("Luma create an account clicking activity is completed");
		log.info("Luma create an account clicking activity is completed");
		lr.setFirstName(FName);	
		log.info("First Name entered successfully");
		lr.setLastName(LName);
		log.info("Last Name Entered Successfully");
		lr.setEmailAddress(EmailAdd);
		log.info("Email address Entered Successfully");
		lr.setPassword(Password);
		log.info("Password Entered Successfully");
		lr.setConfirmPassword(CPassword);
		log.info("Confirm Password Entered Successfully");
		lr.clickCreateAnAccountbtn();
		log.info("Create an account button clicked Successfully");
		
		//Hard assertion
		String Act_title= driver.getTitle();
		System.out.println(Act_title);
		String Exp_tittle="My Account";
		
	/*	if(Act_title.equals(Exp_tittle)) {
			
			Assert.assertTrue(true);
			System.out.println("Test case is pass");
		}
		else {
		     
			System.out.println("Test case failed");
			Assert.assertTrue(false);
			
		} */
		
		
	}

}
