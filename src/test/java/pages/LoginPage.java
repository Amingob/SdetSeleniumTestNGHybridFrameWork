package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }

    @FindBy(xpath="//input[@name='uid']")
    @CacheLookup
    WebElement useName;

    @FindBy(xpath="//input[@name='password']")
    @CacheLookup
    WebElement passWord;

    @FindBy(xpath="//input[@name='btnLogin']")
    @CacheLookup
    WebElement btnLogin;

    public void submitUserName(String txtUserName){
        useName.clear();
        useName.sendKeys(txtUserName);
    }

    public void submitPassWord(String txtPassWord){
        passWord.clear();
        passWord.sendKeys(txtPassWord);
    }

    public void clickSubmitBtn(){

        passWord.click();
    }
}
