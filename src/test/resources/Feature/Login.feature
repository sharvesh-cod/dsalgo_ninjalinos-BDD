@Login
Feature: Login page

  Background: Recurring steps for Login
    Given the user is on the Home page
    When user clicks on signin

  @login_valid
  Scenario: login validation with valid data
    When the user enters valid username  password and clicks on Login
    Then the user lands on Home page with message "You are logged in"

 @login_withemptyfields
  Scenario: Login validations with Invalid data
    When the user clicks on Loginbutton without entering username and password
    Then the user should able to see error_message "Please fill out this field." under usernametextbox
    
    @login_usernameEmptyPassword
    Scenario: Login validations with username and without password
     When the user clicks on loginbutton by entering username without password
     Then the user should able to see errormessage "Please fill out this field." under passwordtextbox
     
     @login_passwordEmptyusername
     Scenario: Login validations with password and without username
     When the user clicks on loginbutton by entering password without username
     Then the user should able to see errormessage "Please fill out this field." under usernametextbox
     
     @Login_invalidusernameandpassword
     Scenario: Login validations with invalid username and invalid password
     When the user clicks on loginbutton by entering invalid username and invalid password
     Then the user should able to see errormessage "Invalid Username and Password" 
    
     
     
     
     
     
     
     
     
     
 