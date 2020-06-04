Feature: WebMD Medicine Price Low to High Feature
  
  This Feature Will Display WebMD Medicine Price from Low To High



 @Sprint1 @Price
  Scenario: Verifying Medicine Pricing List from Low to High
    Given WebMDRx page launched
    
    When User Enter DrugName "Advil" in the search box
    And User select Advil (Ibuprofen) from dropdown list
    And User select Form "Box" from DropDown
    Then User Should see medicine pricing list form low to high for the amounth they've selected
