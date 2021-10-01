package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddQuotationListQuotation extends CommonFunctions {

    @Given("^I click on the Sales Menu$")
    public void i_click_on_the_Sales_Menu() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
    }
    @Given("^I click on Add Quotation$")
    public void i_click_on_Add_Quotation() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='sales_add_quote']")).click();
    }
    @Given("^I should be provided with a Add New Quotation page\\.$")
    public void i_should_be_provided_with_a_Add_New_Quotation_page() throws InterruptedException {
        Thread.sleep(5000);
        WebElement newQuotationPage = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/h2[1]"));
        Assert.assertTrue(newQuotationPage.isDisplayed());
    }
    @Given("^I see these field Date,Billing company,Reference No,Customer,Expiry Date,Shipping,Order Discount,Order Tax,Status,No,Quantity,Product Description,Unit Price,Subtotal,Total,Add Quotation\\.$")
    public void i_see_these_field_Date_Billing_company_Reference_No_Customer_Expiry_Date_Shipping_Order_Discount_Order_Tax_Status_No_Quantity_Product_Description_Unit_Price_Subtotal_Total_Add_Quotation() throws InterruptedException {
        Thread.sleep(10000);
        WebElement date = driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]"));
        Assert.assertTrue(date.isDisplayed());

        WebElement billingCompany = driver.findElement(By.xpath("//label[contains(text(),'Billing Company')]"));
        Assert.assertTrue(billingCompany.isDisplayed());

        WebElement referenceNo = driver.findElement(By.xpath("//label[contains(text(),'Reference No')]"));
        Assert.assertTrue(referenceNo.isDisplayed());

        WebElement customer = driver.findElement(By.xpath("//label[contains(text(),'Customer')]"));
        Assert.assertTrue(customer.isDisplayed());

        WebElement expiryDate = driver.findElement(By.xpath("//label[contains(text(),'Expiry Date')]"));
        Assert.assertTrue(expiryDate.isDisplayed());

        WebElement shipping = driver.findElement(By.xpath("//label[contains(text(),'Shipping')]"));
        Assert.assertTrue(shipping.isDisplayed());

        WebElement orderDiscount = driver.findElement(By.xpath("//label[contains(text(),'Order Discount')]"));
        Assert.assertTrue(orderDiscount.isDisplayed());

        WebElement orderTax = driver.findElement(By.xpath("//label[contains(text(),'Order Tax')]"));
        Assert.assertTrue(orderTax.isDisplayed());

        WebElement status = driver.findElement(By.xpath("//label[contains(text(),'Status')]"));
        Assert.assertTrue(status.isDisplayed());

        WebElement no = driver.findElement(By.xpath("//th[contains(text(),'No')]"));
        Assert.assertTrue(no.isDisplayed());

        WebElement quantity = driver.findElement(By.xpath("//th[contains(text(),'Quantity')]"));
        Assert.assertTrue(quantity.isDisplayed());

        WebElement productDescriptions = driver.findElement(By.xpath("//th[contains(text(),'Product Descriptions')]"));
        Assert.assertTrue(productDescriptions.isDisplayed());

        WebElement unitPrice = driver.findElement(By.xpath("//th[contains(text(),'Unit Price')]"));
        Assert.assertTrue(unitPrice.isDisplayed());

        WebElement subtotal = driver.findElement(By.xpath("//th[contains(text(),'Subtotal')]"));
        Assert.assertTrue(subtotal.isDisplayed());

        WebElement addQuotation = driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[11]/input[1]"));
        Assert.assertTrue(addQuotation.isDisplayed());
    }
    @Given("^I Enter Billing company \"(.*?)\"$")
    public void i_Enter_Billing_company(String billingCompany) throws Throwable {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(billingCompany);
    }
    @Given("^I click on the referance number generating button$")
    public void i_click_on_the_referance_number_generating_button() throws Throwable {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/span[1]/i[1]")).click();
    }
    @Given("^I enter customer \"(.*?)\"$")
    public void i_enter_customer(String customer) throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Select Customer')]")).sendKeys(customer);
    }
    @Given("^I select the expiry date from calender \"(.*?)\"$")
    public void i_select_the_expiry_date_from_calender(String date) throws Throwable {
        driver.findElement(By.xpath("//input[@id='expiry_date']")).sendKeys(date);
    }
    @Given("^I enter Shipping \"(.*?)\"$")
    public void i_enter_Shipping(String shipping) throws Throwable {
        driver.findElement(By.xpath("//input[@id='shipping']")).sendKeys(shipping);
    }
    @Given("^I enter Discount \"(.*?)\"$")
    public void i_enter_Discount(String discount) throws Throwable {
        driver.findElement(By.xpath("//input[@id='order_discount']")).sendKeys(discount);
    }
    @Given("^I enter order Tax from dropdown \"(.*?)\"$")
    public void i_enter_order_Tax_from_dropdown(String tax) throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'No Tax')]")).sendKeys(tax);
    }
    @Given("^I click on status \"(.*?)\"$")
    public void i_click_on_status(String status) throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Select Status')]")).sendKeys(status);
    }
    @Given("^I enter quantity \"(.*?)\"$")
    public void i_enter_quantity(String quantity) throws Throwable {
        driver.findElement(By.xpath("//input[@id='quantity-1']")).sendKeys(quantity);
    }
    @Given("^I eneter Product description \"(.*?)\"$")
    public void i_eneter_Product_description(String description) throws Throwable {
        driver.findElement(By.xpath("//input[@id='product-1']")).sendKeys(description);
    }
    @Given("^click on kitchenAid$")
    public void click_on_kitchenAid() throws Throwable {
        driver.findElement(By.xpath("//input[@id='product-1']")).click();
    }
    @Given("^I enter notes \"(.*?)\"$")
    public void i_enter_notes(String notes) throws Throwable {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[10]/textarea[1]")).sendKeys(notes);
    }
    @When("^I click on add quotation$")
    public void i_click_on_add_quotation() throws Throwable {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[11]/input[1]")).click();
    }
    @Then("^I should be taken to list quotation and provide ,message \"(.*?)\"$")
    public void i_should_be_taken_to_list_quotation_and_provide_message(String message) throws Throwable {
        WebElement quotationsuccessfullyadded = driver.findElement(By.xpath("//body/div[3]/div[2]"));
        Assert.assertTrue(quotationsuccessfullyadded.isDisplayed());
    }


}
