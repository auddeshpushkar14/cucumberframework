@Audi
Feature: Login functionality

Background:
Given user is on login page

@Rashmi @smoke @sanity @regression
Scenario: valid login
When user enters valid user id
And enters valid password
And click on login button
Then user should be navigated to home page
And user can see logout link
And close browser


@rutuja
Scenario: Invalid login
When user enters invalid user id
And enters valid password
And click on login button
Then user should be navigated to login page
And user can see error message
And close browser

@dev
Scenario Outline: Invalid login with multiple data
When user enters invalid user id as "<userid>"
And enters valid password as "<password>"
And click on login button
Then user should be navigated to login page
And user can see error message
And close browser
Examples:
|userid | password |
|admin1 | pass1 |
|admin2 | pass2 |
|admin3 | pass3 |
|admin4 | pass4 |

@gauri
Scenario: create lead
Given user should be on home page
When user click on new lead link and fill valid data and click on save button
|name     |company  |
|dhanshri | kuch bhi|
|Sonali | Google|
Then lead should be created successfully