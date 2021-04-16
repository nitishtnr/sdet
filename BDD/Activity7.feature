Feature: Schedule a meeting and invite members
  I want to use this template for my feature file

  @Scenario7
  Scenario: Schedule a meeting and include 3 invitees
    Given Open the browser to the Alchemy CRM site and login
    And Navigate to Activities->Meetings->Schedule a Meeting
    And Enter the details of the meeting
    And search for "<members>" and add them to meeting and the names to be searched will be written in the feature file in a Examples Table
    And Click save
    And Navigate to Views Meetings page and confirm creation of the meeting
    And quit the browser

 
      | members|
      | Sally | 
      | Will|
      | Fern|