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
    public void i_click_on_the_Products_Menu() {driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
    }

    @Given("^I should get the dropdown$")
    public void i_should_get_the_dropdown() {
        Select dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]/b[1]")));
        dropdown.selectByVisibleText("Add Product");
        dropdown.selectByIndex(1);
    }
    @Given("^I click on Add product$")
    public void i_click_on_Add_product(){
        driver.findElement(By.xpath("products_add")).click();
    }
    @Given("^I should be provided with a New product page with following fields Name,Details,Price&Add product button\\.$")
    public void i_should_be_provided_with_a_New_product_page_with_following_fields_Name_Details_Price_Add_product_button() {
        WebElement newProductPage = driver.findElement(By.xpath("//body/div[3]/div[2]/h2[1]"));
        Assert.assertTrue(newProductPage.isDisplayed());
        WebElement newNameDetailsPrice = driver.findElement(By.xpath("//label[contains(text(),'Name')],//label[contains(text(),'Details')],//label[contains(text(),'Price')]"));
        Assert.assertTrue(newNameDetailsPrice.isDisplayed());
        WebElement newAddProductButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/form[1]/div[4]/div[1]/input[1]"));
        Assert.assertTrue(newAddProductButton.isDisplayed());
    }
    @When("^I enter Name as \"(.*?)\"$")
    public void i_enter_Name_as(String arg1)  {
    }

    @When("^I enter Details - \"(.*?)\"$")
    public void i_enter_Details(String arg1)  {

    }

    @When("^I enter Price - \"(.*?)\"$")
    public void i_enter_Price(String arg1)  {
    }

    @When("^I click on Add product button$")
    public void i_click_on_Add_product_button()  {
    }

    @Then("^I should be provided with below message \"(.*?)\"$")
    public void i_should_be_provided_with_below_message(String arg1) {

    }

}
