@activity16
Feature: Data driven test without Example

Scenario: Testing with Data from the Scenario
    Given User is on the Login page
    When User enters both the "admin" and "password"
    Then Read from the page title and confirmation message
    And Close from the Browser