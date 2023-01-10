Feature: This is the login feature 
Scenario Outline: This is the login secnerio of a new page
Given the user is on the login page
When user enters "<username>" and "<password>" 
And click the login button
Examples:
|username|password|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin|
