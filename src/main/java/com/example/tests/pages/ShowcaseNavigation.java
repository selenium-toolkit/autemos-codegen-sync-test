package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class ShowcaseNavigation  {
    private final Page page;

    private Locator platformSection;

    private Locator sectionLinks;

    public ShowcaseNavigation(Page page)  {
        this.page = page;
        this.platformSection = page.locator("//section[@id='platform']");
        this.sectionLinks = page.locator("//nav//a[@href]");
    }

    public void clickPlatformSection()  {
        platformSection.click();
    }

    public String getPlatformSectionText()  {
        return platformSection.textContent();
    }

    public boolean isPlatformSectionDisplayed()  {
        return platformSection.isVisible();
    }

    public void clickSectionLinks()  {
        sectionLinks.click();
    }
}