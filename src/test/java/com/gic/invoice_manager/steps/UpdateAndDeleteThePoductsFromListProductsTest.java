package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateAndDeleteThePoductsFromListProductsTest<wait> extends CommonFunctions {

    @Given("^i am on home page \"(.*?)\"$")
    public void i_am_on_home_page(String url)  {

        driver.get(url);
        WebElement homePageVerEle = driver.findElement(By.xpath("//*[@id=\"topbar\"]/div/div/a"));
        Assert.assertTrue(homePageVerEle.isDisplayed());

    }

  //name update//

    @When("^i click on products$")
    public void i_click_on_products()
    {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]/b[1]")).click();
        WebElement dropDownVerEle = driver.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]/i[1]"));
        Assert.assertTrue(dropDownVerEle.isDisplayed());
    }

    @When("^i click on list products from dropdown list$")
    public void i_click_on_list_products_from_dropdown_list()
    {
   driver.findElement(By.cssSelector("#products_index")).click();
    }

    @When("^i should be able to be redirected to list products page$")
    public void i_should_be_able_to_be_redirected_to_list_products_page()
    {
   WebElement listProductsVerEle =  driver.findElement(By.xpath("//body/div[3]/div[2]/h2[1]"));
   Assert.assertTrue(listProductsVerEle.isDisplayed());
    }



    @When("^i click on the edit button of first product$")
    public void i_click_on_the_edit_button_of_first_product() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/center[1]/div[1]/a[1]")).click();
    }

    @When("^i update the name of the product to \"(.*?)\"$")
    public void i_update_the_name_of_the_product_to(String name)
    {
        driver.findElement(By.xpath("//input[@id='name']")).clear();
     driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
    }

    @When("^i click on update product where the product should be successfully updated$")
    public void i_click_on_update_product_where_the_product_should_be_successfully_updated()
    {
     driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[4]/div[1]/input[1]")).click();
    }

    @When("^i should click on page number (\\d+) to view the updated name$")
    public void i_should_click_on_page_number_to_view_the_updated_name(int number ) throws InterruptedException {
        Thread.sleep(5000);
      driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
    }

    @Then("^i should be able to view the updated name in the name column$")
    public void i_should_be_able_to_view_the_updated_name_in_the_name_column()
    {
    WebElement updatedSuccessEle = driver.findElement(By.xpath("//body/div[3]/div[2]"));
    Assert.assertTrue(updatedSuccessEle.isDisplayed());
    }


//details update//

    @When("^i update the details of the product to \"(.*?)\"$")
    public void i_update_the_details_of_the_product_to(String details)
    {
     driver.findElement(By.xpath("//textarea[@id='details']")).sendKeys();
    }

    @When("^i should click on page number (\\d+) to view the updated details$")
    public void i_should_click_on_page_number_to_view_the_updated_details(int number)
    {
     driver.findElement(By.xpath("//body/div[3]/div[5]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
     WebElement updateVerEle = driver.findElement(By.xpath("//body/div[3]/div[2]"));
     Assert.assertTrue(updateVerEle.isDisplayed());
    }

    @Then("^i should be able to view the updated details in the details column$")
    public void i_should_be_able_to_view_the_updated_details_in_the_details_column()
    {
    WebElement detailsUpdateVer = driver.findElement(By.xpath("//td[contains(text(),'mobile phone')]"));
    Assert.assertTrue(detailsUpdateVer.isDisplayed());
    }

//price update//

    @When("^i update the price of the product to \"(.*?)\"$")
    public void i_update_the_price_of_the_product_to(String price)
    {
        driver.findElement(By.xpath("//input[@id='price']")).sendKeys();
    }

    @When("^i should click on page number (\\d+) to view the updated price$")
    public void i_should_click_on_page_number_to_view_the_updated_price(int arg1)
    {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
        WebElement SuccessupdateVerEle = driver.findElement(By.xpath("//body/div[3]/div[2]"));
        Assert.assertTrue(SuccessupdateVerEle.isDisplayed());
    }

    @Then("^i should be able to view the updated price in the price column$")
    public void i_should_be_able_to_view_the_updated_price_in_the_price_column()
    {
        WebElement priceUpdateVer = driver.findElement(By.xpath("//td[contains(text(),'200.00')]"));
        Assert.assertTrue(priceUpdateVer.isDisplayed());
    }


//delete product//

    @When("^i click on delete icon of the updated product$")
    public void i_click_on_delete_icon_of_the_updated_product()
    {
        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/center[1]/div[1]/a[2]")).click();
    }
//
    @Then("^i should be able to delete the updated product successfully$")
    public void i_should_be_able_to_delete_the_updated_product_successfully()
    {

    }
//
}


