package com.example.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShowcaseNavigationTest {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;
    private ShowcaseNavigation showcaseNavigation;

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
        page.navigate("http://frontend/demo#platform");
        showcaseNavigation = new ShowcaseNavigation(page);
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void testPlatformSectionClick() {
        pageObject.clickPlatformSection();
    }

    @Test
    public void testPlatformSectionGetText() {
        pageObject.getPlatformSectionText();
    }

    @Test
    public void testSectionLinksClick() {
        pageObject.clickSectionLinks();
    }

    @Test
    public void testSectionLinksGetText() {
        pageObject.getSectionLinksText();
    }

    @Test
    public void testSectionLinksGetHref() {
        pageObject.getSectionLinksHref();
    }


}