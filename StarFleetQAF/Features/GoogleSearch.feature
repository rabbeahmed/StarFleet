


Feature: Google search
Scenario Outline: Perform a simple search

Given I am on google homepege
When I enter a search "<keyword>" on the search box
And I click on the search buttom 
Then I find revelant results and count of the results 


Examples:
|keyword									|
|Qualituy Assurance 			|
|Test Automation					|