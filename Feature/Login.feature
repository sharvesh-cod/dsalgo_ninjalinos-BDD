Feature: User Login

As a registered user
I want to log into DsAlgo portal 
So that I can access the Tree and Graph Modules

Background:
Given User Launch the browser
When User enter url "https://dsportalapp.herokuapp.com/"
Then User should see the app loaded and get started button
When User click the Get Started Button
Then User should be able to navigate to home page
When The user click the Sign in Button
Then login page should be loaded with username and password options

Scenario: Successfull Login with Valid Credentials
When User provides the valid username, password
And  click login button
Then User should see the home page
And close the browser

Scenario: Login with invalid Credentials 

When User provides the invalid username, password
And  click login button
Then User should see the error pop-up msg Invalid Username and Password
And close the browser
 
