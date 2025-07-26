@datastructures

Feature: Datastructures Induction

  Background: Home page
    Given the user is on the homepage after loggedin with valid data
    
   
   @time_complexity 
    Scenario: Verify that user is able to navigate to Time Complexity page
    Given The user is in the Data Structures page after clicking on Get started button of DataStructures 
    When  The user clicks on Time Complexity link
    Then  The user should be directed to "Time Complexity" of Data structures-Introduction
    
    @pracice_questions
    Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is on the Time Complexity page
    When  The user clicks practice Questions
    Then  The user should be directed to Practice Questions of Data structures-Introduction Page, again redirected to Time complexity page
    
    @tryEditor
    Scenario: Verify that user is able to navigate to try Editor page
    Given The user is on the Time Complexity page
    When  the user clicks Try here button
    Then  The user should be directed the page having an try Editor with a Run button to test
    
    @tryEditor_nocode
    Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the tryEditor page
    When  The user clicks the Run button without entering the code in the Editor
    Then  The user should able to see error message "no code entered"
    
    @tryEditor_invalidcode
    Scenario: Verify that user receives error when click on Run button by entering invalid code
    Given The user is on the tryEditor page
    When  The user clicks the Run button by entering the  wrong code in the Editor
    Then  The user should able to see alert popup 
  
    @tryEditor_validcode 
    Scenario: Verify that user is able to see output for valid python code
    Given The user is on the tryEditor page
    When  the user clicks the Run button by entering the correct python code
    Then  the user should able to see output in the console window
    
    
    
    
    