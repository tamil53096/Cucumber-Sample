Feature: Perform a simple search in Google
Scenario: Open Google Website and search
Given user is entering Google.com
When types the search term as "cattle farming" 
And enters the return key
Then the user should see the search results for cattle farming

 
