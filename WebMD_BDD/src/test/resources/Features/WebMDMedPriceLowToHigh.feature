

Feature: WebMD Medicine Price Low to High Feature

This Feature Will Display WebMD Medicine Price from Low To High 

  @tag1
  Scenario: Verifying Medicine Pricing List from Low to High
    
    Given WebMD homepage launched
    When User clicks  FIND LOWEST DRUG PRICES
    And User lands on WebMDRx page
    And User clicks on the search box
    And User Enter DrugName "Advil" 
    And User selects DrugName "Advil (Ibuprofen)" from the dropdown list
    And User lands on lands on Ibuprofen Prices and Copupons page
    And User select Brand, Form, Dosage, and Quantity from the dropdown option
    Then User Should see medicine pricing list form low to high

