Feature: Order feature


  Scenario Outline: As a user i wanna order
    Given I want order something product
    And I go to the link https://alta-shop.vercel.app/
    And I enter my <email> and <password>
    When I click beli button a product
    And I want to set the amount that I will buy
    Then I click bayar button

    Examples: 
      | 		email			  | password 		|
      | wahyu@gmail.com | Password123 |