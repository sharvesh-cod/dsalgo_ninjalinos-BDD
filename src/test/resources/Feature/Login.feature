@Login
Feature: Login page

Background: Recurring steps for Login

Given the user is on Home page
When  user clicks on signin

Scenario: login validation with valid data

When the user enters valid username , password and clicks on Login
Then the user lands on Home page with message you are logged in

Scenario Outline: Login validations with Invalid data

When the user enters   "<username>" and "<password>" and clicks on Login
Then the user will able to see error message in login page

Examples:
|username|password|
|        |        |
|ninjalinos|      |
|         |3905u3jrlksd|
|nfiwjhfiodj|ndfnfdkjn|

          

