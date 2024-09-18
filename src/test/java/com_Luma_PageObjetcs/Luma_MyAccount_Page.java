package com_Luma_PageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_MyAccount_Page {
    public WebDriver driver;

    // Constructor
    public Luma_MyAccount_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // 2. Identify the web elements
    @FindBy(linkText = "Men")
    WebElement menOption;

    @FindBy(linkText = "Tops")
    WebElement topsOption;

    @FindBy(xpath= "//*[@id=\"narrow-by-list\"]/div[1]/div[1]")
    WebElement categaryOption;
    
    @FindBy(xpath= "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")
    WebElement jacketsOption;

    // 3. Create actions
    public void selectMensTopsJackets() {
        menOption.click();
        topsOption.click();
        categaryOption.click();
        jacketsOption.click();
    }
}
