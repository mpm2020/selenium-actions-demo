Feature: Login in DemoBlaze

Scenario: Successful login

Given I access the DemoBlaze webpage
When I click on login menu
And I enter username "tester_experto_2026"
And I enter password "123456"
And I click on login button
Then I verify the title