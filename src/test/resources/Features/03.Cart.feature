Feature: keranjang


  Scenario: Validate Place Order
    When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "hikmah" as name "Indonesia" as country "Kendari" as city "xxxxx" as card "December" as month "2022" as year
    And click button purchase 
    Then apper popup "Thank you for your purchase!" 

  Scenario: null name 
  	When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "" as name "Indonesia" as country "Kendari" as city "xxxxx" as card "December" as month "2022" as year
    And click button purchase 
    Then apper popup "Please fill out" 
  
  Scenario: null country 
  	When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "hikmah" as name "" as country "Kendari" as city "xxxxx" as card "December" as month "2022" as year
    And click button purchase 
    Then apper popup "Please fill out" 
    
 Scenario: null city
  	When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "hikmah" as name "indonesia" as country "" as city "xxxxx" as card "December" as month "2022" as year
    And click button purchase 
    Then apper popup "Please fill out" 
    
     Scenario: null creditcard
  	When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "hikmah" as name "indonesia" as country "kendari" as city "" as card "December" as month "2022" as year
    And click button purchase 
    Then apper popup "Please fill out" 
    
 Scenario: null month
  	When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "hikmah" as name "indonesia" as country "kendari" as city "xxxxx" as card "" as month "2022" as year
    And click button purchase 
    Then apper popup "Please fill out" 
    
  Scenario: null year
  	When users in navigate home page 
    And click navbar cart
    And click place order
    And fill "hikmah" as name "indonesia" as country "kendari" as city "xxxxx" as card "December" as month "" as year
    And click button purchase 
    Then apper popup "Please fill out" 
  