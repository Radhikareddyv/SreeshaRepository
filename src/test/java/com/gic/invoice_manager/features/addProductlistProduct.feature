Feature: AddProduct-ListProduct
@addProductlistProduct
  Scenario: A system admin is able to add products to the system

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    And I click on Login
    And I am redirected to Invoice Manager Home Page
    And I enter new url "http://3.13.126.58/AMS3.0/home"
    And I click on the Products Menu
    And I click on Add product
    And I should be provided with a New product page with following fields Name,Details,Price&Add product button.
    When I enter Name as "KitchenAid"
    And I enter Details - "KitchenAid Artisan 4.8L Blender"
    And I enter Price - "499.00"
    And I click on Add product button
    Then I should be redirected to List Products page
@listProducts
  Scenario:I am able to retrieve products using the listProducts
    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    And I click on Login
    And I am redirected to Invoice Manager Home Page
    And I enter new url "http://3.13.126.58/AMS3.0/home"
    And I click on the Products Menu
    And I click on List product
    And I should be provided with products page.
    When I enter Product Name as "KitchenAid"
    Then I should be provided with the List of Products with search term "Kitchenaid"
  @SpecialCharacters
  Scenario: Verify a system admin is not able to add products with only special characters  to the system
    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    And I click on Login
    And I am redirected to Invoice Manager Home Page
    And I enter new url "http://3.13.126.58/AMS3.0/home"
    And I click on the Products Menu
    And I click on Add product
    And I should be provided with a New product page with following fields Name,Details,Price&Add product button.
    When I enter Name as "%%%%%%"
    And I enter Details - "123"
    And I enter Price - "567"
    And I click on Add product button for special characters
    Then I should get a message "unable to add product"
