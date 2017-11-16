Feature: Search for Agent(s)

Background:
Given I launch statefarm.com application
When I click on Agents button
And enter a zip code
And click on Find an Agent
Then I am provided a list of agents

Scenario Outline: Search a particular Agent under a zip code
Given a list of Agents for a zip code
When I enter "<Firstname>" 
And enter "<Lastname>"
And click on search
Then I am provided the agent details if available

Examples:
|Firstname|Lastname|
|Jim      |Spachman|
|Steve    |Mueller |