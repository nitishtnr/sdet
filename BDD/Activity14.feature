@activity14
Feature: Login Test

@Scenario14
Scenario: Testing Login
    Given User is on Login page
    When User enters username and password
    Then Read the page title and confirmation message
    And detach from the Browser