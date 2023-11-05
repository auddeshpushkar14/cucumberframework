@komal
Feature: All TCs from Hybrid framework

Scenario: verifylogin_TC01
Given User should be on login page
When user perform valid login
Then user should be navigated to home page


Scenario: verifyInValidlogin_TC02
Given User should be on login page
When user perform invalid login
Then user should be validate error message


Scenario: verifyLogoonLoginScreen_TC03
Given User should be on login page
Then user should be validate logo


