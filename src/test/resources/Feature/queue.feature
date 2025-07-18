@queue
Feature: Testing all the scenarios in queue module

  Background: The user clicks on the get started button of queue module after signing in to the ds algo portal
    Given user signs into the portal using valid username and password following which navigates to the queue page
    

  @queueImplementation
  Scenario: Verify that the user is able to navigate to Implementation of Queue in Python page
    When user clicks on Implementation of queue in python button of queue module
    Then user successfully navigates to the Implementation of queue in python page

  @queueImplementationCodeEditor
  Scenario: Verify user is able to open Try here page from Implementation of queue in python page
    Given user is in Implementation of queue in python page
    When user clicks on try here button in Implementation of queue in python page
    Then user successfully navigates to code editor of Implementation of queue in python page

  @queueImplementationTryingEmptyEditor
  Scenario: Verify user receives error while clicking on Run button without typing in code(Implementation of queue in python)
    Given user is in try here page of Implementation of queue in python page
    When user clicks on Run button in Try here page without entering any code in the editor queue
    Then user does not see any alert message saying code eitor is empty queue

  @queueImplementationTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(Implementation of queue in python)
    Given user is in try here page of Implementation of queue in python
    When user clicks on Run button in Try here of queue module after entering code with error in the editor
    Then user gets an alert message about the error in code queue

  @queueImplementationTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code (Implementation of queue in python)
    Given user is in try here page of Implementation of queue in python
    When user clicks on Run button in Try here of queue module after entering a correct code in the editor
    Then user is able to see the output in the queue try editor console

  @queueImplementationUsingCollection
  Scenario: Verify if user is able to navigate to Implementation using collections.deque page
    Given user is in implementation of queue in python page
    When user clicks on implementation using collections.deque link
    Then user sucessfully navigates to the implementation using collections.deque page

  @queueImplementationUsingCollectionCodeEditor
  Scenario: Verify user is able to open Try here page from Implementation using collections.deque  page
    Given user is in implementation using collections.deque page
    When user clicks on try here button in implementation using collections.deque page
    Then user successfully navigates to the code editor of implementation using collections.deque page

  @queueImplementationUsingCollectionTryingEmptyEditor
  Scenario: Verify user receives error while clicking on Run button without typing in code(Implementation using collections.deque )
    Given user is in try here page of implementation using collections.deque page
    When user clicks on Run button in Try here page without entering any code in the editor queue
    Then user does not see any alert message saying code eitor is empty queue

  @queueImplementationUsingCollectionTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(Implementation using collections.deque )
    Given user is in try here page of implementation using collections.deque page
    When user clicks on Run button in Try here of queue module after entering code with error in the editor
    Then user gets an alert message about the error in code queue

  @queueImplementationUsingCollectionTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code (Implementation using collections.deque )
    Given user is in try here page of implementation using collections.deque page
    When user clicks on Run button in Try here of queue module after entering a correct code in the editor
    Then user is able to see the output in the queue try editor console

  @queueImplementationUsingArray
  Scenario: Verify if user is able to navigate to Implementation using array page
    Given user is in implementation using collections.deque page
    When user clicks on Implementation using array link
    Then user sucessfully navigates to the Implementation using array page

  @queueImplementationUsingArrayCodeEditor
  Scenario: Verify user is able to open Try here page from Implementation using array  page
    Given user is in Implementation using array page
    When user clicks on try here button in Implementation using array page
    Then user successfully navigates to the code editor of Implementation using array page

  @queueImplementationUsingArrayTryingEmptyEditor
  Scenario: Verify user receives error while clicking on Run button without typing in code(Implementation using array )
    Given user is in try here page of Implementation using array page
    When user clicks on Run button in Try here page without entering any code in the editor queue
    Then user does not see any alert message saying code eitor is empty queue

  @queueImplementationUsingArrayTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(Implementation using array )
    Given user is in try here page of Implementation using array page
    When user clicks on Run button in Try here of queue module after entering code with error in the editor
    Then user gets an alert message about the error in code queue

  @queueImplementationUsingArrayTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code (Implementation using array)
    Given user is in try here page of Implementation using array page
    When user clicks on Run button in Try here of queue module after entering a correct code in the editor
    Then user is able to see the output in the queue try editor console
    
      @queueOperations
  Scenario: Verify if user is able to navigate to Queue operations page
    Given user is in Implementation Using array page
    When user clicks on queue operations link
    Then user sucessfully navigates to the queue operations page

  @queueOperationsCodeEditor
  Scenario: Verify user is able to open Try here page from Queue operations  page
    Given user is in queue operations page
    When user clicks on try here button in queue operations page
    Then user successfully navigates to the code editor of queue operations page

  @queueOperationsTryingEmptyEditor
  Scenario:Verify user receives error while clicking on Run button without typing in code(Queue operations ) 
    Given user is in try here page of queue operations page
    When user clicks on Run button in Try here page without entering any code in the editor queue
    Then user does not see any alert message saying code eitor is empty queue

  @queueOperationsTryingCodeWithError
  Scenario: Verify user receives error while clicking on Run button after typing in a wrong python code(Queue operations )
    Given user is in try here page of queue operations page
    When user clicks on Run button in Try here of queue module after entering code with error in the editor
    Then user gets an alert message about the error in code queue

  @queueOperationsTryingCorrectCode
  Scenario: Verify user is able to see output for a valid python code (Queue operations)
    Given user is in try here page of queue operations page
    When user clicks on Run button in Try here of queue module after entering a correct code in the editor
    Then user is able to see the output in the queue try editor console
    
  @queueopenImplementationUsingCollections.dequeFromqueuePage
  Scenario: Verify that the user is able to navigate to Implementation using collections.deque page from queue page
    Given user is in queue page
    When user clicks on ImplementationUsingCollections.deque button
    Then user sucessfully navigates to the  ImplementationUsingCollections.deque page

  @queueopenImplementationUsingArrayFromQueuePage
  Scenario: Verify that the user is able to navigate to Implementation using array page from queue page
    Given user is in queue page
    When user clicks on  button implementation using array
    Then user sucessfully navigates to the implementation using array page
    
    @queueopenQueueOperationsFromQueuePage
  Scenario: Verify that the user is able to navigate to Queue operations page from queue page
    Given user is in queue page
    When user clicks on queue operations button
    Then user sucessfully navigates to the  queue operations page
    

  @queueOpenPracticeQuestions
  Scenario: Verify that the user is able to navigate to practice questions from Queue operations page
    Given User is in operations in queue page
    When user clicks on the practice questions link in queue module
    Then user sucessfully navigates to practice questions of queue module however the page is empty

  
