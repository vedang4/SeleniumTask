package com_Luma_PageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Product_Page {
    public WebDriver driver;

    // Constructor
    public Luma_Product_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // 2. Identify the web elements
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img") // Example size selection
    WebElement selectOption;
    
    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-167\"]") // Example size selection
    WebElement sizeOption;

    @FindBy(xpath= "//*[@id=\"option-label-color-93-item-57\"]") // Example color selection
    WebElement colorOption;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement addToCartButton;
    
    


    // 3. Create actions
    public void selectSizeAndColor() throws InterruptedException {
    	selectOption.click();
    	Thread.sleep(5000);
        sizeOption.click();
        colorOption.click();
    }

    public void addToCart() throws InterruptedException {
        addToCartButton.click();
        Thread.sleep(5000);
    }
    
  
	

}
