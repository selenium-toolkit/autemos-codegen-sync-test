package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class HomePage  {
    private final Page page;

    private Locator contactLink;

    private Locator mindsetLink;

    private Locator servicesSection;

    private Locator searchInput;

    private Locator boltCuttersLink;

    public HomePage(Page page)  {
        this.page = page;
        this.contactLink = page.locator("xpath=//a[contains(.,'Contact')]");
        this.mindsetLink = page.locator("xpath=//a[contains(.,'Mindset')]");
        this.servicesSection = page.locator("xpath=//h2[contains(.,'Our Services.') or contains(.,'Services')]/..");
        this.searchInput = page.locator("#search-query");
        this.boltCuttersLink = page.locator("[data-test=\"product-01KM5EE8Q7S625EK96D8ZMQD2X\"]");
    }

    public void clickContactLink()  {
        contactLink.click();
    }

    public String getContactLinkText()  {
        return contactLink.innerText();
    }

    public String getContactLinkHref()  {
        return contactLink.getAttribute("href");
    }

    public void clickMindsetLink()  {
        mindsetLink.click();
    }

    public String getMindsetLinkText()  {
        return mindsetLink.innerText();
    }

    public String getMindsetLinkHref()  {
        return mindsetLink.getAttribute("href");
    }

    public void typeSearchInput(String text)  {
        searchInput.fill(text);
    }

    public String getSearchInputValue()  {
        return searchInput.inputValue();
    }

    public void clearSearchInput()  {
        searchInput.clear();
    }

    public void clickBoltCuttersLink()  {
        boltCuttersLink.click();
    }

    public String getBoltCuttersLinkText()  {
        return boltCuttersLink.innerText();
    }

    public String getBoltCuttersLinkHref()  {
        return boltCuttersLink.getAttribute("href");
    }
}