@list @Android
Feature: List

  Background: User has already login
    Given user login using username "admin" and password "admin"

  Scenario: User successfully do swipe up list data
    When user go to list menu
    When user do swipe up on list data
    When user do long press on list data
    When user do multiple tap on list data
    Then user find the list