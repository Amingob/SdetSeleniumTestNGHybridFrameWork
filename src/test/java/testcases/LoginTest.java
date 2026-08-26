package testcases;

import basetest.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTestWithValidUserNameAndValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");

        loginPage.submitUserName(userName);
        loginPage.submitPassWord(passWord);
        loginPage.clickSubmitBtn();
    }

    @Test
    public void loginTestWithInValidUserNameAndValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");


        loginPage.submitUserName(userName + "2000");
        loginPage.submitPassWord(passWord);
        loginPage.clickSubmitBtn();

    }

    @Test
    public void loginTestWithValidUserNameAndInValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");

        loginPage.submitUserName(userName );
        loginPage.submitPassWord(passWord + "2000");
        loginPage.clickSubmitBtn();

    }

    @Test
    public void loginTestWithInValidUserNameAndInValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");

        loginPage.submitUserName(userName + "2000");
        loginPage.submitPassWord(passWord + "2000");
        loginPage.clickSubmitBtn();

    }

    @Test
    public void loginTestWithNoUserNameAndNoPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");

        loginPage.submitUserName(" ");
        loginPage.submitPassWord( " ");
        loginPage.clickSubmitBtn();

    }
}
