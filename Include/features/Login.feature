Feature: Login

  Scenario Outline: Login on the website
  	Given I open https://alta-shop.vercel.app/
    And I click Altashop button
    When I entry <email> and <password>
    And I click login button
    Then Im on the dashboard page

    Examples: 
      | email        			 | password    | status  |
      | wahyu123@gmail.com | Password123 | success |
      | 									 | Password123 | success |
      | wahyu2@gmail.com	 | Password1   | success |
      | wahyu2@gmail.com 	 |		 				 | success |
      | wahyu2@gmail.com	 | Password123 | success |
