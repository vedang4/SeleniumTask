package com_Luma_Testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import com_Luma_PageObjetcs.Luma_Login_Page;
import com_Luma_PageObjetcs.Luma_MyAccount_Page;
import com_Luma_PageObjetcs.Luma_Product_Page;

import com_Luma_PageObjetcs.Luma_Checkout_Page;

public class TC_03_Luma_EndToEnd extends Luma_Base_Class {

    @Test
    public void endToEndTest() throws InterruptedException {
        // Login
        Luma_Login_Page loginPage = new Luma_Login_Page(driver);
        loginPage.setEmail("vedang4.shastri@gmail.com");
        log.info("Login Email Address Entered");
        loginPage.setPassword("Vedang@123");
        log.info("Login Password Entered");
        loginPage.clickSigninbutton();
        log.info("Clicked Login Button");

        // Select Men's Tops -> Jackets
        Luma_MyAccount_Page myAccountPage = new Luma_MyAccount_Page(driver);
        myAccountPage.selectMensTopsJackets();
        log.info("Navigated to Men's Tops -> Jackets");

        // Select product size, color, and add to cart
        Luma_Product_Page productPage = new Luma_Product_Page(driver);
        productPage.selectSizeAndColor();
        log.info("Selected Size and Color");
        productPage.addToCart();
        log.info("Product added to cart");

        // Proceed to checkout and place the order
        Luma_Checkout_Page checkoutPage = new Luma_Checkout_Page(driver);
        checkoutPage.proceedToCheckout();
        log.info("Proceeded to checkout");
        
    
        Thread.sleep(5000); 
        
     //   checkoutPage.setEnterStreetAddress();
        log.info("Entered Street Address");
     //   checkoutPage.setEnterCity( );
        log.info("Entered city");
     //   checkoutPage.selectStateProvince();
        log.info("Entered state");
     //   checkoutPage.setEnterPostalCode();
        log.info("Entered pincode");
     //   checkoutPage.selectCountry();
        log.info("Entered contry");
     //   checkoutPage.setEnterPhoneNumber();
        log.info("Entered phone Number");
     //   checkoutPage.nextButton();
        log.info("click next button");
     //   Thread.sleep(3000); 
        checkoutPage.nextButton();
        Thread.sleep(5000); 
        checkoutPage.placeOrder();
        log.info("Place Order Successfully");
    }


}

