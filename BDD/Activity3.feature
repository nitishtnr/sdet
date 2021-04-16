Feature: Post a job
 @Scenario3
  Scenario: Post a job using details passed from the Feature file
  Given  go to Alchemy Jobs site and navigate to Post a Job page
  When User enters "testankit14@gmail.com" and "Alchemy SDET DK" and "Test job for Cucumber project" and "IBM" and click Preview and submit
  Then Go to the Jobs page and Confirm job listing is shown on page "Alchemy SDET DK"