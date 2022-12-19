Feature: Sign Up 

  Scenario: Validate Username and password betwen 8 to 16 character, must contain special character, at least one uppecase character and have a numerical
    When Navigate to dashboard page 
    And click navbar signup 
    And enter "hikmahsalamyyyyy" as username dan "@Hikmah00" as pasword
    And click button signup
    Then appear popup greating "Sign up successful."
   
  
  Scenario: Validate username and password less than 8 character, contain special character, at least one uppercase character and have a numerical 
  	When Navigate to dashboard page 
  	And click navbar signup 
  	And enter "rini" as username dan "Fg@0" as pasword
  	And click button signup
  	Then appear popup greating "Sign up Failed"
  	
  Scenario: Validate username and password more than 16 character, contain special character, at least one uppercase character and have a numerical
  	When Navigate to dashboard page
  	And click navbar signup 
  	And enter "hikm" as username dan "@ghskfsdfsrtH09" as pasword
  	And click button signup
  	Then appear popup greating "Sign Up Failed" 
  	
  Scenario: Validate username and password betwen 8 to 16 character, without contain special character, have a at least one uppercase character and have a numerical
  	When Navigate to dashboard page 
  	And click navbar signup 
  	And enter "dev" as username dan "Hikmah00" as pasword
  	And click button signup
  	Then appear popup greating "Sign Up Failed"
  
  Scenario: Validate username and password betwen 8 to 16 character, contain special character, without uppercase character and have a numerical 
  	When Navigate to dashboard page 
  	And click navbar signup
  	And enter "hi" as username dan "@hikmah00" as pasword
  	And click button signup
  	Then appear popup greating "Sign Up Failed"
  	
  Scenario: Validate username and password betwen 8 to 16 character, contain special character, have atleast one uppercase character and without a numerical 
  	When Navigate to dashboard page
  	And click navbar signup
  	And enter "ho" as username dan "@hiiikmah" as pasword
  	And click button signup
  	Then appear popup greating "Sign Up Failed"
  	
  Scenario: Duplicate username  
  	When Navigate to dashboard page 
    And click navbar signup 
    And enter "nurul" as username dan "sdas" as pasword
    And click button signup
    Then appear popup greating "this user already exist."
    
  Scenario: Null username 
  	When Navigate to dashboard page
  	And click navbar signup
  	And enter "" as username dan "@Hikmah00" as pasword
  	And click button signup
  	Then appear popup greating "Please fill out" 
  
  Scenario: Null password
  	When Navigate dashboard page 
  	And click navbar signup
  	And enter "hikmah" as username dan "" as pasword
  	And click button signup 
  	Then appear popup greating "Please fill out" 
  	
  
  	
   