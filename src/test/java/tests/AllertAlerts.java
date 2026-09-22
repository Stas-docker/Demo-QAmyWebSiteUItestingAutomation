package tests;

import core.BaseClass;
import steps.AlertsSteps;
import org.testng.annotations.Test;

public class AllertAlerts extends BaseClass {


    @Test
    public void test1(){
        AlertsSteps alertsSteps = new AlertsSteps();
        alertsSteps.openAlertWindow()
                .checkClickMe1()
                .checkClickMe2()
                .checkClickMe3()
                .checkClickMe4()
                .verifyAll();
    }
}
