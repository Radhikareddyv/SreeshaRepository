package com.gic.invoice_manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags ="@SpecialCharacters",dryRun=false)
public class InvoiceRunner {


}
