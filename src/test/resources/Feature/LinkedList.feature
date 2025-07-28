@linkedList
Feature: Testing linked list data structure in DsAlgo Website
  User will be able to navigate to differents pages under linked list data structure

  Background: 
    Given The user is in linked list page after logging in

  @L1
  Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in the Linked list page after Sign in
    When The user clicks Introduction button
    Then The user should be redirected to Introduction page

  @L2
  Scenario: Verify that user is able to navigate to Try Here page for Introduction page
    Given The user is on the Introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L3
  Scenario: Verify that user receives error when click on Run button without entering code for Introduction page
    Given The user is in the tryEditor page in LL Introduction
    When The user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L4
  Scenario: Verify that user receives error for invalid python code for Introduction page
    Given The user is in the tryEditor page in LL Introduction
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL

  @L5
  Scenario: Verify that user is able to see output for valid python code for Introduction page
    Given The user is in the tryEditor page in LL Introduction
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL

  @L6
  Scenario: Verify that user is able to navigate to Creating Linked List page
    Given The user is in the Linked list page after Sign In
    When The user clicks Creating Linked List button
    Then The user should be redirected to Creating Linked List page

  @L7
  Scenario: Verify that user is able to navigate to Try Here page for Creating Linked List page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here button in Creating Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L8
  Scenario: Verify that user receives error when click on Run button without entering code for Creating Linked List page
    Given The user is in the tryEditor page in LL via Creating Linked List page
    When The user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L9
  Scenario: Verify that user receives error for invalid python code for Creating Linked List page
    Given The user is in the tryEditor page in LL via Creating Linked List page
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL

  @L10
  Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page in LL via Creating Linked List page
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL

  @L11
  Scenario: Verify that user is able to navigate to Types Of Linked List page
    Given The user is in the Linked list page after Sign in
    When The user clicks Types Of Linked List button
    Then The user should be redirected to Types Of Linked List page

  @L12
  Scenario: Verify that user is able to navigate to Try Here page for Types Of Linked List page
    Given The user is on the Types Of Linked List page
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L13
  Scenario: Verify that user receives error when click on Run button without entering code for Types Of Linked List page
    Given The user is in the tryEditor page in LL via Types Of Linked List page
    When The user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L14
  Scenario: Verify that user receives error for invalid python code for Types Of Linked List page
    Given The user is in the tryEditor page in LL via Types Of Linked List page
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL

  @L15
  Scenario: Verify that user is able to see output for valid python code for Types Of Linked List page
    Given The user is in the tryEditor page in LL via Types Of Linked List page
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL


  @L16
  Scenario: Verify that user is able to navigate to Implement Linked List in Python page
    Given The user is in the Linked list page after Sign in
    When The user clicks Implement Linked List in Python button
    Then The user should be redirected to Implement Linked List in Python page

  @L17
  Scenario: Verify that user is able to navigate to try Editor page for Implement Linked List in Python page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here button in Implement Linked List in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L18
  Scenario: Verify that user receives error when click on Run button without entering code for Implement Linked List in Python page
    Given The user is in the tryEditor page in LL via Implement Page
    When TThe user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L19
  Scenario: Verify that user receives error for invalid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page in LL via Implement Page
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL

  @L20
  Scenario: Verify that user is able to see output for valid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page in LL via Implement Page
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL

  @L21
  Scenario: Verify that user is able to navigate to Traversal page
    Given The user is in the Linked list page after Sign in
    When The user clicks Traversal button
    Then The user should be redirected to Traversal page

  @L22
  Scenario: Verify that user is able to navigate to try Editor page for Traversal page
    Given The user is on the Traversal page
    When The user clicks Try Here button in Traversal page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L23
  Scenario: Verify that user receives error when click on Run button without entering code for Traversal page
    Given The user is in the tryEditor page in LL via Traversal
    When The user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L24
  Scenario: Verify that user receives error for invalid python code for Traversal page
    Given The user is in the tryEditor page in LL via Traversal
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL

  @L25
  Scenario: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page in LL via Traversal
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL


  @L26
  Scenario: Verify that user is able to navigate to Insertion page
    Given The user is in the Linked list page after Sign in
    When The user clicks Insertion button
    Then The user should be redirected to Insertion page

  @L27
  Scenario: Verify that user is able to navigate to try Editor page for Insertion page
    Given The user is on the Insertion page
    When The user clicks Try Here button in Insertion page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L28
  Scenario: Verify that user receives error when click on Run button without entering code for Insertion page
    Given The user is in the tryEditor page in LL via Insertion
    When The user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L29
  Scenario: Verify that user receives error for invalid python code for Insertion page
    Given The user is in the tryEditor page in LL via Insertion
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL

  @L30
  Scenario: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page in LL via Insertion
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL


  @L31
  Scenario: Verify that user is able to navigate to Deletion page
    Given The user is in the Linked list page after Sign in
    When The user clicks Deletion button
    Then The user should be redirected to Deletion page

  @L32
  Scenario: Verify that user is able to navigate to try Editor page for Deletion page
    Given The user is on the Deletion page
    When The user clicks Try Here button in Deletion page
    Then The user should be redirected to a page having an try Editor with a Run button to test in LL

  @L33
  Scenario: Verify that user receives error when click on Run button without entering code for Deletion page
    Given The user is in the tryEditor page in LL via Deletion
    When The user clicks the Run button without entering the code in the Editor in LL
    Then The user should see an error message in alert window for no code in LL

  @L34
  Scenario: Verify that user receives error for invalid python code for Deletion page
    Given The user is in the tryEditor page in LL via Deletion
    When The user clicks run button after writing invalid code in editor in LL
    Then The user should be able to see an error message in alert window in LL
 
  @L35
  Scenario: Verify that user is able to see output for valid python code for Deletion page
    Given The user is in the tryEditor page in LL via Deletion
    When The user clicks run button after writing valid code in editor in LL
    Then The user should see output in the console in LL

  @L36
  Scenario: Verify that the user is able to navigate to practice questions from Deletion page
    Given The user is in the Deletion page
    When User clicks on practice questions button
    Then The user should be redirected to practice questions page of linked lists