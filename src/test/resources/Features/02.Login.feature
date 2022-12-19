Feature: Login 

  Scenario: Valid credential
    When Navigate to dashboard page for login
    And click navbar login 
    And enter "hikmah" as username dan "nurulh" as pasword in login
    And click button login
    Then apper popup greeting "Welcome Hikmah" in login
   
  Scenario: Valid credential with ignore letter case
    When Navigate to dashboard page for login
    And click navbar login
    And enter "HIkmaH" as username dan "nurulh" as pasword in login
    And click button login
    Then appear popup greeting "user does not exist" in login
    
  Scenario: Invalid username login
    When Navigate to dashboard page for login
    And click navbar login
    And enter "hiksasf" as username dan "nurul" as pasword in login
    And click button login
    Then appear popup greeting "user does not exist" in login
   
  Scenario: Invalid password login 
    When Navigate to dashboard page for login
    And click navbar login
    And enter "hikmah" as username dan "nurulg" as pasword in login
    And click button login
    Then appear popup greeting "Wrong password" in login
    
  Scenario: Null username login
   When Navigate to dashboard page for login
    And click navbar login
    And enter "" as username dan "nurulh" as pasword in login
    And click button login
    Then appear popup greeting "Username and password" in login
    
  Scenario: Null password login
    When Navigate to login page for login
    And enter "hikmah" as username dan "" as pasword in login
    And click button login
    Then appear popup greeting "Username and password" in login