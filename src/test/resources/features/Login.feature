@login @Android
Feature: Login

  @smoke
  Scenario: Verify user login when using valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    When user go to list menu
    When user do swipe up on list data
    Then user find the list

  Scenario: Verify user login when using valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button sign in
    Then user successfully login