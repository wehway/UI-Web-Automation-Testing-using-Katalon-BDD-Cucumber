Feature: Register

  Scenario Outline: Register on the website
    Given I access https://alta-shop.vercel.app/
    And I click altashop icon button
    When I input the <name> and <email> and <password>
    And I click register button
    Then I have account

    Examples: 
      | name           | email           	| password    |
      |                | wahyu2@gmail.com | Password123 |
      | Wahyu Purwanto |               	  | Password123 |
      | Wahyu Purwanto | wahyu2@gmail.com |             |
      | Wahyu Purwanto | wahyu2@gmail.com | Password123 |
      | Wahyu Purwanto | way						  | Password123 |
      | Wahyu Purwanto | wahyu3@gmail.com | 1					  |
      | Wahyu Purwanto | wahyu2@gmail.com | Password123 |
