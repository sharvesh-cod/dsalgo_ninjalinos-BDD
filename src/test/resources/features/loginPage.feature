@Login
Feature: User Login
  
  As a registered user
  I want to log into DsAlgo portal 
  So that I can access the Tree and Graph Modules

  Background: 
    Given User launches the browser, navigates to "https://dsportalapp.herokuapp.com/"
    And the user click the get started button

  @ValidLogin
  Scenario: Successfull Login with Valid Credentials
    When User clikc the signin button
    Then User should navigated to login page 
    When User provides the valid username "ninjalinos@work.com", valid password "sdet218920@"
    And User should click the login button 
    Then User should see the message "You are logged in" 

