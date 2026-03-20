package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class HomePage  {
    private final Page page;

    private Locator contactLink;

    public HomePage(Page page)  {
        this.page = page;
        this.contactLink = page.locator("xpath=//a[contains(.,'Contact')]");
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
}