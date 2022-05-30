@calculator @Android
Feature: Calculator

  Background: User has already login
    Given user login using username "admin" and password "admin"

    @calculator @penjumlahan
  Scenario: User adding two numbers
    When number one is 2
    And number two is 3
    And number one plus number two
    Then user can see the total should be 5

   @calculator @pengurangan
  Scenario: User subtracts two numbers
    When number one is 6
    And number two is 2
    And number one minus number two
    Then user can see the total should be 4

   @calculator @pembagian
  Scenario: User divides two numbers
    When number one is 16
    And number two is 2
    And number one divided number two
    Then user can see the total should be 8

    @perkalian
  Scenario: User multiplies two numbers
    When number one is 4
    And number two is 4
    And number one multiplied number two
    Then user can see the total should be 16