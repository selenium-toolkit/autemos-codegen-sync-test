package com.example.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;

public class EriBankDialogsPage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankDialogsPage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "xpath=//*[@text="Switzerland"]")
    @iOSXCUITFindBy(xpath = "xpath=//*[@text="Switzerland"]")
    private MobileElement countryListSwitzerland;

    @AndroidFindBy(xpath = "resource-id=android:id/button1")
    @iOSXCUITFindBy(xpath = "resource-id=android:id/button1")
    private MobileElement confirmYesButton;

    // Methods

    public void clickCountryListSwitzerland()  {
        countryListSwitzerland.click();
    }

    public boolean isCountryListSwitzerlandEnabled()  {
        return countryListSwitzerland.isEnabled();
    }

    public void clickConfirmYesButton()  {
        confirmYesButton.click();
    }

    public boolean isConfirmYesButtonEnabled()  {
        return confirmYesButton.isEnabled();
    }
}