@activity13
Feature: Basic Syntax
@Scenario13
Scenario: Opening a webpage using Selenium
    Given User is on Google Home Page
    When User types in Cheese and hits ENTER
    Then Show how many search results were shown
    And log out from the browser