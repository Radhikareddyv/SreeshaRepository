Feature: Verify columns dropdown list options from list quotations feature
  As a user i should be able to verify columns dropdown list options from list quotations


  @VerifyColumnsFilterValidationFromListQuotation1
  Scenario: Verify 'ID' of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on ID option
    Then i should be able to view the ID as selected and a separate column called ID should be created with the list of IDs

  @VerifyColumnsFilterValidationFromListQuotation
    Scenario: Verify 'date' of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on date option
    Then i should be able to view the date as selected and a separate column called date should be created with the list of dates of quotations

  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Billing Company' of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Billing Company option
    Then i should be able to view the Billing Company as selected and a separate column called Billing Company should be created with the list of names of billing companies



  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Reference No' of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Reference no option
    Then i should be able to view the Reference no as selected and a separate column called Reference No should be created with the reference numbers of quotations


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Created By' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Created By option
    Then i should be able to view the Created By option as selected and a separate column called Created By should be created with the names of who created quotations


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Customer' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Customer option
    Then i should be able to view the Customer option as selected and a separate column called customer should be created with the names of who created quotations


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Total' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Total option
    Then i should be able to view the Total option as selected and a separate column called total should be created with the total of quotation


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Tax Value' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Tax Value option
    Then i should be able to view the Tax Value option as selected and a separate column called total should be created with the total of quotation


 @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Shipping' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Shipping option
    Then i should be able to view the Shipping option as selected and a separate column called Shipping should be created with the shipping prices


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'discount' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on discount option
    Then i should be able to view the discount option as selected and a separate column called discount should be created with the list of discounts


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Grand Total' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Grand Total option
    Then i should be able to view the Grand Total option as selected and a separate column called Grand Total should be created with the list of Grand totals


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Expiry Date' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Expiry Date option
    Then i should be able to view the Expiry Date option as selected and a separate column called Expiry Date should be created with the list expiry dates of quotations


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Status' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Status option
    Then i should be able to view the Status option as selected and a separate column called status should be created with the list of status of quotations


  @VerifyColumnsFilterValidationFromListQuotation
  Scenario: Verify 'Actions' option of columns dropdown option from list quotations

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on sales
    And i should be able to view the drop down options
    And i click on list quotations option to land on list quotations page
    And i click on columns tab
    And i click on Actions option
    Then i should be able to view the Actions option as selected and a separate column called Actions should be created with the list of Actions of quotations
