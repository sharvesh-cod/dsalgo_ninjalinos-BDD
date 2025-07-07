@Datastructures-introduction
Feature: Datastructures Induction

  Background: Home page
    Given the user is on Home page
    
   Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is on the Home page after logged in
    When  The user clicks the Getting Started button in Data Structures - Introduction
    Then  The user should land on Data Structures- Introduction Page 
    
    Scenario: Verify that user is able to navigate to Time Complexity page
    Given The user is in the Data Structures - Introduction page
    When  The user clicks on Time Complexity link
    Then  The user should be directed to Time Complexity of Data structures-Introduction
    
    Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is on the Time Complexity page
    When  The user clicks practice Questions
    Then  The user should be directed to Practice Questions of Data structures-Introduction Page, again redirected to Time complexity page
    
    Scenario: Verify that user is able to navigate to try Editor page
    Given The user is on the Time Complexity page
    When  the user clicks Try here button
    Then  The user should be directed the page having an try Editor with a Run button to test
    
    Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is on the tryEditor page
    When  The user clicks the Run button without entering the code in the Editor
    Then  The user should able to see error message in alert window
    
    Scenario: Verify that user receives error when click on Run button by entering invalid code
    Given The user is on the tryEditor page
    When  The user clicks the Run button by entering the  wrong code in the Editor
    Then  The user should able to see error message in alert window
    
    Scenario: Verify that user is able to see output for valid python code
    Given The user is on the tryEditor page
    When  the user clicks the Run button by entering the correct python code
    Then  the user should able to see output in the console window
    
    
    
    
    