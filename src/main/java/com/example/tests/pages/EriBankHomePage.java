package com.example.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;

public class EriBankHomePage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankHomePage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/makePaymentButton")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/makePaymentButton")
    private MobileElement makePaymentButton;

    // Methods

    public void clickMakePaymentButton()  {
        makePaymentButton.click();
    }

    public boolean isMakePaymentButtonEnabled()  {
        return makePaymentButton.isEnabled();
    }
}