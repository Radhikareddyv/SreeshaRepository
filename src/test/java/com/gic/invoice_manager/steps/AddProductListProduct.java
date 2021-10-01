package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddProductListProduct extends CommonFunctions {
    @Given("^I am redirected to Invoice Manager Home Page$")
    public void i_am_redirected_to_Invoice_Manager_Home_Page()
    { WebElement loginSuccessfulElement = driver.findElement(By.xpath("//p[contains(text(),'Logged In Successfully')]"));
        Assert.assertTrue(loginSuccessfulElement.isDisplayed());}

    @Given("^I enter new url \"(.*?)\"$")
    public void i_enter_new_url(String url)

    {driver.get(url);}

    @Given("^I click on the Products Menu$")
    public void i_click_on_the_Products_Menu()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[3]/a")).click();
    }
    @Given("^I click on Add product$")
    public void i_click_on_Add_product()throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='products_add']")).click();
    }
    @Given("^I should be provided with a New product page with following fields Name,Details,Price&Add product button\\.$")
    public void i_should_be_provided_with_a_New_product_page_with_following_fields_Name_Details_Price_Add_product_button()throws InterruptedException {
        Thread.sleep(10000);
        WebElement newProductPage = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h2"));
        Assert.assertTrue(newProductPage.isDisplayed());
        WebElement name = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/form/div[1]/label"));
        Assert.assertTrue(name.isDisplayed());
        WebElement details = driver.findElement(By.xpath("//label[contains(text(),'Details')]"));
        Assert.assertTrue(details.isDisplayed());
        WebElement price = driver.findElement(By.xpath("//label[contains(text(),'Price')]"));
        Assert.assertTrue(price.isDisplayed());
        WebElement addProductButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/form[1]/div[4]/div[1]/input[1]"));
        Assert.assertTrue(addProductButton.isDisplayed());
    }
    @When("^I enter Name as \"(.*?)\"$")
    public void i_enter_Name_as(String name)  {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
    }
    @When("^I enter Details - \"(.*?)\"$")
    public void i_enter_Details(String details)  {
        driver.findElement(By.xpath("//textarea[@id='details']")).sendKeys(details);
    }
    @When("^I enter Price - \"(.*?)\"$")
    public void i_enter_Price(String price)
    {driver.findElement(By.xpath("//input[@id='price']")).sendKeys(price);
    }
    @When("^I click on Add product button$")
    public void i_click_on_Add_product_button()
    {driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[4]/div[1]/input[1]")).click();
    }
    @Then("^I should be redirected to List Products page$")
    public void i_should_be_redirected_to_List_Products_page(){
        WebElement productsuccessfullyadded = driver.findElement(By.xpath("//body/div[3]/div[2]"));
        Assert.assertTrue(productsuccessfullyadded.isDisplayed());
    }
    @Given("^I click on List product$")
    public void i_click_on_List_product() throws Throwable {
        driver.findElement(By.xpath("//a[@id='products_index']")).click();
    }
    @Given("^I should be provided with products page\\.$")
    public void i_should_be_provided_with_products_page() throws Throwable {
        WebElement products = driver.findElement(By.xpath("//body/div[3]/div[2]/h2[1]"));
        Assert.assertTrue(products.isDisplayed());
    }
    @When("^I enter Product Name as \"(.*?)\"$")
    public void i_enter_Product_Name_as(String productName) throws Throwable {
        driver.findElement(By.xpath("//input[@id='search_table']")).sendKeys(productName);
    }
    @Then("^I should be provided with the List of Products with search term \"(.*?)\"$")
    public void i_should_be_provided_with_the_List_of_Products_with_search_term(String searchTerm) throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"fileData\"]"));
    }
    @When("^I click on Add product button for special characters$")
    public void i_click_on_Add_product_button_for_special_characters() throws Throwable {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[4]/div[1]/input[1]")).click();
    }
    @Then("^I should get a message \"(.*?)\"$")
    public void i_should_get_a_message(String unableToAddMessage) throws Throwable {
        WebElement unableToAddProduct = driver.findElement(By.xpath("//body/div[3]/div[2]"));
        Assert.assertTrue(unableToAddProduct.isDisplayed());

    }
}
