package com.hrms.testBase;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.PersonalDetailsPage;

public class PageInitializer extends BaseCLass {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static PersonalDetailsPage personalDetailsPage;



    public static void initializePageObjects(){
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        personalDetailsPage=new PersonalDetailsPage();



    }

}
