Feature: Contact 

Scenario: Fill email name and message 
	When Navigate to dashboard page in contact 
	And click navbar contact 
	And enter "hikma8@gmail.com" as email "hikmah" as name dan "hai!" as message
	And click button sendMessage
	Then appear popup greating "Thanks for the message" in contact 
	
Scenario: Fill name and message with null email 
	When Navigate to dashboard page in contact 
	And click navbar contact 
	And enter "" as email "hikmah" as name dan "hai!" as message
	And click button sendMessage
	Then appear popup greating "Please fill out" in contact 

Scenario: Fill email and message with null name
	When Navigate to dashboard page in contact 
	And click navbar contact 
	And enter "hikma8@gmail.com" as email "" as name dan "hai!" as message
	And click button sendMessage
	Then appear popup greating "Please fill out" in contact 
	
Scenario: Fill name and email with null message
	When Navigate to dashboard page in contact 
	And click navbar contact 
	And enter "hikma8@gmail.com" as email "hikmah" as name dan "" as message
	And click button sendMessage
	Then appear popup greating "Please fill out" in contact 
