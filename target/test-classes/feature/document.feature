Feature: Examples of BDD
  @login @amazon
  Scenario: Amazon userid Test
    Given i open browser "chrome"
    And i open url "http://www.amazon.in"
    When i click on signin
    And i enter userid "paragguide@yahoo.co.in"
    And click submit
    Then password textbox must come
  @login @amazon  
  Scenario: Amazon password Test  
    Given userid is valid
    When i enter password "RMInfotech"
    Then Login should fail
    
   @search 
   Scenario Outline: 
    	Given I went to <url>
    	When I search the <keyword>
    	Then result must come

    Examples: 
    	| url  | keyword | 
    	| http://www.google.com | pizza | 
    	| http://www.google.com | burger |
   
   @login @nopcommerce
    	Scenario: Successful login with valid credentials
        Given User launch Chrome Driver
        When User opens URL "http://admin-demo.nopcommerce.com/login"
        And User enters Email as "admin@yourstore.com" and password as "admin"
        And click on login
        Then page title should be "Dashboard / nopcommerce administration"
        When user click on logout link
        Then page title should be "Your Store. Login"
        And close browser 
    	 
    
