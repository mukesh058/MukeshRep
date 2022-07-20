Feature: To verify login functionality.
Scenario: Chrcking the fucnctionality for valid data.
Given User on the webpage "https://www.saucedemo.com/".
And User passes '<username>'
And User enter '<passward>'
When click on the loginButton
Then user navigate to product catalog page
Examples:
|username|passward|
|standard_user|secret_sauce|
|problem_user|secret_sauce| 
