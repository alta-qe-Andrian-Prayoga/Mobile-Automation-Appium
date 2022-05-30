package com.example.steps;

import com.example.app.pages.ListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListPageStepDefs {

    ListPage listPage = new ListPage();

    @When("user do swipe up on list data")
    public void userDoSwipeUpOnListData(){
        listPage.swipeUp();
    }

    @When("user do long press on list data")
    public void userDoLongTapOnListData() {
        listPage.longPress();
    }

    @When("user do multiple tap on list data")
    public void userDoMultipleTapOnListData() {
        listPage.multipleTap();
    }

    @Then("user find the list")
    public void userFindTheList() {
        listPage.listIsDisplayed();
    }

}
