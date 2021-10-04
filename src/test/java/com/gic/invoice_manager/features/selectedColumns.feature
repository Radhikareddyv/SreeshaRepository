Feature:The selected columns should be displayed in the List Invoice page.

  Scenario: User can select the columns from the columns tab, the selected columns should be displayed in the List Invoice page.
    Given I'm on login page "http://3.13.126.58/AMS3.0/auth/login/"
    And I enter Username "admin@gic.com"
    And I enter Password "Admin123"
    When I click on Login
    Then I'll redirect to Invoice manager client page
    And I;ll change client page Invoice manager Home page "http://3.13.126.58/AMS3.0/home"
    When I click on sales
    And I click on List Invoices from the sales drop down
    Then I ill redirect to Invoices page
