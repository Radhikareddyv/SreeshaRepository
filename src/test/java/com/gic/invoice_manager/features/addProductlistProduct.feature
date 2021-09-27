Feature: AddProduct-ListProduct

  Scenario: A system admin is able to add products to the system

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    And I click on Login
    And I am redirected to Invoice Manager Home Page
    And I enter new url "http://3.13.126.58/AMS3.0/home"
    And I click on the Products Menu
    And I should get the dropdown with - List Products & Add product option
    And I click on Add product
    And I should be provided with a New product page with following fields Name,Details,Price&Add product button.
    When I enter Name as "KitchenAid"
    And I enter Details - "KitchenAid Artisan 4.8L Blender"
    And I enter Price - "499.00"
    And I click on Add product button
    Then I should be provided with below message "Product successfully added"


