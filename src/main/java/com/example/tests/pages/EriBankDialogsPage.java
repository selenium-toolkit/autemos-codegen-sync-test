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
public class EriBankDialogsPage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankDialogsPage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "//*[@text='Yes']")
    @iOSXCUITFindBy(xpath = "//*[@text='Yes']")
    private MobileElement confirmYesButton;

    @AndroidFindBy(xpath = "//*[@text='Germany']")
    @iOSXCUITFindBy(xpath = "//*[@text='Germany']")
    private MobileElement countryListGermany;

    @AndroidFindBy(xpath = "//*[@text='United States']")
    @iOSXCUITFindBy(xpath = "//*[@text='United States']")
    private MobileElement countryListUSA;

    @AndroidFindBy(xpath = "//*[@text='No']")
    @iOSXCUITFindBy(xpath = "//*[@text='No']")
    private MobileElement confirmNoButton;

    @AndroidFindBy(xpath = "//*[@text='Switzerland']")
    @iOSXCUITFindBy(xpath = "//*[@text='Switzerland']")
    private MobileElement countryListSwitzerland;

    // Methods

    public void clickConfirmYesButton()  {
        confirmYesButton.click();
    }

    public void clickCountryListGermany()  {
        countryListGermany.click();
    }

    public void clickCountryListUSA()  {
        countryListUSA.click();
    }

    public void clickConfirmNoButton()  {
        confirmNoButton.click();
    }

    public void clickCountryListSwitzerland()  {
        countryListSwitzerland.click();
    }
}