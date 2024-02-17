Feature: Automation
Scenario: User Buy the Some dress
Given User Launch the Url
When User click the Sign up button
Then Next Page Shwon

Scenario: User Login the Page
When User enter the Email id
And User enter the password
And User click the login  button
Then Next Page2 Shown

Scenario: 
When User the Women dress
And User Click the Add to CArt button
And user click The Continure
And User click View to Cart button
When Next Page3 Shwon

Scenario: 
When User click the Proceed To Checkout
Then Next Page4 Shown

Scenario:
When User enter Command
And User click the order button
Then Next page5 shown

Scenario: payment Details
When User fill ent details
|Nandha|0987345698762389|7890|11|2023|
And User confirm Button
