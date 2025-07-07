@linkedList
Feature: Testing linked list data structure in DsAlgo Website
  User will be able to navigate to differents pages under linked list data structure

  Background: 
    Given The user is in linked list page after logging in

  @L1
  Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in the Linked list page after logging in
    When The user clicks Introduction button
    Then The user should be redirected to Introduction page

  @L2
  Scenario: Verify that user is able to navigate to Try Here page for Introduction page
    Given The user is on the Introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L3
  Scenario: Verify that user receives error when click on Run button without entering code for Introduction page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L4
  Scenario: Verify that user receives error for invalid python code for Introduction page
    Given The user is in the tryEditor page
    When The user clicks run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L5
  Scenario: Verify that user is able to see output for valid python code for Introduction page
    Given The user is in the tryEditor page
    When The user clicks run button after writing valid code in editor
    Then The user should able to see output in the console

  @L6
  Scenario: Verify that user is able to navigate to Creating Linked List page
    Given The user is in the Linked list page after Sign in
    When The user clicks Creating Linked List button
    Then The user should be redirected to Creating Linked List page

  @L7
  Scenario: Verify that user is able to navigate to Try Here page for Creating Linked List page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here button in Creating Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L8
  Scenario: Verify that user receives error when click on Run button without entering code for Creating Linked List page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L9
  Scenario: Verify that user receives error for invalid python code for Creating Linked List page
    Given The user is in the tryEditor page
    When The user clicks run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L10
  Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page
    When The user clicks run button after writing valid code in editor
    Then The user should able to see output in the console

  @L11
  Scenario: Verify that user is able to navigate to Types Of Linked List page
    Given The user is in the Linked list page after Sign in
    When The user clicks Types Of Linked List button
    Then The user should be redirected to Types Of Linked List page

  @L12
  Scenario: Verify that user is able to navigate to Try Here page for Types Of Linked List page
    Given The user is on the Types Of Linked List page
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L13
  Scenario: Verify that user receives error when click on Run button without entering code for Types Of Linked List page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L14
  Scenario: Verify that user receives error for invalid python code for Types Of Linked List page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L15
  Scenario: Verify that user is able to see output for valid python code for Types Of Linked List page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @L16
  Scenario: Verify that user is able to navigate to Implement Linked List in Python page
    Given The user is in the Linked list page after Sign in
    When The user clicks Implement Linked List in Python button
    Then The user should be redirected to Implement Linked List in Python page

  @L17
  Scenario: Verify that user is able to navigate to try Editor page for Implement Linked List in Python page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here button in Implement Linked List in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L18
  Scenario: Verify that user receives error when click on Run button without entering code for Implement Linked List in Python page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L19
  Scenario: Verify that user receives error for invalid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L20
  Scenario: Verify that user is able to see output for valid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @L21
  Scenario: Verify that user is able to navigate to Traversal page
    Given The user is in the Linked list page after Sign in
    When The user clicks Traversal button
    Then The user should be redirected to Traversal page

  @L22
  Scenario: Verify that user is able to navigate to try Editor page for Traversal page
    Given The user is on the Traversal page
    When The user clicks Try Here button in Traversal page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L23
  Scenario: Verify that user receives error when click on Run button without entering code for Traversal page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L24
  Scenario: Verify that user receives error for invalid python code for Traversal page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L25
  Scenario: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @L26
  Scenario: Verify that user is able to navigate to Insertion page
    Given The user is in the Linked list page after Sign in
    When The user clicks Insertion button
    Then The user should be redirected to Insertion page

  @L27
  Scenario: Verify that user is able to navigate to try Editor page for Insertion page
    Given The user is on the Insertion page
    When The user clicks Try Here button in Insertion page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L28
  Scenario: Verify that user receives error when click on Run button without entering code for Insertion page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L29
  Scenario: Verify that user receives error for invalid python code for Insertion page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L30
  Scenario: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @L31
  Scenario: Verify that user is able to navigate to Insertion page
    Given The user is in the Linked list page after Sign in
    When The user clicks Deletion button
    Then The user should be redirected to Deletion page

  @L32
  Scenario: Verify that user is able to navigate to try Editor page for Deletion page
    Given The user is on the Deletion page
    When The user clicks Try Here button in Deletion page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @L33
  Scenario: Verify that user receives error when click on Run button without entering code for Deletion page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @L34
  Scenario: Verify that user receives error for invalid python code for Deletion page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @L35
  Scenario: Verify that user is able to see output for valid python code for Deletion page
    Given The user is in the tryEditor page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @L36
  Scenario: Verify that the user is able to navigate to practice questions from Deletion page
    Given The user is in the Deletion page
    When User clicks on practice questions button
    Then The user should be redirected to practice questions page of linked lists
