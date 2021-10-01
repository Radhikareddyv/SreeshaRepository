Feature: AddQuotation-ListQuotation
  @addQuotationlistQuotation
  Scenario: A system admin is able to create quotation in Add Quotation

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    And I click on Login
    And I am redirected to Invoice Manager Home Page
    And I enter new url "http://3.13.126.58/AMS3.0/home"
    And I click on the Sales Menu
    And I click on Add Quotation
    And I should be provided with a Add New Quotation page.
    And I see these field Date,Billing company,Reference No,Customer,Expiry Date,Shipping,Order Discount,Order Tax,Status,No,Quantity,Product Description,Unit Price,Subtotal,Total,Add Quotation.
    And I Enter Billing company "Zensar"
    And I click on the referance number generating button
    And I enter customer "Zara (Zia)"
    And I select the expiry date from calender "22.09.2021"
    And I enter Shipping "By AIR"
    And I enter Discount "10%"
    And I enter order Tax from dropdown "Vat"
    And I click on status "ordered"
    And I enter quantity "1"
    And I eneter Product description "KitchenAid"
    And click on kitchenAid
    And I enter notes "Priority Delivery"
    When I click on add quotation
    Then I should be taken to list quotation and provide ,message "Quotation successfully added"