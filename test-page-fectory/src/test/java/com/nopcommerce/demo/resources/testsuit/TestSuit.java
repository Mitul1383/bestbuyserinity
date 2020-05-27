package com.nopcommerce.demo.resources.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.resources.testbase.TestBase;
import org.testng.annotations.BeforeMethod;

public class TestSuit extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})

}
