@Ninjalinos 
Feature: Tree Module in DsAlgo portal 

	As a registered user exploring the Tree Module links in DsAlgo app
and want to interact with available links in Tree section

Background: 
#Given A registered user, logged in DsAlgo portal
#And User in the Tree page
	Given The user is in the tree page after logged in 
	
@Tree01 
Scenario: user is able to navigate to Tree page links 

#When User scroll down the page
	When The user clicks overview of tree 
	Then User should be able to see below mentioned links in the Tree page: 
		|Overview of trees|
		|Terminologies|
		|Types of Tree|
		|Tree Traversals|
		|Traversals-Illustration|
		|Binary Trees|
		|Types of Binary|
		|Implementation in Python|
		|Binary Tree Traversals|
		|Applications of Binary trees|
		|Implementation of Binary Trees|
		|Binary Search|
		|Implementation of BST|
		
Scenario: Navigate to 'Overview of trees' 
	When user click on 'Overview of trees' link 
	Then user should navigate to Overview of tree page 
	
	
Scenario: Navigate to 'Terminologies' 
	When user click on 'Terminologies' link 
	Then user should navigate to Terminologies page 
	
Scenario: Navigate to 'Types of Tree' 
	When user click on 'Types of Tree' link 
	Then user should navigate to Types of Tree page 
	
Scenario: Navigate to 'Tree Traversals' 
	When user click on 'Tree Traversals' link 
	Then user should navigate to Tree Traversals page 
	
Scenario: Navigate to 'Traversals-Illustration' 
	When user click on 'Traversals-Illustration' link 
	Then user should navigate to Traversals-Illustration page 
	
Scenario: Navigate to 'Binary Trees' 
	When user click on 'Binary Trees' link 
	Then user should navigate to Binary Trees page 
	
Scenario: Navigate to 'Types of Binary trees' 
	When user click on 'Types of Binary trees' link 
	Then user should navigate to Types of Binary trees page 
	
Scenario: Navigate to 'Implementation in Python' 
	When user click on 'Implementation in Python' link 
	Then user should navigate to Implementation in Python page 
	
Scenario: Navigate to 'Binary Tree Traversals' 
	When user click on 'Binary Tree Traversals' link 
	Then user should navigate to Binary Tree Traversals page 
	
Scenario: Navigate to 'Applications of Binary trees' 
	When user click on 'Applications of Binary trees' link 
	Then user should navigate to Applications of Binary trees page 
	
Scenario: Navigate to 'Implementation of Binary Trees' 
	When user click on 'Implementation of Binary Trees' link 
	Then user should navigate to Implementation of Binary Trees page 
	
Scenario: Navigate to 'Binary Search' 
	When user click on 'Binary Search' link 
	Then user should navigate to Binary Search page 
	
Scenario: Navigate to 'Implementation of BST' 
	When user click on 'Implementation of BST' link 
	Then user should navigate to Implementation of BST page 
	
	
	
	
	
 