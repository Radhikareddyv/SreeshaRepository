package com.gic.invoice_manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "." ,tags="@UpdateCustomer", dryRun = false)
public class InvoiceRunner {


}
