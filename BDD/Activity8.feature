Feature: Title of your feature
  I want to use this template for my feature file

  @Scenario8
  Scenario: Title of your scenario
    Given Log in  to the Alchemy CRM Site by opening the browser
    And Navigate to All->Products->Create Product
    And Retrieve information about the "<product>"  with "<price>" from an Examples table in the feature file and Using the data from the table enter the details of the product
    And Click the save button
    Then Go to the "View Products" page to see all products listed
    And disable the browser



    Examples: 
      | product|price|
      | jj     | $4.00| 
      | mm     | $5.00|