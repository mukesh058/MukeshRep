Feature: To verify the functionality of login page

Background:
 
Given User is able to open the url "https://www.saucedemo.com/"

Scenario: To validate that user is able to login the website using valid username and password
And user is able to enter the userld '<username>'
And user is pass the passld '<password>'
When tap on the login button
Then user should be navigated to the next page.
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|




Scenario:
To validate that all the products display properly
And user entered the userid "standard_user"
And user passed the pass "secret_sauce"
When click on the login button 
Then User should be able to navigated to next page where he is able to see all the product details.


  
  
