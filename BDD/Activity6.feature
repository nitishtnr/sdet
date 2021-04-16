Feature: Open the leads page and add multiple lead accounts using values passed from Feature file
  I want to use this template for my feature file

  @Scenario6
  Scenario: Open the leads page
    Given open the browser to the AlchemyCRM site and login
    And Navigate to Sales->Leads->Create Lead
    When Fill in the necessary details to create lead accounts using the values passed from the feature file
    And Click Save to Finish
    And Navigate to the view Leads page to see results
    Then Close the browser


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |