Feature: Login and logout functuionality of OrangeHRM

Scenario: Verfiy login functionality

	Given the browser is launched and the url is opened
	When we enter the username and password
	And click on the login button
	Then welcome admin msg should be displayed