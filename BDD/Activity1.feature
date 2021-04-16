Feature: Create a new user
@Scenario1
Scenario:Validate if a user can be created
Given user open the Browser and Navigate to Alchemy URL
When user is able to login and locate the left hand menu and click the menu item that says "Users"
And user is able to locate the "Add new" button and click it
And user is able to fill in the necessary details and click on "Add new User"
Then verify that user was created
And close the browser