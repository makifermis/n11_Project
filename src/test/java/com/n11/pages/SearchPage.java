package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "2")
    public WebElement secondPage;

    @FindBy(xpath = "((//div[@data-ctgid='12'])[3]//div)[3]/following-sibling::span")
    public WebElement thirdProductAddToFavorites;

    @FindBy(xpath = "//a[@class='menuTitle']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@title='Favorilerim / Listelerim']")
    public WebElement myFavoritesAndLists;

    @FindBy(xpath = "(//h4[@class='listItemTitle'])[1]")
    public WebElement myFavoritesLink;

    @FindBy(xpath = "//span[@class='deleteProFromFavorites']")
    public WebElement deleteFromFavorites;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement deletedConfirmation;

    @FindBy(xpath = "//a[@class='logoutBtn']")
    public WebElement logout;

}
