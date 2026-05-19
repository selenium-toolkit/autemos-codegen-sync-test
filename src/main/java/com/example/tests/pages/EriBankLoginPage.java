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
public class EriBankLoginPage  {
    private AppiumDriver<MobileElement> driver;

    public EriBankLoginPage(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Fields
    @AndroidFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/passwordTextField']")
    @iOSXCUITFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/passwordTextField']")
    private MobileElement passwordTextField;

    @AndroidFindBy(xpath = "//*[@resource-id="com.experitest.ExperiBank:id/rememberMe"]")
    @iOSXCUITFindBy(xpath = "//*[@resource-id="com.experitest.ExperiBank:id/rememberMe"]")
    private MobileElement rememberMeCheckbox;

    @AndroidFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/loginButton']")
    @iOSXCUITFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/loginButton']")
    private MobileElement loginButton;

    @AndroidFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/usernameTextFieldBrokenttt']")
    @iOSXCUITFindBy(xpath = "[resource-id='com.experitest.ExperiBank:id/usernameTextFieldBrokenttt']")
    private MobileElement usernameTextField;

    // Methods

    public void clickPasswordTextField()  {
        passwordTextField.click();
    }

    //Demo

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

    public String getLoginButtonText()  {
        return loginButton.getText();
    }

    public void clickUsernameTextField()  {
        usernameTextField.click();
    }

    //Demo

    public void typeUsernameTextField(String text)  {
        usernameTextField.clear();
        usernameTextField.sendKeys(text);
    }

    public String getUsernameTextFieldValue()  {
        return usernameTextField.getAttribute("text");
    }

    public void clearUsernameTextField()  {
        usernameTextField.clear();
    }
}