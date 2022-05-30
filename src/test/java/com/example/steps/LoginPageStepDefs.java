package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageStepDefs {

    LoginPage loginPage = new LoginPage();
    NavigationMenu  navigationMenu = new NavigationMenu();

    @Given("user is on login page")
    public void onLoginPage() {
    }

    @When("user input username {string}")
    public void inputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("user input password {string}")
    public void inputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click button sign in")
    public void clickButtonSignIn() {
        loginPage.clickButoonlogin();
    }

    @Then("user successfully login")
    public void userSuccessfullyLogin() {
        String title = navigationMenu.getMenuTitleText();
        Assertions.assertEquals("Calculator", title);

        boolean isDisplayed = navigationMenu.checkHamburberMenuDisplayed();
        Assertions.assertTrue(isDisplayed);
    }
}
