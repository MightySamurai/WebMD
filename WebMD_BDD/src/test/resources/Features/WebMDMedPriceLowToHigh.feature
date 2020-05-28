

Feature: WebMD Medicine Price Low to High Feature

This Feature Will Display WebMD Medicine Price from Low To High 

  
  Scenario: Verifying Medicine Pricing List from Low to High
    
    Given WebMDRx page launched
    
   
    
  	When User Enter DrugName "Advil (Ibuprofen)" in the search box 
    And User clicks Find Lowest Prices button
    And User lands on lands on Ibuprofen Prices and Copupons page
    And User clicks on QuantityDrobDown 
    And User select the quantity "90"
    Then User Should see medicine pricing list form low to high for the amounth they've selected

