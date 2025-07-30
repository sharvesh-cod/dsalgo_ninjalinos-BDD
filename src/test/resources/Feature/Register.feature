@register

Feature: registration  page

  Background: Home page
    Given the user is on Register page after clicking on registerlink from Home page
   # When  the user clicks on Register
#Try with more data for credentails

@register_valid
  Scenario: register with valid inputs
    When the user enters valid inputs and clicks on register button
    Then User able to see "user is already registered"  message

@register_Withemptyfields
  Scenario: register with all fields empty
  When the user clicks on register button with empty fields
  Then the user should see error message "Please fill out this field." below usernamebox  
  
 @register_withonlyusername
  Scenario: register with only username remaining all fields empty
  When the user clicks on register button by entering username and remaining fields empty 
  Then the user should see error message "Please fill out this field." below passwordbox
  
  @register_withonlypassword
  Scenario: register with only password remaining all fields empty
  When the user clicks on register button by entering password and reamining fields empty
  Then the user should see error message "Please fill out this field." below usernamebox
  
  @register_withoutconfirmpassword
  Scenario: register without entering confirmpassword
  When the user clicks on register button after entering username and password with empty confirmpassword
  Then the user should see error message "Please fill out this field." below confirmpasswordbox 
  
  @register_withinvaliddata
  Scenario: register with all invalid data
  When the user clicks on register button after entering invalid data in all fields
  Then the user should see error message "password_mismatch:The two password fields didn’t match."
  
  
  
  
  
  
  
  
  