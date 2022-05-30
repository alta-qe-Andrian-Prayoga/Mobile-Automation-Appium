package com.example.steps;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorPageStepDefs {

    String total;

    CalculatorPage calculatorPage = new CalculatorPage();
    LoginPage loginPage = new LoginPage();

    @Given("user login using username {string} and password {string}")
    public void userLogin(String username, String password){
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickButoonlogin();

    }

    @When("number one is {int}")
    public void inputNumberOne(int a) {
        calculatorPage.inputNumberOne(a);

    }

    @And("number two is {int}")
    public void inputNumberTwo(int b) {
        calculatorPage.inputNumberTwo(b);

    }

    @And("number one plus number two")
    public void addNumbers() {
        calculatorPage.selectSpinner();
        calculatorPage.selectAdd();
        calculatorPage.clickButtonTotal();

    }

    @And("number one minus number two")
    public void numberOneMinusNumberTwo() {
        calculatorPage.selectSpinner();
        calculatorPage.selectMinus();
        calculatorPage.clickButtonTotal();
    }

    @And("number one divided number two")
    public void numberOneDividedNumberTwo() {
        calculatorPage.selectSpinner();
        calculatorPage.selectDivided();
        calculatorPage.clickButtonTotal();
    }

    @And("number one multiplied number two")
    public void numberOneMultipliedNumberTwo() {
        calculatorPage.selectSpinner();
        calculatorPage.selectMultiplied();
        calculatorPage.clickButtonTotal();
    }

    @Then("user can see the total should be {int}")
    public void validateTotal(int expectedTotal) {
        this.total = calculatorPage.viewResult();
        assertThat(total).isEqualTo("Hasil : " + expectedTotal);

    }


}
