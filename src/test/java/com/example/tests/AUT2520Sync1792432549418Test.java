// @autemos workflow=3249 generator=2
package com.example.tests;

import com.microsoft.playwright.*;
import java.nio.file.Paths;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AUT2520Sync1792432549418Test {
    private static Playwright playwright;
    private static Browser browser;
    private BrowserContext context;
    private Page page;

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
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void testAUT2520Sync1792432549418() throws Exception {
        // @autemos node=open type=openBrowser
        // Browser setup (handled by test framework)
        // @autemos end
        // @autemos node=nav type=navigate
        page.navigate("https://example.com");
        // @autemos end
        // @autemos node=chk type=assert
        com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat(page).hasTitle(java.util.regex.Pattern.compile("Example"));
        // @autemos end
        // @autemos node=close type=closeBrowser
        // Browser teardown (handled by test framework)
        // @autemos end
    }
}