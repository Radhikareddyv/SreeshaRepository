package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddinvoiceListinvioces extends CommonFunctions {
    @Given("^I changed client page to home page \"(.*?)\"$")
    public void i_changed_client_page_to_home_page(String Url)  {
        driver.get(Url);
    }

    @Given("^I click on sales$")
    public void i_click_on_sales() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[2]/a")).click();
    }

    @Given("^I click on Add Invoice From drop down$")
    public void i_click_on_Add_Invoice_From_drop_down() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("sales_add")).click();
    }

    @Then("^I will redirect to add sale page$")
    public void i_will_redirect_to_add_sale_page()  {
       WebElement salespageVerification = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h2"));
        Assert.assertTrue(salespageVerification.isDisplayed());
    }

    @Then("^I selected date and time from the calender \"(.*?)\"$")
    public void i_selected_date_and_time_from_the_calender(String dateandtime)  {
        driver.findElement(By.xpath("//input[@id='date']")).sendKeys(dateandtime);
    }

    @Then("^I selected Billing company from the dropdown \"(.*?)\"$")
    public void i_selected_Billing_company_from_the_dropdown(String billingCompany)  {
        driver.findElement(By.xpath("//span[contains(text(),'My Company Name')]")).click();
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(billingCompany);
    }

    @Then("^I enter Reference Number \"(.*?)\"$")
    public void i_enter_Reference_Number(String referenceNumber)  {
        driver.findElement(By.xpath("//input[@id='reference_no']")).sendKeys(referenceNumber);

    }

    @Then("^I select customer from the dropdown \"(.*?)\"$")
    public void i_select_customer_from_the_dropdown(String customer) throws InterruptedException {
       // driver.findElement(By.xpath("//span[contains(text(),'Select Customer')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='chosen-single chosen-default']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(customer);
    }

    @Then("^I enter Due Date \"(.*?)\"$")
    public void i_enter_Due_Date(String dueDate)  {
        driver.findElement(By.xpath("//input[@id='due_date']")).sendKeys(dueDate);

    }

    @Then("^I enter orrder discount \"(.*?)\"$")
    public void i_enter_order_discount(String orderDiscount)  {
        driver.findElement(By.xpath("//input[@id='order_discount']")).sendKeys(orderDiscount);


    }

    @Then("^I select order Tax from the drop down \"(.*?)\"$")
    public void i_select_order_Tax_from_the_drop_down(String tax) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("order_tax_chosen")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(tax);

    }

    @Then("^I select status from the drop down \"(.*?)\"$")
    public void i_select_status_from_the_drop_down(String status)  {
        driver.findElement(By.xpath("//span[contains(text(),'Pending')]")).sendKeys(status);

    }

    @Then("^I select Recurring from the Recurring drop down \"(.*?)\"$")
    public void i_select_Recurring_from_the_Recurring_drop_down(String Recurring)  {
        driver.findElement(By.xpath("//span[contains(text(),'Every month (monthly)')]")).sendKeys(Recurring);

    }

    @Then("^I enter Quantity \"(.*?)\"$")
    public void i_enter_Quantity(String quantity)  {
        driver.findElement(By.xpath("//input[@id='quantity-1']")).sendKeys(quantity);

    }

    @Then("^I enter product description \"(.*?)\"$")
    public void i_enter_product_description(String product)  {
        driver.findElement(By.xpath("//input[@id='product-1']")).sendKeys(product);

    }

    @Then("^I enter Unit Price \"(.*?)\"$")
    public void i_enter_Unit_Price(String unitPrice)  {
        driver.findElement(By.xpath("//input[@id='price-1']")).sendKeys(unitPrice);

    }

    @When("^I click on Add Invoice$")
    public void i_click_on_Add_Invoice()  {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[12]/input[1]")).click();

    }

    @Then("^I will redirected to sales page and I get message \"(.*?)\"$")
    public void i_will_redirected_to_sales_page_and_I_get_message(String expectedResult)  {
        WebElement invioceAddedPageactualResult = driver.findElement(By.xpath("//body/div[3]/div[2]"));
        Assert.assertEquals(expectedResult,invioceAddedPageactualResult);

    }
}
