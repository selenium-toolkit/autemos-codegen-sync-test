package com.example.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ContactPageTest {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;
    private ContactPage contactPage;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }

    @BeforeEach
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://example.com");
        contactPage = new ContactPage(page);
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void testFirstNameInputType() {
        pageObject.typeFirstNameInput("test value");
    }

    @Test
    public void testFirstNameInputClear() {
        pageObject.clearFirstNameInput();
    }

    @Test
    public void testFirstNameInputGetValue() {
        pageObject.getFirstNameInputValue();
    }

    @Test
    public void testLastNameInputType() {
        pageObject.typeLastNameInput("test value");
    }

    @Test
    public void testLastNameInputClear() {
        pageObject.clearLastNameInput();
    }

    @Test
    public void testLastNameInputGetValue() {
        pageObject.getLastNameInputValue();
    }

    @Test
    public void testPhoneInputType() {
        pageObject.typePhoneInput("test value");
    }

    @Test
    public void testPhoneInputClear() {
        pageObject.clearPhoneInput();
    }

    @Test
    public void testPhoneInputGetValue() {
        pageObject.getPhoneInputValue();
    }

    @Test
    public void testMessageInputType() {
        pageObject.typeMessageInput("test value");
    }

    @Test
    public void testMessageInputClear() {
        pageObject.clearMessageInput();
    }

    @Test
    public void testMessageInputGetValue() {
        pageObject.getMessageInputValue();
    }

    @Test
    public void testEmailInputType() {
        pageObject.typeEmailInput("test value");
    }

    @Test
    public void testEmailInputClear() {
        pageObject.clearEmailInput();
    }

    @Test
    public void testEmailInputGetValue() {
        pageObject.getEmailInputValue();
    }


}