Feature: Application  Login

Scenario: Home page deafualt login
Given User is on Netbanking landing page
When User login into application with "kavitha" and password "password123"
Then error message displayed is "true"
And cards displayed like "Invalid email or password."

Scenario: Home page deafualt login
Given User is on Netbanking landing page
When User login into application with "Savitha" and password "158632"
Then error message displayed is "true"
