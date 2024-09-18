package com_Luma_PageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Login_Page {

	// divided into 3 parts

	//1.Constructor
	public WebDriver driver;
	public Luma_Login_Page(WebDriver driver) {

		this.driver=driver; //

		PageFactory.initElements(driver, this);

	}

	//2.identify the webelements

	@FindBy(id="email")
	WebElement txtEmail;

	@FindBy(id="pass")
	WebElement txtPassword;

	@FindBy(id="send2")
	WebElement btnSignin;


	//3.Create actions

	public void setEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickSigninbutton() throws InterruptedException {
		btnSignin.click();
		
	}	

	public void clearEmail() {

		txtEmail.clear();
	}

	public void clearPassword() {
		txtPassword.clear();	
	}

	public void logout() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span")).click();
	       driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
	       driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		
	}

}
