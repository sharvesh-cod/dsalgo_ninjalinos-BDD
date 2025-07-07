@array
Feature: Testing Array data structure in DsAlgo Website
  User will be able to navigate to differents pages under array data structure

  Background: 
    Given The user is in array page after logging in

  @A1
  Scenario: Verify that user is able to navigate to Array in Python page
    When The user clicks Array in Python
    Then The user should be navigated to Array in Python page

  @A2
  Scenario: Verify that user is able to navigate to Try here page for Arrays in Python page
    Given The user is on the Arrays in Python page
    When The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @A3
  Scenario: Verify that user receives error when click on Run button without entering code for Arrays in Python page
    Given The user is in the Try here page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @A4
  Scenario: Verify that user receives error for invalid python code for Arrays in Python page
    Given The user is in the Try here page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A5
  Scenario: Verify that user is able to see output for valid python code for Arrays in Python page
    Given The user is in the Try here page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @A6
  Scenario: Verify that user is able to navigate to Array Using List page
    Given The user is in the Array page after sign in
    When The user clicks Array Using List
    Then The user should be navigated to Array using List page

  @A7
  Scenario: Verify that user is able to navigate to Try here page for Arrays Using List page
    Given The user is on the Arrays Using List page
    When The user clicks Try Here button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @A8
  Scenario: Verify that user receives error when click on Run button without entering code for Arrays Using List page
    Given The user is in the Try here page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @A9
  Scenario: Verify that user receives error for invalid python code for Arrays using List page
    Given The user is in the Try here page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A10
  Scenario: Verify that user is able to see output for valid python code for Arrays using List page
    Given The user is in the Try here page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @A11
  Scenario: Verify that user is able to navigate to Basic Operations in Lists page
    Given The user is in the Array page after sign in
    When The user clicks Basic Operations in Lists
    Then The user should be navigated to Basic Operations in Lists page

  @A12
  Scenario: Verify that user is able to navigate to Try here page for Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists page
    When The user clicks Try Here button in Basic Operations in Lists page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @A13
  Scenario: Verify that user receives error when click on Run button without entering code for Basic Operations in Lists page
    Given The user is in the Try here page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @A14
  Scenario: Verify that user receives error for invalid python code for Basic Operations in Lists page
    Given The user is in the Try here page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A15
  Scenario: Verify that user is able to see output for valid python code for Basic Operations in Lists page
    Given The user is in the Try here page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @A16
  Scenario: Verify that user is able to navigate to Applications Of Array page
    Given The user is in the Array page after sign in
    When The user clicks Applications of Array
    Then The user should be navigated to Applications of Array page

  @A17
  Scenario: Verify that user is able to navigate to Try here page for Applications of Array page
    Given The user is on the Applications of Array page
    When The user clicks Try Here button in Applications of Array page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @A18
  Scenario: Verify that user receives error when click on Run button without entering code for Applications of Array page
    Given The user is in the Try here page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @A19
  Scenario: Verify that user receives error for invalid python code for Applications of Array page
    Given The user is in the Try here page
    When The user clicks Run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A20
  Scenario: Verify that user is able to see output for valid python code for Applications of Array page
    Given The user is in the Try here page
    When The user clicks Run button after writing valid code in editor
    Then The user should able to see output in the console

  @A21
  Scenario: Verify that user is able to navigate to Practice Questions Page from Arrays in Python page
    Given The user is in the Arrays in Python page after Sign in
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page

  @A22
  Scenario: Verify that user is able to navigate to Search the array Page from Practice question page of Arrays in Python page
    Given The user is on the practice question page from arrays in python
    When The user clicks the Search the array link
    Then The user should be redirected to Question page contains a question, try Editor with Run and Submit buttons

  @A23
  Scenario: Verify that user receives error for writing  nothing and running Search the array question
    Given The user is on the practice question editor
    When The user clicks run button without writing anything in editor
    Then The user should be able to see an error message in alert window

  @A24
  Scenario: Verify that user receives error for writing  nothing and submitting Search the array question
    Given The user is on the practice question editor
    When The user clicks submit button without writing anything in editor
    Then The user see an error message Error occurred during submission

  @A25
  Scenario: Verify that user receives error for invalid python code on running Search the array question
    Given The user is on the practice question editor
    When The user clicks run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A26
  Scenario: Verify that user is able to run valid python code for Search the array question
    Given The user is on the practice question editor
    When The user clicks run button after writing valid code in editor
    Then The user should able to see output in the console

  @A27
  Scenario: Verify that user receives error on submitting invalid python code for Search the array question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing invalid code in editor
    Then The user see an error message Error occurred during submission

  @A28
  Scenario: Verify that user receives no error on submitting valid python code for Search the array question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing valid code in editor
    Then The user see success message Submission successful

  @A29
  Scenario: Verify that user is able to navigate to Max Consecutive ones Page from Practice question page of Arrays in Python page
    Given The user is on the practice question page from arrays in python
    When The user clicks the Max Consecutive ones link
    Then The user should be redirected to Question page contains a question, try Editor with Run and Submit buttons

  @A30
  Scenario: Verify that user receives error for writing  nothing and running Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks run button without writing anything in editor
    Then The user should be able to see an error message in alert window

  @A31
  Scenario: Verify that user receives error for writing  nothing and submitting Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks submit button without writing anything in editor
    Then The user see an error message Error occurred during submission

  @A32
  Scenario: Verify that user receives error for invalid python code on running Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A33
  Scenario: Verify that user is able to run valid python code for Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks run button after writing valid code in editor
    Then The user should able to see output in the console

  @A34
  Scenario: Verify that user receives error on submitting invalid python code for Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing invalid code in editor
    Then The user see an error message Error occurred during submission

  @A35
  Scenario: Verify that user receives no error on submitting valid python code for Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing valid code in editor
    Then The user see success message Submission successful

  @A36
  Scenario: Verify that user is able to navigate to Find Numbers with even number of digits Page from Practice question page of "Arrays in Python" page
    Given The user is on the practice question page from arrays in python
    When The user clicks the Find Numbers with even number of digits link
    Then The user should be redirected to Question page contains a question, try Editor with Run and Submit buttons

  @A37
  Scenario: Verify that user receives error for writing  nothing and running Find Numbers with even number of digits question
    Given The user is on the practice question editor
    When The user clicks run button without writing anything in editor
    Then The user should be able to see an error message in alert window

  @A38
  Scenario: Verify that user receives error for writing  nothing and submitting Find Numbers with even number of digits question
    Given The user is on the practice question editor
    When The user clicks submit button without writing anything in editor
    Then The user see an error message Error occurred during submission

  @A39
  Scenario: Verify that user receives error for invalid python code on running Find Numbers with even number of digits question
    Given The user is on the practice question editor
    When The user clicks run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A40
  Scenario: Verify that user is able to run valid python code for Find Numbers with even number of digits question
    Given The user is on the practice question editor
    When The user clicks run button after writing valid code in editor
    Then The user should able to see output in the console

  @A41
  Scenario: Verify that user receives error on submitting invalid python code for Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing invalid code in editor
    Then The user see an error message Error occurred during submission

  @A42
  Scenario: Verify that user receives no error on submitting valid python code for Max Consecutive ones question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing valid code in editor
    Then The user see success message Submission successful

  @A43
  Scenario: Verify that user is able to navigate to Squares Of a Sorted Array Page from Practice question page of Arrays in Python page
    Given The user is on the practice question page from arrays in python
    When The user clicks the Squares Of a Sorted Array link
    Then The user should be redirected to Question page contains a question, try Editor with Run and Submit buttons

  @A44
  Scenario: Verify that user receives error for writing  nothing and running Squares Of a Sorted Array question
    Given The user is on the practice question editor
    When The user clicks run button without writing anything in editor
    Then The user should be able to see an error message in alert window

  @A45
  Scenario: Verify that user receives error for writing  nothing and submitting Squares Of a Sorted Array question
    Given The user is on the practice question editor
    When The user clicks submit button without writing anything in editor
    Then The user see an error message Error occurred during submission

  @A46
  Scenario: Verify that user receives error for invalid python code on running Squares Of a Sorted Array question
    Given The user is on the practice question editor
    When The user clicks run button after writing invalid code in editor
    Then The user should able to see an error message in alert window

  @A47
  Scenario: Verify that user is able to run valid python code for Squares Of a Sorted Array question
    Given The user is on the practice question editor
    When The user clicks run button after writing valid code in editor
    Then The user should able to see output in the console

  @A48
  Scenario: Verify that user receives error on submitting invalid python code for Squares Of a Sorted Array question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing invalid code in editor
    Then The user see an error message Error occurred during submission

  @A49
  Scenario: Verify that user receives no error on submitting valid python code for Squares Of a Sorted Array question
    Given The user is on the practice question editor
    When The user clicks Submit button after writing valid code in editor
    Then The user see success message Submission successful
