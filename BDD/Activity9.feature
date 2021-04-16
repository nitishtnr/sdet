@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Scenario9
  Scenario: Posting the orangeHRM function
    Given Open the OrangeHRM page and login with credentials provided
    And Navigate to the Recruitment page
    And Click on the Vacancies menu item to navigate to the vacancies page
    And Click on the Add button to navigate to the Add Job Vacancy form 
    And Fill out the necessary details
    And Click the Save button to save the vacancy
    Then Verify that the vacancy was created
    And Disarm the browser
