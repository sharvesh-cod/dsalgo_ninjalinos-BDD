Feature: Tree text editor Module in DsAlgo portal 

	As a registered user exploring sub modules in Tree pages
and I want to interact with tryeditor with multiple inputs 


Background: 
	Given A registered user, logged in DsAlgo portal 
	Given User in the Tree page 
	
Scenario:
user is able to enter valid input in text editor section on the Overview of Tree page 
	When user click on 'Overview of trees' link 
	Then user should navigate to Overview of tree page 
	When user click on tryhere link 
	Then Text editor page should be loaded 
	When User enter the valid python code 
		| print("Hello, Tree!") |
	Then user should see the valid ouput in console 
		|Hello, Tree| 
		
Scenario:
user is able to enter invalid input in text editor section on the Overview of Tree page 
	When user click on 'Overview of trees' link 
	Then user should navigate to Overview of tree page 
	When user click on tryhere link 
	Then Text editor page should be loaded 
	When User enter the valid python code 
		| print("Hello, Tree!") |
	Then user should see the valid ouput in console 
		|Hello, Tree| 
 