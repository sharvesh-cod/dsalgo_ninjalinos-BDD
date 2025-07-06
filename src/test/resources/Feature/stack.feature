@stack
Feature: Testing all the scenarios in stack module

  Background: user successfully logs into the ds algo portal after reaching the home page via launch page
    Given user signs into the portal using valid username "ninjalinos@work.com" and password "sdet218920@"

  @stackPage
  Scenario: user opens the stack page
    Given user is in home page of ds algo portal after signing in
    When user clicks on Get started button of Stack module
    Then user successfully navigates to the stack page in ds algo portal

  @Stackoperations
  Scenario: user opens the operations in stack page
    Given user is in stack page of ds algo portal
    When user clicks on operations in stack button of Stack module
    Then user successfully navigates to the operations in stack page

  @StackoperationsCodeEditor
  Scenario: user opens the code editor from operations in stack page
    Given user is in operations in stack page
    When user clicks on try here button in operations in stack page
    Then user successfully navigates to code editor of the operations in stack page

  @StackoperationsTryingEmptyEditor
  Scenario: user opens the code editor from operations in stack page to run without entering any code
    Given user is in try here page of operations in stack page
    When user clicks on Run button in Try here page without entering any code in the editor
    Then user does not see any alert message saying code eitor is empty

  @StackoperationsTryingCodeWithError
  Scenario: user opens the code editor from operations in stack page to run code with error
    Given user is in try here page of operations in stack page
    When user clicks on Run button in Try here page after entering a code with error in the editor
    Then user gets an alert message about the error in code

  @StackoperationsTryingCorrectCode
  Scenario: user opens the code editor from operations in stack page to run a correct code
    Given user is in try here page of operations in stack page
    When user clicks on Run button in Try here page after entering a correct code in the editor
    Then user is able to see the output in the console

  @Stackimplementation
  Scenario: user navigates to implementation page in stack
    Given user is in operations in stack page
    When user clicks on Implementation link
    Then user sucessfully navigates to the Implementation page

  @StackimplementationCodeEditor
  Scenario: user opens the code editor from implementation page
    Given user is in implementation page
    When user clicks on try here button in implementation page
    Then user successfully navigates to the code editor of implementation page

  @StackimplementationTryingEmptyEditor
  Scenario: user opens the code editor from implementation page to run without entering any code
    Given user is in try here page of implementation page
    When user clicks on Run button in Try here page without entering any code in the editor
    Then user does not see any alert message saying code eitor is empty

  @StackimplementationTryingCodeWithError
  Scenario: user opens the code editor from implementation page to run code with error
    Given user is in try here page of implementation page
    When user clicks on Run button in Try here page after entering a code with error in the editor
    Then user gets an alert message about the error in code

  @StackImplementationTryingCorrectCode
  Scenario: user opens the code editor from implementation page to run a correct code
    Given user is in try here page of implementaiton page
    When user clicks on Run button in Try here page after entering a correct code in the editor
    Then user is able to see the output in the console

  @Stackapplication
  Scenario: user navigates to application page in stack
    Given user is in implementation page
    When user clicks on application link
    Then user sucessfully navigates to the applicaiton page

  @StackapplicationCodeEditor
  Scenario: user opens the code editor from application page
    Given user is in applicaiton page
    When user clicks on try here button in application page
    Then user successfully navigates to the code editor of application page

  @StackapplicationTryingEmptyEditor
  Scenario: user opens the code editor from applicaiton page to run without entering any code
    Given user is in try here page of applicaiton page
    When user clicks on Run button in Try here page without entering any code in the editor
    Then user does not see any alert message saying code eitor is empty

  @StackapplicationTryingCodeWithError
  Scenario: user opens the code editor from application page to run code with error
    Given user is in try here page of application page
    When user clicks on Run button in Try here page after entering a code with error in the editor
    Then user gets an alert message about the error in code

  @StackapplicationTryingCorrectCode
  Scenario: user opens the code editor from application page to run a correct code
    Given user is in try here page of application page
    When user clicks on Run button in Try here page after entering a correct code in the editor
    Then user is able to see the output in the console

  @StackopenImplementationFromStackPage
  Scenario: user opens the Implementaiton page from the Stack page
    Given user is in stack page
    When user clicks on Implementation button
    Then user sucessfully navigates to the  Implementation page

  @StackopenApplicaitonFromStackPage
  Scenario: user opens the Application page from the Stack page
    Given user is in stack page
    When user clicks on Application button
    Then user sucessfully navigates to the Application page

  @StackopenStackFromDropDown
  Scenario: user opens Stack page from the DataStructures dropdown
    Given user is in the home page of ds algo portal
    When user clicks on Data Structures dropdown and clicks on Stack
    Then user sucessfully navigates to the Stack page

  
