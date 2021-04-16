@tag
Feature: Title of your feature
  I want to use this template for my feature file
@Scenario10
  Scenario: Log with Candidate Vacancy
    Given Open the OrangeHRM website and login with credentials provided
    And Navigate to the Recruitment page and click on the Add button to add candidate information
    And On the next page fill in the details of the candidate
    And Upload a resume docx or pdf to the form
    And Click the Save button
    Then Navigate back to the Recruitments page to confirm candidate entry
    And Close and quit from the browser