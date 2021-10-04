package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
    CommonFunctions commonFunctions = new CommonFunctions();
    @Before
    public void beforeBrowser()
    {
      commonFunctions.openBrowser();
    }
    @After
    public void afterBrowser()
    {
        commonFunctions.closeBrowser();
    }
}
