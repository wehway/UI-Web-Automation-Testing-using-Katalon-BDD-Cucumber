
Feature: Logout

  Scenario Outline: Validate logout button
    Given I enter the link https://alta-shop.vercel.app/
    When I input my <email> and my <password>
    And I tap the login button
    And I want to change account
    Then I success logout

    Examples: 
      | 		email			  | password 		|
      | wahyu@gmail.com | Password123 |