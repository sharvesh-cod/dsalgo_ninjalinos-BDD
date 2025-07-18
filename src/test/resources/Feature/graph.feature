@NinjalinosGraph
Feature: Tree Module in DsAlgo portal 

	As a registered user,
  I want to navigate and interact with Graph module pages and editors,
  So that I can explore and practice tree-related concepts.

Background: 
	Given the user is in Graph page after logged in 
	
@G02
Scenario: Verify that the user is able to navigate to Graph page 
	When user clicks on Graph link on graph module 
	Then user should navigate to Graph page 
@G03	
Scenario: Verify user is able to navigate to text editor on Graph section 
	When user click on try here link on graph module 
	Then user should navigate to text editor page of graph
@G04
Scenario: Run without code on Graph text editor
  Given The user in tryEditor page of graph section
	When  user click on run button without code
	Then user should be able to see alert message to enter the valid code
@G05	
Scenario: Verify if running with valid input, output should be printed in console
  Given The user in tryEditor page of graph section  
	When user click button after entering the valid python code on the text editor 
	Then user should be able to see ouput in the console
@G06
Scenario: After entering invalid input, user should see the alert message
  Given The user in tryEditor page of graph section
	When user click button after entering the invalid python code on the text editor 
	Then user should be able to see alert message
@G07
Scenario: Navigate to Graph Representation 
	When user click on Graph Representation link 
	Then user should navigate to Graph Representation page 
@G08	
Scenario: Verify user is able to navigate to text editor on Graph Representation section 
	When user click on try here link on Graph Representation section
	Then user should navigate to text editor page 
@G09
Scenario: Run without code on Graph Representation text editor
	Given The user in tryEditor page of graph representation section
	When The user click run button without entering code
	Then user should be able to see alert message to enter the valid code
@G10	
Scenario: After entering valid input, output should be printed in console
  Given The user in tryEditor page of graph representation section  
	When user click button after entering the valid python code on the text editor 
	Then user should be able to see ouput in the console
@G11
Scenario: After entering invalid input, user should see the alert message
  Given The user in tryEditor page of graph representation section
	When user click button after entering the invalid python code on the text editor 
	Then user should be able to see alert message
	
@G12
  Scenario: Verify that the user is able to navigate to practice questions from Graph module
   Given user is in Graph sections page 
    When user clicks on the practice questions link in Graph module
    Then user sucessfully navigates to practice questions of Graph module
    And  user find blank page
  	


