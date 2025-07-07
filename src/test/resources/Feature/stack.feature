@stack
Feature: Testing all the scenarios in stack module

  Background: The user clicks on the get started button of stack module after signing in to the ds algo portal
    Given user signs into the portal using valid username "ninjalinos@work.com" and password "sdet218920@" following which navigates to the stack page

  
  @Stackoperations
  Scenario: Verify that the user is able to navigate to Operations in Stack page
    When user clicks on operations in stack button of Stack module
    Then user successfully navigates to the operations in stack page

  @StackoperationsCodeEditor
  Scenario: Verify user is able to open Try here page from operations in stack page
    Given user is in operations in stack page
    When user clicks on try here button in operations in stack page
    Then user successfully navigates to code editor of the operations in stack page

  @StackoperationsTryingEmptyEditor
  Scenario: Verify user receives error while clicking on Run button without typing in code(operations in stack)
    Given user is in try here page of operations in stack page
    When user clicks on Run button in Try here page without entering any code in the editor
    Then user does not see any alert message saying code eitor is empty

  @StackoperationsTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(operations in stack)
    Given user is in try here page of operations in stack page
    When user clicks on Run button in Try here page after entering a code with error in the editor
    Then user gets an alert message about the error in code

  @StackoperationsTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code (operations in stack)
    Given user is in try here page of operations in stack page
    When user clicks on Run button in Try here page after entering a correct code in the editor
    Then user is able to see the output in the console

  @Stackimplementation
  Scenario: Verify if user is able to navigate to implementation page
    Given user is in operations in stack page
    When user clicks on Implementation link
    Then user sucessfully navigates to the Implementation page

  @StackimplementationCodeEditor
  Scenario: Verify user is able to open Try here page from implementation page
    Given user is in implementation page
    When user clicks on try here button in implementation page
    Then user successfully navigates to the code editor of implementation page

  @StackimplementationTryingEmptyEditor
  Scenario: Verify user receives error while clicking on Run button without typing in code(implementation page)
    Given user is in try here page of implementation page
    When user clicks on Run button in Try here page without entering any code in the editor
    Then user does not see any alert message saying code eitor is empty

  @StackimplementationTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(implementation page)
    Given user is in try here page of implementation page
    When user clicks on Run button in Try here page after entering a code with error in the editor
    Then user gets an alert message about the error in code

  @StackImplementationTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code(implementation page)
    Given user is in try here page of implementaiton page
    When user clicks on Run button in Try here page after entering a correct code in the editor
    Then user is able to see the output in the console

  @Stackapplication
  Scenario: Verify if user is able to navigate to Application page
    Given user is in implementation page
    When user clicks on application link
    Then user sucessfully navigates to the applicaiton page

  @StackapplicationCodeEditor
  Scenario: Verify user is able to open Try here page from Application page
    Given user is in applicaiton page
    When user clicks on try here button in application page
    Then user successfully navigates to the code editor of application page

  @StackapplicationTryingEmptyEditor
  Scenario: Verify user receives error while clicking on Run button without typing in code(Application page)
    Given user is in try here page of applicaiton page
    When user clicks on Run button in Try here page without entering any code in the editor
    Then user does not see any alert message saying code eitor is empty

  @StackapplicationTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(Application page)
    Given user is in try here page of application page
    When user clicks on Run button in Try here page after entering a code with error in the editor
    Then user gets an alert message about the error in code

  @StackapplicationTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code(Application page)
    Given user is in try here page of application page
    When user clicks on Run button in Try here page after entering a correct code in the editor
    Then user is able to see the output in the console

  @StackopenImplementationFromStackPage
  Scenario: Verify that the user is able to navigate to Implementation page from stack page
    Given user is in stack page
    When user clicks on Implementation button
    Then user sucessfully navigates to the  Implementation page

  @StackopenApplicaitonFromStackPage
  Scenario: Verify that the user is able to navigate to Application page from stack page
    Given user is in stack page
    When user clicks on Application button
    Then user sucessfully navigates to the Application page

  @StackopenPracticeQuestions
  Scenario: Verify that the user is able to navigate to practice questions from Application page
    Given user is in the application page
    When user clicks on the practice questions link in stack module
    Then user sucessfully navigates to practice questions of stack module however the page is empty

  
