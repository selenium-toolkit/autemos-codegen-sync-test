package com.example.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.net.URL;
import com.example.tests.pages.EriBankLoginPage;
import com.example.tests.pages.EriBankHomePage;
import com.example.tests.pages.EriBankPaymentPage;
import com.example.tests.pages.EriBankDialogsPage;
//Chris / NIck / Roman
public class ShowcaseEriBankMobileTest {

    private AppiumDriver<MobileElement> driver;
    private ShowcaseEriBankMobileTest pageObject;

    @BeforeEach
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", "/path/to/app.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        pageObject = new ShowcaseEriBankMobileTest(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testShowcaseEriBankMobileTest() {
        // Step: webhookTrigger (Webhook Trigger)
        // Browser setup (handled by test framework)
        File src = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshots/Screenshot_Login.png"));
        EriBankLoginPage eriBankLoginPage = new EriBankLoginPage(driver);
        eriBankLoginPage.typeUsernameTextField("company");
        eriBankLoginPage.typePasswordTextField("company");
        eriBankLoginPage.clickLoginButton();
        File src = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshots/Screenshot_Home.png"));
        EriBankHomePage eriBankHomePage = new EriBankHomePage(driver);
        eriBankHomePage.clickMakePaymentButton();
        EriBankPaymentPage eriBankPaymentPage = new EriBankPaymentPage(driver);
        eriBankPaymentPage.typePhoneTextField("+1234567890");
        eriBankPaymentPage.typeNameTextField("STK Test");
        eriBankPaymentPage.typeAmountTextField("100");
        eriBankPaymentPage.clickCountryButton();
        EriBankDialogsPage eriBankDialogsPage = new EriBankDialogsPage(driver);
        eriBankDialogsPage.clickCountryListSwitzerland();
        eriBankPaymentPage.clickSendPaymentButton();
        eriBankDialogsPage.clickConfirmYesButton();
        File src = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshots/Screenshot_Result.png"));
        // Browser teardown (handled by test framework)
    }
}