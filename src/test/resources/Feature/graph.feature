@NinjalinosGraph 
Feature: Tree Module in DsAlgo portal 

	As a registered user,
  I want to navigate and interact with Graph module pages and editors,
  So that I can explore and practice tree-related concepts.

Background: 
	Given the user is in Graph page after logged in 
	
@G01 
Scenario: Verify navigation links in Graph module 
	When The user clicks overview of Graph 
	Then The user should see the following links: 
		|Graph|
		|Graph Representation|
@G02
Scenario: Navigate to Graph 
	When user click on Graph link 
	Then user should navigate to Graph page 
@G03	
Scenario: Navigate to text editor on Graph section 
	When user click on try here link 
	Then user should navigate to text editor page 
@G04
Scenario: Alert message when clicking run button without code in text editor
  Given The user in tryEditor page  
	When user click on run button 
	Then user should be able to see alert message to enter the valid code
@G05	
Scenario: After entering valid input, output should be printed in console
  Given The user in tryEditor page  
	When user click button after entering the valid python code on the text editor 
	Then user should be able to see ouput in the console
@G06
Scenario: After entering invalid input, user should see the alert message
  Given The user in tryEditor page
	When user click button after entering the invalid python code on the text editor 
	Then user should be able to see alert message
@G07
Scenario: Navigate to Graph Representation 
	When user click on Graph Representation link 
	Then user should navigate to Graph Representation page 
@G08	
Scenario: Navigate to text editor on Graph Representation section 
	When user click on try here link 
	Then user should navigate to text editor page 
@G09
Scenario: Alert message when clicking run button without code in text editor
  Given The user in tryEditor page  
	When user click on run button 
	Then user should be able to see alert message to enter the valid code
@G10	
Scenario: After entering valid input, output should be printed in console
  Given The user in tryEditor page  
	When user click button after entering the valid python code on the text editor 
	Then user should be able to see ouput in the console
@G11
Scenario: After entering invalid input, user should see the alert message
  Given The user in tryEditor page
	When user click button after entering the invalid python code on the text editor 
	Then user should be able to see alert message
@G12
Scenario: Navigate to Practice Questions page
  When The user clicks Practice Questions link
  Then The user should be navigated to the Practice Questions page
@G13
Scenario: View Practice Questions
   When The user clicks Practice Questions link
   Then The user should see the practice questions  
  	


