package com.example.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;

//Demo 23.04

//Demo
public class EriBankPaymentPage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankPaymentPage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/cancelButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/cancelButton']")
    private MobileElement cancelButton;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/phoneTextField']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/phoneTextField']")
    private MobileElement phoneTextField;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/nameTextField']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/nameTextField']")
    private MobileElement nameTextField;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/amountTextField']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/amountTextField']")
    private MobileElement amountTextField;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/countryButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/countryButton']")
    private MobileElement countryButton;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/sendPaymentButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/sendPaymentButton']")
    private MobileElement sendPaymentButton;

    // Methods

    public void clickCancelButton()  {
        cancelButton.click();
    }

    public void clearPhoneTextField()  {
        phoneTextField.clear();
    }

    public void clearNameTextField()  {
        nameTextField.clear();
    }

    public void clearAmountTextField()  {
        amountTextField.clear();
    }

    public void clickCountryButton()  {
        countryButton.click();
    }

    public void clickSendPaymentButton()  {
        sendPaymentButton.click();
    }
}