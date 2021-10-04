package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SelectedColumnsShouldDisplay extends CommonFunctions {

    @Given("^I'm on login page \"(.*?)\"$")
    public void i_m_on_login_page(String url)  {
        driver.get(url);
    }

    @Given("^I enter Username \"(.*?)\"$")
    public void i_enter_Username(String userName)  {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("inputEmail")).sendKeys(userName);
    }

    @Given("^I enter Password \"(.*?)\"$")
    public void i_enter_Password(String password)  {
        driver.findElement(By.id("inputPassword")).sendKeys(password);
    }

    @When("^I click on Login$")
    public void i_click_on_Login() {
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

    }

    @Then("^I'll redirect to Invoice manager client page$")
    public void i_ll_redirect_to_Invoice_manager_client_page()  {
        WebElement clientPageVerification = driver.findElement(By.xpath("//a[contains(text(),'Invoice Manager')]"));
        Assert.assertTrue(clientPageVerification.isDisplayed());
    }

    @Then("^I;ll change client page Invoice manager Home page \"(.*?)\"$")
    public void i_ll_change_client_page_Invoice_manager_Home_page(String url) {
        driver.get(url);
    }

    @When("^I click on sales$")
    public void i_click_on_sales()  {
        driver.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
    }

    @When("^I click on List Invoices from the sales drop down$")
    public void i_click_on_List_Invoices_from_the_sales_drop_down()  {
        driver.findElement(By.xpath("//a[@id='sales_index']")).click();
    }

    @Then("^I ill redirect to Invoices page$")
    public void i_ill_redirect_to_Invoices_page() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement inviocePageverification = driver.findElement(By.xpath("//body/div[3]/div[2]/h2[1]"));
        Assert.assertTrue(inviocePageverification.isDisplayed());
        driver.manage().window().maximize();

    }

    @Then("^I click on columns$")
    public void i_click_on_columns() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();

    }

    @Then("^I select column from the columns drop down$")
    public void i_select_column_from_the_columns_drop_down() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Created By')]")).click();

    }

    @Then("^I will see whatever options i selected in the columns should display on the page$")
    public void i_will_see_whatever_options_i_selected_in_the_columns_should_display_on_the_page() throws InterruptedException {
        Thread.sleep(5000);
        WebElement createdByoptionVerification = driver.findElement(By.xpath("//thead/tr[1]/th[4]"));
        Assert.assertTrue(createdByoptionVerification.isDisplayed());

    }


}
