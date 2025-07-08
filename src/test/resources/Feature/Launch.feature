@Launch
Feature: Opening DsAlgo Home page

@URL
Scenario: verify that user is able to open the dsalgo portal
Given the user is on Browser
When  the user enters the valid DsAlgo portal Url
Then  The user should be able to land on DsAlgo portal 

@Getstarted
Scenario: click on get started button after checking the user is at right page by verifying the message  you are at right place.
Given the user is on DsAlgo portal
When  the user clicks Get started button after verifying the message you are at right place
Then  the user lands on Home page