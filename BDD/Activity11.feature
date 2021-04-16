@tag
Feature: Title of your feature
  I want to use this template for my feature file

@Scenario11
  Scenario: Title of your scenario
    Given Go to the OrangeHRM page and login with credentials provided
    And Find the PIM option in the menu and click
    And Click the Add button to add a new Employee
    And Make sure the Create Login Details checkbox is checked
    And Fill in the required fields using the data from the Examples table using "<FirstName>" and "<LastName>" along with "<UserName>" and click Save
    Then Verify that the employees with "<FirstName>" have been created
    And Close with the browser

Examples: 
       |FirstName|LastName|UserName|
        |  yanki1 | kun1 |yankikun1|
        |  yanki2 | kun2 |yankikun2|