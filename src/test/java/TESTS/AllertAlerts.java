package TESTS;

import CORE.BaseClass;
import STEPS.AlertsSteps;
import org.testng.annotations.Test;

public class AllertAlerts extends BaseClass {


    @Test
    public void test1(){
        AlertsSteps alertsSteps = new AlertsSteps();
        alertsSteps.openAlertWindow();
    }
}
