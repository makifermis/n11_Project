package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class n11HomePage {

    public n11HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement signIn;

    @FindBy(xpath = "//div[@class='facebook_large medium facebookBtn  btnLogin']")
    public WebElement facebookSignInButton;

    @FindBy(xpath = "//button[@title='Only allow essential cookies']")
    public WebElement onlyEssentialCookiesButton;

    @FindBy(xpath = "//a[@class='menuLink user']")
    public WebElement usernameElement;

    @FindBy(id = "searchData")
    public WebElement searchBox;

}
