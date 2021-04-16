@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Scenario12
  Scenario: Title of your scenario
    Given Open alongwith browser the OrangeHRM page and login with credentials provided
    And Navigate to Recruitment page
    And Click the Vacancies menu item to navigate to the vacancies page
    And Click the Add button to navigate to the Add Job Vacancy form
    Then Fill out "<VacancyName>" along with "<HiringManager>"
    And Click on the Save button to save the vacancy
    Then Verify that the vacancy has been created
    And Disarm the browser