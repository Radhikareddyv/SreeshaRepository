Feature: Update or Delete existing customer

  Background: Add Invoice pre-condition
    Given I'm On Invoice Manager Login Page
    And I enter Invalid Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invoice Manager client Page
@UpdateCustomer
    Scenario: Update existing customer details in the system
      Given I changed client page to home page "http://3.13.126.58/AMS3.0/home"
      And I click on Customers
      And I click on List Customers from the Customers drop down
      And I will redirect to customers list page
      And I go to search for the particular customer "Admin"
      When I click on edit customer in Actions
      Then I will redirect to edit customer page
      And I updated company name to "Asda"
     And I updated email address to "sirihari2205@gmail.com"
     And I click on update customer
     Then I will redirect to customers page and i'll get message that "Customer Successfully Updated"