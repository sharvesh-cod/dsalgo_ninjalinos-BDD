@queue
Feature: Testing all the scenarios in queue module

  Background: queue module user successfully logs into the ds algo portal after reaching the home page via launch page
    Given queue module user signs into the portal using valid username "ninjalinos@work.com" and password "sdet218920@"

  @queuePage
  Scenario: user opens the queue page
    Given queue module user is in home page of ds algo portal after signing in
    When user clicks on Get started button of queue module
    Then user successfully navigates to the queue page in ds algo portal

  @queueImplementation
  Scenario: user opens the Implementation of queue in python page
    Given user is in queue page of ds algo portal
    When user clicks on Implementation of queue in python button of queue module
    Then user successfully navigates to the Implementation of queue in python page

  @queueImplementationCodeEditor
  Scenario: user opens the code editor from Implementation of queue in pyhton page
    Given user is in Implementation of queue in python page
    When user clicks on try here button in Implementation of queue in python page
    Then user successfully navigates to code editor of Implementation of queue in python page

  @queueImplementationTryingEmptyEditor
  Scenario: user opens the code editor from Implementation of queue in python page to run without entering any code
    Given user is in try here page of Implementation of queue in python page
    When (QI)user clicks on Run button in Try here page without entering any code in the editor
    Then (QI)user does not see any alert message saying code eitor is empty

  @queueImplementationTryingCodeWithError
  Scenario: user opens the code editor from Implementation of queue in python page to run code with error
    Given user is in try here page of Implementation of queue in python
    When (QI)user clicks on Run button in Try here page after entering a code with error in the editor
    Then (QI)user gets an alert message about the error in code

  @queueImplementationTryingCorrectCode
  Scenario: user opens the code editor from Implementation of queue in python page to run a correct code
    Given user is in try here page of Implementation of queue in python
    When (QI)user clicks on Run button in Try here page after entering a correct code in the editor
    Then (QI)user is able to see the output in the console

  @queueImplementationUsingCollection
  Scenario: user navigates to implementation using collections.deque page in stack
    Given user is in implementation of queue in python page
    When user clicks on implementation using collections.deque link
    Then user sucessfully navigates to the implementation using collections.deque page

  @queueImplementationUsingCollectionCodeEditor
  Scenario: user opens the code editor from implementation using collections.deque page
    Given user is in implementation using collections.deque page
    When user clicks on try here button in implementation using collections.deque page
    Then user successfully navigates to the code editor of implementation using collections.deque page

  @queueImplementationUsingCollectionTryingEmptyEditor
  Scenario: user opens the code editor from implementation using collections.deque page to run without entering any code
    Given user is in try here page of implementation using collections.deque page
    When (QC)user clicks on Run button in Try here page without entering any code in the editor
    Then (QC)user does not see any alert message saying code eitor is empty

  @queueImplementationUsingCollectionTryingCodeWithError
  Scenario: user opens the code editor from implementation using collections.deque page to run code with error
    Given user is in try here page of implementation using collections.deque page
    When (QC)user clicks on Run button in Try here page after entering a code with error in the editor
    Then (QC)user gets an alert message about the error in code

  @queueImplementationUsingCollectionTryingCorrectCode
  Scenario: user opens the code editor from implementation using collections.deque page to run a correct code
    Given user is in try here page of implementation using collections.deque page
    When (QC)user clicks on Run button in Try here page after entering a correct code in the editor
    Then (QC)user is able to see the output in the console

  @queueImplementationUsingArray
  Scenario: user navigates to Implementation using array page in stack
    Given user is in implementation using collections.deque page
    When user clicks on Implementation using array link
    Then user sucessfully navigates to the Implementation using array page

  @queueImplementationUsingArrayCodeEditor
  Scenario: user opens the code editor from Implementation using array page
    Given user is in Implementation using array page
    When user clicks on try here button in Implementation using array page
    Then user successfully navigates to the code editor of Implementation using array page

  @queueImplementationUsingArrayTryingEmptyEditor
  Scenario: user opens the code editor from Implementation using array page to run without entering any code
    Given user is in try here page of Implementation using array page
    When (QA)user clicks on Run button in Try here page without entering any code in the editor
    Then (QA)user does not see any alert message saying code eitor is empty

  @queueImplementationUsingArrayTryingCodeWithError
  Scenario: user opens the code editor from Implementation using array page to run code with error
    Given user is in try here page of Implementation using array page
    When (QA)user clicks on Run button in Try here page after entering a code with error in the editor
    Then (QA)user gets an alert message about the error in code

  @queueImplementationUsingArrayTryingCorrectCode
  Scenario: user opens the code editor from Implementation using array page to run a correct code
    Given user is in try here page of Implementation using array page
    When (QA)user clicks on Run button in Try here page after entering a correct code in the editor
    Then (QA)user is able to see the output in the console
    
      @queueOperations
  Scenario: user navigates to queue operations page in stack
    Given user is in Implementation Using array page
    When user clicks on queue operations link
    Then user sucessfully navigates to the queue operations page

  @queueOperationsCodeEditor
  Scenario: user opens the code editor from queue operations page
    Given user is in queue operations page
    When user clicks on try here button in queue operations page
    Then user successfully navigates to the code editor of queue operations page

  @queueOperationsTryingEmptyEditor
  Scenario: user opens the code editor from queue operations page to run without entering any code
    Given user is in try here page of queue operations page
    When (QO)user clicks on Run button in Try here page without entering any code in the editor
    Then (QO)user does not see any alert message saying code eitor is empty

  @queueOperationsTryingCodeWithError
  Scenario: user opens the code editor from queue operations page to run code with error
    Given user is in try here page of queue operations page
    When (QO)user clicks on Run button in Try here page after entering a code with error in the editor
    Then (QO)user gets an alert message about the error in code

  @queueOperationsTryingCorrectCode
  Scenario: user opens the code editor from queue operations page to run a correct code
    Given user is in try here page of queue operations page
    When (QO)user clicks on Run button in Try here page after entering a correct code in the editor
    Then (QO)user is able to see the output in the console

  @queueopenImplementationUsingCollections.dequeFromqueuePage
  Scenario: user opens the ImplementationUsingCollections.deque page from the queue page
    Given user is in queue page
    When user clicks on ImplementationUsingCollections.deque button
    Then user sucessfully navigates to the  ImplementationUsingCollections.deque page

  @queueopenImplementationUsingArrayFromQueuePage
  Scenario: user opens the implementation using array page from the queue page
    Given user is in queue page
    When user clicks on  buttonimplementation using array
    Then user sucessfully navigates to the implementation using array page
    
    @queueopenQueueOperationsFromQueuePage
  Scenario: user opens the queue operations page from the queue page
    Given user is in queue page
    When user clicks on queue operations button
    Then user sucessfully navigates to the  queue operations page
    

  @queueOpenQueueFromDropDown
  Scenario: user opens queue page from the DataStructures dropdown
    Given queue user is in the home page of ds algo portal
    When user clicks on Data Structures dropdown and clicks on queue
    Then user sucessfully navigates to the queue page

  
