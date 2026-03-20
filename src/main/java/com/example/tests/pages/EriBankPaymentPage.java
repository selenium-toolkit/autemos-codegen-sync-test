package com.example.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;

public class EriBankPaymentPage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankPaymentPage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/phoneTextField")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/phoneTextField")
    private MobileElement phoneTextField;

    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/nameTextField")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/nameTextField")
    private MobileElement nameTextField;

    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/amountTextField")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/amountTextField")
    private MobileElement amountTextField;

    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/countryButton")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/countryButton")
    private MobileElement countryButton;

    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/sendPaymentButton")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/sendPaymentButton")
    private MobileElement sendPaymentButton;

    // Methods

    public void typePhoneTextField(String text)  {
        phoneTextField.clear();
        phoneTextField.sendKeys(text);
    }

    public String getPhoneTextFieldValue()  {
        return phoneTextField.getAttribute("text");
    }

    public void clearPhoneTextField()  {
        phoneTextField.clear();
    }

    public void typeNameTextField(String text)  {
        nameTextField.clear();
        nameTextField.sendKeys(text);
    }

    public String getNameTextFieldValue()  {
        return nameTextField.getAttribute("text");
    }

    public void clearNameTextField()  {
        nameTextField.clear();
    }

    public void typeAmountTextField(String text)  {
        amountTextField.clear();
        amountTextField.sendKeys(text);
    }

    public String getAmountTextFieldValue()  {
        return amountTextField.getAttribute("text");
    }

    public void clearAmountTextField()  {
        amountTextField.clear();
    }

    public void clickCountryButton()  {
        countryButton.click();
    }

    public boolean isCountryButtonEnabled()  {
        return countryButton.isEnabled();
    }

    public void clickSendPaymentButton()  {
        sendPaymentButton.click();
    }

    public boolean isSendPaymentButtonEnabled()  {
        return sendPaymentButton.isEnabled();
    }
}