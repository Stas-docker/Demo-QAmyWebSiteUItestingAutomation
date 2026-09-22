package tests;

import core.BaseClass;
import steps.PracticeFormSteps;
import org.testng.annotations.Test;

public class FormsPracticeForm extends BaseClass {
    @Test
    public void test1positive(){
        String firstName = "Vasiok";
        String lastName = "Vasea";
        String email = "vasea@gmail.com";
        String number = "37378195505";
        String themes = "lnwjhdik";
        String curAdress = "ncxnje";
        String city1 = "NCR";
        String gender = "Male";
        String studentName = firstName + " " + lastName;
        PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
        practiceFormSteps.openPracticeForm().fulfillPracticeForm(firstName, lastName, email, gender, number,
                themes, curAdress, city1).verifyInputs(studentName, email, gender);
    }


    @Test
    public void test2negative(){
        //without lastname
        String firstName = "Мфыуф";
        String lastName = "Vasea";
        String email = "vasea@gmail.com";
        String number = "37378195505";
        String themes = "lnwjhdik";
        String curAdress = "ncxnje";
        String city1 = "NCR";
        String gender = "Male";
        PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
        practiceFormSteps.openPracticeForm().fulfillPracticeForm(firstName, "", email, gender, number,
                themes, curAdress, city1).verifyNegativeInputs();
    }


@Test
    public void test3negative(){
        //without first
        String lastName = "Vasea";
        String email = "vasea@gmail.com";
        String number = "37378195505";
        String themes = "lnwjhdik";
        String curAdress = "ncxnje";
        String city1 = "NCR";
    String gender = "Male";
        PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
        practiceFormSteps.openPracticeForm().fulfillPracticeForm("", lastName, email, gender, number,
                themes, curAdress, city1).verifyNegativeInputs();

    }


    @Test
    public void test4negative(){
        //without number
        String firstName = "Мфыуф";
        String lastName = "Vasea";
        String email = "vasea@gmail.com";
        String themes = "lnwjhdik";
        String curAdress = "ncxnje";
        String city1 = "NCR";
        String gender = "Male";
        PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
        practiceFormSteps.openPracticeForm().fulfillPracticeForm(firstName, lastName, email, gender, "",
                themes, curAdress, city1).verifyNegativeInputs();

    }


    @Test
    public void test5negative(){
        //without email
        String firstName = "Мфыуф";
        String lastName = "Vasea";
        String number = "37378195505";
        String themes = "lnwjhdik";
        String curAdress = "ncxnje";
        String city1 = "NCR";
        String gender = "Male";
        PracticeFormSteps practiceFormSteps = new PracticeFormSteps();
        practiceFormSteps.openPracticeForm().fulfillPracticeForm(firstName, lastName, "", gender, number,
                themes, curAdress, city1).verifyNegativeInputs();
    }
    //We see that here is a bug, the user can register without email.
}

//We can continue our verifications and use all the fiels or leave all the fields empty.
