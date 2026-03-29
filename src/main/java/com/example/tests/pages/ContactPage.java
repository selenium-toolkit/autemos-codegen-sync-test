package com.example.tests;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class ContactPage  {
    private final Page page;

    private Locator firstNameInput;

    private Locator lastNameInput;

    private Locator phoneInput;

    private Locator messageInput;

    private Locator emailInput;

    public ContactPage(Page page)  {
        this.page = page;
        this.firstNameInput = page.locator("#first_name");
        this.lastNameInput = page.locator("#last_name");
        this.phoneInput = page.locator("#phone");
        this.messageInput = page.locator("#HJprwhZIuGpwqiyCflS3");
        this.emailInput = page.locator("#email");
    }

    public void typeFirstNameInput(String text)  {
        firstNameInput.fill(text);
    }

    public String getFirstNameInputValue()  {
        return firstNameInput.inputValue();
    }

    public void clearFirstNameInput()  {
        firstNameInput.clear();
    }

    public void typeLastNameInput(String text)  {
        lastNameInput.fill(text);
    }

    public String getLastNameInputValue()  {
        return lastNameInput.inputValue();
    }

    public void clearLastNameInput()  {
        lastNameInput.clear();
    }

    public void typePhoneInput(String text)  {
        phoneInput.fill(text);
    }

    public String getPhoneInputValue()  {
        return phoneInput.inputValue();
    }

    public void clearPhoneInput()  {
        phoneInput.clear();
    }

    public void typeMessageInput(String text)  {
        messageInput.fill(text);
    }

    public String getMessageInputValue()  {
        return messageInput.inputValue();
    }

    public void clearMessageInput()  {
        messageInput.clear();
    }

    public void typeEmailInput(String text)  {
        emailInput.fill(text);
    }

    public String getEmailInputValue()  {
        return emailInput.inputValue();
    }

    public void clearEmailInput()  {
        emailInput.clear();
    }
}