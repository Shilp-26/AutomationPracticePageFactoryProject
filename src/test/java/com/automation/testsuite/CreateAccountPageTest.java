package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class CreateAccountPageTest extends TestBase {


    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void inIt() {

        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnSignInLink();
        signInPage.enterEmailCreate(getRandomEmail());
        signInPage.clickOnCreateAccountBtn();
        createAccountPage.enterFirstName("john");
        createAccountPage.enterLastName("Johnson");
        createAccountPage.enterPassword("Prime258");
        createAccountPage.enterFirstNameField("John");
        createAccountPage.enterLastNameField("Johnson");
        createAccountPage.enterAddress("43 london rd");
        createAccountPage.enterCity("london");
        createAccountPage.selectState("Idaho");
        createAccountPage.enterZipCode("90934");
        createAccountPage.enterPhoneNumber("07572537467");
        createAccountPage.enterReference("Home");
        createAccountPage.clickOnRegisterBtn();
    }
}
