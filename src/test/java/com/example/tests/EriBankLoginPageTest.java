package com.example.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.net.URL;

public class EriBankLoginPage {

    private AppiumDriver<MobileElement> driver;
    private EriBankLoginPage pageObject;

    @BeforeEach
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", "/path/to/app.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        pageObject = new EriBankLoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testUsernameTextFieldType() {
        pageObject.typeUsernameTextField("test value");
    }

    @Test
    public void testUsernameTextFieldClear() {
        pageObject.clearUsernameTextField();
    }

    @Test
    public void testUsernameTextFieldGetValue() {
        pageObject.getUsernameTextFieldValue();
    }

    @Test
    public void testPasswordTextFieldType() {
        pageObject.typePasswordTextField("test value");
    }

    @Test
    public void testPasswordTextFieldClear() {
        pageObject.clearPasswordTextField();
    }

    @Test
    public void testPasswordTextFieldGetValue() {
        pageObject.getPasswordTextFieldValue();
    }

    @Test
    public void testLoginButtonClick() {
        pageObject.clickLoginButton();
    }

    @Test
    public void testLoginButtonIsEnabled() {
        pageObject.isLoginButtonEnabled();
    }


}