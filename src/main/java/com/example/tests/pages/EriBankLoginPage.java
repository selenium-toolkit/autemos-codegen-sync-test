package com.example.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;

public class EriBankLoginPage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankLoginPage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/usernameTextField']")
    @iOSXCUITFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/usernameTextField']")
    private MobileElement usernameTextField;

    @AndroidFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/passwordTextField")
    @iOSXCUITFindBy(xpath = "resource-id=com.experitest.ExperiBank:id/passwordTextField")
    private MobileElement passwordTextField;

    @AndroidFindBy(xpath = "android.widget.Button")
    @iOSXCUITFindBy(xpath = "android.widget.Button")
    private MobileElement loginButton;

    // Methods

    public String getUsernameTextFieldText()  {
        return usernameTextField.getText();
    }

    public boolean isUsernameTextFieldDisplayed()  {
        return usernameTextField.isDisplayed();
    }

    public void typePasswordTextField(String text)  {
        passwordTextField.clear();
        passwordTextField.sendKeys(text);
    }

    public String getPasswordTextFieldValue()  {
        return passwordTextField.getAttribute("text");
    }

    public void clearPasswordTextField()  {
        passwordTextField.clear();
    }

    public void clickLoginButton()  {
        loginButton.click();
    }

    public boolean isLoginButtonEnabled()  {
        return loginButton.isEnabled();
    }
}