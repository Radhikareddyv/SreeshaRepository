Feature: Update and delete products from list products feature test

  As a user
  i should be able to update and delete same from list products


  @UpdateAndDeleteProduct1
Scenario:Verify update product by updating name of product  from list products

    Given I'm On Invoice Manager Login Page
    And I enter Username as "admin@gic.com"
    And I enter Password as "Admin123"
    When I click on Login
    Then I redirected to Invioce Manager Home Page
    Given i am on home page "http://3.13.126.58/AMS3.0/home"
    When  i click on products
    And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  And i click on the edit button of first product
  And i update the name of the product to "Apple phone"
  And i click on update product where the product should be successfully updated
  When  i click on products
    And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  And i should click on page number 1 to view the updated name
  Then i should be able to view the updated name in the name column

@UpdateAndDeleteProduct
Scenario: Verify update product by updating details of product from list products
  Given I'm On Invoice Manager Login Page
  And I enter Username as "admin@gic.com"
  And I enter Password as "Admin123"
  When I click on Login
  Then I redirected to Invioce Manager Home Page
  Given i am on home page "http://3.13.126.58/AMS3.0/home"
  When  i click on products
  And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  And i click on the edit button of first product
  And i update the details of the product to "mobile phone"
  And i click on update product where the product should be successfully updated
  When  i click on products
  And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  And i should click on page number 1 to view the updated details
  Then i should be able to view the updated details in the details column

@UpdateAndDeleteProduct
Scenario: Verify update product by updating price of product from list products
  Given I'm On Invoice Manager Login Page
  And I enter Username as "admin@gic.com"
  And I enter Password as "Admin123"
  When I click on Login
  Then I redirected to Invioce Manager Home Page
  Given i am on home page "http://3.13.126.58/AMS3.0/home"
  When  i click on products
  And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  And i click on the edit button of first product
  And i update the price of the product to "200"
  And i click on update product where the product should be successfully updated
  When  i click on products
  And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  And i should click on page number 1 to view the updated price
  Then i should be able to view the updated price in the price column

@UpdateAndDeleteProduct
Scenario: Verify deleting of updated name,details and price of the product from list products
  Given I'm On Invoice Manager Login Page
  And I enter Username as "admin@gic.com"
  And I enter Password as "Admin123"
  When I click on Login
  Then I redirected to Invioce Manager Home Page
  Given i am on home page "http://3.13.126.58/AMS3.0/home"
  When  i click on products
  And i click on list products from dropdown list
  And i should be able to be redirected to list products page
  When i click on delete icon of the updated product
  Then i should be able to delete the updated product successfully


















