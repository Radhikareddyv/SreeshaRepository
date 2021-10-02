package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyColumnsFilterValidationFromListQuotation extends CommonFunctions



  {
    @When("^i click on sales$")
    public void i_click_on_sales()
    {
      driver.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]/b[1]")).click();
    }


      WebDriverWait wait = new WebDriverWait(driver,30 );



      @When("^i should be able to view the drop down options$")
    public void i_should_be_able_to_view_the_drop_down_options()
    {
        WebElement salesOptionsVerEle = driver.findElement(By.xpath("//a[@id='sales_quotes']"));
        Assert.assertTrue(salesOptionsVerEle.isDisplayed());
    }


    @When("^i click on list quotations option to land on list quotations page$")
    public void i_click_on_list_quotations_option_to_land_on_list_quotations_page()
    {
      driver.findElement(By.xpath("//a[@id='sales_quotes']")).click();
    }


    @When("^i click on columns tab$")
    public void i_click_on_columns_tab()
    {
     driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
    }


    @When("^i click on ID option$")
    public void i_click_on_ID_option()
    {
      driver.findElement(By.xpath("//a[contains(text(),'ID')]")).click();
    }


    @Then("^i should be able to view the ID as selected and a separate column called ID should be created with the list of IDs$")
    public void i_should_be_able_to_view_the_ID_as_selected_and_a_separate_column_called_ID_should_be_created_with_the_list_of_IDs()
    {
      WebElement idColumn = driver.findElement(By.xpath("//thead/tr[1]/th[1]"));
      Assert.assertTrue(idColumn.isDisplayed());
    }


    // verify date of columns//

    @When("^i click on date option$")
    public void i_click_on_date_option()
    {
     driver.findElement(By.xpath("//body/ul[1]/li[2]/a[1]")).click();
    }

    @Then("^i should be able to view the date as selected and a separate column called date should be created with the list of dates of quotations$")
    public void i_should_be_able_to_view_the_date_as_selected_and_a_separate_column_called_date_should_be_created_with_the_list_of_dates_of_quotations()
    {
      WebElement dateColumn = driver.findElement(By.xpath("//th[contains(text(),'Date')]"));
      Assert.assertTrue(dateColumn.isDisplayed());
    }


    //verify Billing Company of columns//
    @When("^i click on Billing Company option$")
    public void i_click_on_Billing_Company_option()
    {
      driver.findElement(By.xpath("//a[contains(text(),'Billing Company')]")).click();
    }

    @Then("^i should be able to view the Billing Company as selected and a separate column called Billing Company should be created with the list of names of billing companies$")
    public void i_should_be_able_to_view_the_Billing_Company_as_selected_and_a_separate_column_called_Billing_Company_should_be_created_with_the_list_of_names_of_billing_companies()
    {
      WebElement billingCompanyColumn = driver.findElement(By.xpath("//th[contains(text(),'Billing Company')]")) ;
      Assert.assertTrue(billingCompanyColumn.isDisplayed());
    }


//verify Reference No of column//
    @When("^i click on Reference no option$")
    public void i_click_on_Reference_no_option()
    {
      driver.findElement(By.xpath("//a[contains(text(),'Reference No')]")).click();
    }

    @Then("^i should be able to view the Reference no as selected and a separate column called Reference No should be created with the reference numbers of quotations$")
    public void i_should_be_able_to_view_the_Reference_no_as_selected_and_a_separate_column_called_Reference_No_should_be_created_with_the_reference_numbers_of_quotations()
    {
      WebElement referenceNoColumn = driver.findElement(By.xpath("//th[contains(text(),'Reference No')]"));
      Assert.assertTrue(referenceNoColumn.isDisplayed());
    }


// verify created by option of columns//
    @When("^i click on Created By option$")
    public void i_click_on_Created_By_option()
    {
      driver.findElement(By.xpath("//a[contains(text(),'Created By')]")).click();
    }

    @Then("^i should be able to view the Created By option as selected and a separate column called Created By should be created with the names of who created quotations$")
    public void i_should_be_able_to_view_the_Created_By_option_as_selected_and_a_separate_column_called_Created_By_should_be_created_with_the_names_of_who_created_quotations()
    {
     WebElement createdByColumn = driver.findElement(By.xpath("//th[contains(text(),'Created By')]"));
     Assert.assertTrue(createdByColumn.isDisplayed());
    }


    //verify customer option of columns//

    @When("^i click on Customer option$")
    public void i_click_on_Customer_option()
    {
      driver.findElement(By.xpath("//body/ul[1]/li[6]/a[1]")).click();
    }

    @Then("^i should be able to view the Customer option as selected and a separate column called customer should be created with the names of who created quotations$")
    public void i_should_be_able_to_view_the_Customer_option_as_selected_and_a_separate_column_called_customer_should_be_created_with_the_names_of_who_created_quotations()
    {
      WebElement customerColumn = driver.findElement(By.xpath("//th[contains(text(),'Customer')]"));
      Assert.assertTrue(customerColumn.isDisplayed());
    }


//verify total option of columns//

    @When("^i click on Total option$")
    public void i_click_on_Total_option()
    {
     driver.findElement(By.xpath("//body/ul[1]/li[7]/a[1]")).click();
    }

    @Then("^i should be able to view the Total option as selected and a separate column called total should be created with the total of quotation$")
    public void i_should_be_able_to_view_the_Total_option_as_selected_and_a_separate_column_called_total_should_be_created_with_the_total_of_quotation()
    {
     WebElement totalColumn = driver.findElement(By.xpath("//thead/tr[1]/th[6]"));
     Assert.assertTrue(totalColumn.isDisplayed());
    }


//verify tax value of column//

    @When("^i click on Tax Value option$")
    public void i_click_on_Tax_Value_option()
   {
    driver.findElement(By.xpath("//thead/tr[1]")).click();
    }

    @Then("^i should be able to view the Tax Value option as selected and a separate column called total should be created with the total of quotation$")
    public void i_should_be_able_to_view_the_Tax_Value_option_as_selected_and_a_separate_column_called_total_should_be_created_with_the_total_of_quotation()
    {
      WebElement taxValueColumn = driver.findElement(By.xpath("//thead/tr[1]/th[7]"));
      Assert.assertTrue(taxValueColumn.isDisplayed());
    }


    //verify shipping option of columns//
    @When("^i click on Shipping option$")
    public void i_click_on_Shipping_option()
    {
      driver.findElement(By.xpath("//a[contains(text(),'Shipping')]")).click();
    }

    @Then("^i should be able to view the Shipping option as selected and a separate column called Shipping should be created with the shipping prices$")
    public void i_should_be_able_to_view_the_Shipping_option_as_selected_and_a_separate_column_called_Shipping_should_be_created_with_the_shipping_prices()
    {
     WebElement shippingColumn = driver.findElement(By.xpath("//th[contains(text(),'Shipping')]"));
     Assert.assertTrue(shippingColumn.isDisplayed());
    }


    //verfy discount option of columns//

    @When("^i click on discount option$")
    public void i_click_on_discount_option()
    {
     driver.findElement(By.xpath("//a[contains(text(),'Discount')]")).click();
    }

    @Then("^i should be able to view the discount option as selected and a separate column called discount should be created with the list of discounts$")
    public void i_should_be_able_to_view_the_discount_option_as_selected_and_a_separate_column_called_discount_should_be_created_with_the_list_of_discounts()
    {
     WebElement discountColumn = driver.findElement(By.xpath("//thead/tr[1]/th[9]"));
     Assert.assertTrue(discountColumn.isDisplayed());
    }


    //verify grandtotal of column//

    @When("^i click on Grand Total option$")
    public void i_click_on_Grand_Total_option()
    {
      driver.findElement(By.xpath("//a[contains(text(),'Grand Total')]")).click();
    }

      @Then("^i should be able to view the Grand Total option as selected and a separate column called Grand Total should be created with the list of Grand totals$")
      public void i_should_be_able_to_view_the_Grand_Total_option_as_selected_and_a_separate_column_called_Grand_Total_should_be_created_with_the_list_of_Grand_totals()
      {
       WebElement grandTotalColumn = driver.findElement(By.xpath("//th[contains(text(),'Grand Total')]"));
       Assert.assertTrue(grandTotalColumn.isDisplayed());
      }


      //verify expiry date option of columns//

      @When("^i click on Expiry Date option$")
      public void i_click_on_Expiry_Date_option()
      {
        driver.findElement(By.xpath("//a[contains(text(),'Expiry Date')]")).click();
      }

      @Then("^i should be able to view the Expiry Date option as selected and a separate column called Expiry Date should be created with the list expiry dates of quotations$")
      public void i_should_be_able_to_view_the_Expiry_Date_option_as_selected_and_a_separate_column_called_Expiry_Date_should_be_created_with_the_list_expiry_dates_of_quotations()
      {
        WebElement expiryDateColumn = driver.findElement(By.xpath("//thead/tr[1]/th[11]"));
        Assert.assertTrue(expiryDateColumn.isDisplayed());
      }


      //verify status option of columns//

      @When("^i click on Status option$")
      public void i_click_on_Status_option()
      {
        driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
      }

      @Then("^i should be able to view the Status option as selected and a separate column called status should be created with the list of status of quotations$")
      public void i_should_be_able_to_view_the_Status_option_as_selected_and_a_separate_column_called_status_should_be_created_with_the_list_of_status_of_quotations()
      {
       WebElement statusColumn = driver.findElement(By.xpath("//th[contains(text(),'Status')]"));
       Assert.assertTrue(statusColumn.isDisplayed());
      }


      //verify actions option of columns//

      @When("^i click on Actions option$")
      public void i_click_on_Actions_option()
      {
         driver.findElement(By.xpath("//a[contains(text(),'Actions')]")).click();
      }

      @Then("^i should be able to view the Actions option as selected and a separate column called Actions should be created with the list of Actions of quotations$")
      public void i_should_be_able_to_view_the_Actions_option_as_selected_and_a_separate_column_called_Actions_should_be_created_with_the_list_of_Actions_of_quotations()
      {
        WebElement actionsColumn = driver.findElement(By.xpath("//thead/tr[1]/th[13]"));
        Assert.assertTrue(actionsColumn.isDisplayed());
      }

  }
