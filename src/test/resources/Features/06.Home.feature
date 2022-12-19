Feature: Home

  Scenario: Choose Phone 
    When Navigate to home page 
    And click navbar home 
    And scroll down home page 
    And click menu phones 
    And click card phones 
 		And click button add to cart 
    Then appear popup greeting "product added" in home
    
  
  
 
