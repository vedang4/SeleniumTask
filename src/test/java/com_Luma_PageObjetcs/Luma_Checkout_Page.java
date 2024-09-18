package com_Luma_PageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Luma_Checkout_Page {
    public WebDriver driver;

    // Constructor
    public Luma_Checkout_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // 2. Identify the web elements
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a") // Example checkout button
    WebElement cartButton;
    
    @FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]") // Example checkout button
    WebElement checkoutButton;
    
    @FindBy(name = "street[0]")  // Street Address field
    WebElement txtStreetAddress;
    
    @FindBy(name = "city")  // City field
    WebElement txtCity;

    @FindBy(name = "region_id")  // State/Province dropdown
    WebElement dropdownStateProvince;

    @FindBy(name = "postcode")  // Zip/Postal Code field
    WebElement txtPostalCode;

    @FindBy(name = "country_id")  // Country dropdown
    WebElement dropdownCountry;

    @FindBy(name = "telephone")  // Phone Number field
    WebElement txtPhoneNumber;
    
    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span")  // Phone Number field
    WebElement txtButton;

    @FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")  // Phone Number field
    WebElement txtPlace;
    
 
    
 

    // 3. Create actions
    public void proceedToCheckout() throws InterruptedException {
    	cartButton.click();
        checkoutButton.click();
     Thread.sleep(3000);
       
    }
    
    public void setEnterStreetAddress() {
    	txtStreetAddress.click();
		txtStreetAddress.sendKeys("abcdefgh");
		
	}
    
    public void setEnterCity() {
        
        txtCity.sendKeys("latur");
    }

    public void selectStateProvince() {
        Select stateDropdown = new Select(dropdownStateProvince);
        stateDropdown.selectByVisibleText("Alaska");
    }

    public void setEnterPostalCode() {
       
        txtPostalCode.sendKeys("413512");
    }

    public void selectCountry() {
        Select countryDropdown = new Select(dropdownCountry);
        countryDropdown.selectByVisibleText("Tonga");
    }

    public void setEnterPhoneNumber() {
        
        txtPhoneNumber.sendKeys("1234567890");
    }
    
    public void nextButton() throws InterruptedException {
    	txtButton.click();
        
     Thread.sleep(3000);
       
    }
    
    public void placeOrder() throws InterruptedException {
    	txtPlace.click();
        
     Thread.sleep(3000);
       
    }


}
