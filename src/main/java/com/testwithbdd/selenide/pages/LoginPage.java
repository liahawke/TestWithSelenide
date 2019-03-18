package com.testwithbdd.selenide.pages;


import com.testwithbdd.selenide.base.BaseClass;
import com.testwithbdd.selenide.utils.YamlParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends AbstractPage {

    // Web elements
    @FindBy(xpath = "//input[@id='email']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    private WebElement loginBtn;

    /**
     * Constructor
     *
     * @param testClass
     */
    public LoginPage(BaseClass testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }

    /** Login form */
    public AccountPage fillInputOnLoginPage() {
        loginInput.sendKeys(YamlParser.getYamlData().getEmail());
        passwordInput.sendKeys(YamlParser.getYamlData().getPassword());
        $(loginBtn).click();
        return new AccountPage(testClass);
    }
}
