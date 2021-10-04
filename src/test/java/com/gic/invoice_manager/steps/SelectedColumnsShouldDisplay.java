package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

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

    }

    @Then("^I;ll change client page Invoice manager Home page \"(.*?)\"$")
    public void i_ll_change_client_page_Invoice_manager_Home_page(String arg1) {

    }

    @When("^I click on sales$")
    public void i_click_on_sales()  {
    }

    @When("^I click on List Invoices from the sales drop down$")
    public void i_click_on_List_Invoices_from_the_sales_drop_down()  {

    }

    @Then("^I ill redirect to Invoices page$")
    public void i_ill_redirect_to_Invoices_page() throws Throwable {

    }

}
