@Login
Feature: User Login
  
  As a registered user
  I want to log into DsAlgo portal 
  So that I can access the Tree and Graph Modules

  Background: 
    Given User launches the browser, navigates to "https://dsportalapp.herokuapp.com/"
    And the user click the get started button

@ValidLogin
Scenario: Successful Login with Valid Credentials
  When User click the signin button
  Then User should be navigated to login page
  When User provides the valid credentails "ninjalinos@work.com" "sdet218920@"
  And  User should click the login button 
  Then User should see the message "You are logged in"