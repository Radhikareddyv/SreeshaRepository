Feature: Add invioce/ List invioces

  Background: Add Invoice pre-condition
    Given I'm On Invoice Manager Login Page
    And I enter Invalid Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invoice Manager client Page


  @Addinvioce
  Scenario: User to create invoices to required the customer.
    Given I changed client page to home page "http://3.13.126.58/AMS3.0/home"
    And I click on sales
    And I click on Add Invoice From drop down
    Then I will redirect to add sale page
    And I selected date and time from the calender "27.09.2021 23:30"
    And I selected Billing company from the dropdown "Barclay"
    And I enter Reference Number "23456789"
    And I select customer from the dropdown "Testing(Invoice_Role)"
    And I enter Due Date "27.09.2021"
    And I enter orrder discount "10%"
    And I select order Tax from the drop down "VAT"
    And I select status from the drop down "Pending"
    And I select Recurring from the Recurring drop down "Every month"
    And I enter Quantity "1"
    And I enter product description "Erp Training"
    And I eneter Unit Price "1500"
    When  I click on Add Invioce
    Then I will redirected to sales page and I get message "Invioce aded successfully"

