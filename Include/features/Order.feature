Feature: Feature on the dashboard


  Scenario Outline: Feature on the dashboard
    Given I access to https://alta-shop.vercel.app/
    And I enter the <email> and <password>
    And I click the login button
    When I want to buy a something product
    And I click beli button
    Then I have list of products on my chart

    Examples: 
      | email  					 | password 	 |
      | wahyu@gmail.com  | Password123 |