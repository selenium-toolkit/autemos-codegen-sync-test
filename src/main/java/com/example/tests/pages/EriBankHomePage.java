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
public class EriBankHomePage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankHomePage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/mortgageRequestButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/mortgageRequestButton']")
    private MobileElement mortgageRequestButton;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/expenseReportButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/expenseReportButton']")
    private MobileElement expenseReportButton;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/logoutButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/logoutButton']")
    private MobileElement logoutButton;

    @AndroidFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/makePaymentButton']")
    @iOSXCUITFindBy(xpath = "//*[@resource-id='com.experitest.ExperiBank:id/makePaymentButton']")
    private MobileElement makePaymentButton;

    // Methods

    public void clickMortgageRequestButton()  {
        mortgageRequestButton.click();
    }

    public void clickExpenseReportButton()  {
        expenseReportButton.click();
    }

    public void clickLogoutButton()  {
        logoutButton.click();
    }

    public void clickMakePaymentButton()  {
        makePaymentButton.click();
    }
}