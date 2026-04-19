package TESTS;


import CORE.BaseClass;
import STEPS.TextBoxSteps;
import org.testng.annotations.Test;

public class ElementsTextBox extends BaseClass{
    @Test
public void test1ElementsTextboxPositive(){
        String name ="Vasea";
        String email = "vasea@gmail.com";
        String curAdress = "current adress test";
        String perAdress = "permanent adress test";
    TextBoxSteps textBoxSteps = new TextBoxSteps();
    textBoxSteps.openTextBox().completeTextBoxFields(name ,email
            ,curAdress, perAdress).
            verifyDisplayedText(name, email, curAdress, perAdress);
   }

    @Test
    public void test1ElementsTextboxNegative(){
        /*Name field is empty*/
        String name ="";
        String email = "vasea@gmail.com";
        String curAdress = "current adress test";
        String perAdress = "permanent adress test";
        TextBoxSteps textBoxSteps = new TextBoxSteps();
        textBoxSteps.openTextBox().completeTextBoxFields(name ,email
                        ,curAdress, perAdress).
                verifyDisplayedText(name, email, curAdress, perAdress);
    }

    @Test
    public void test2ElementsTextboxNegative(){
        /*Email field is empty*/
        String name ="Vasea";
        String email = "";
        String curAdress = "current adress test";
        String perAdress = "permanent adress test";
        TextBoxSteps textBoxSteps = new TextBoxSteps();
        textBoxSteps.openTextBox().completeTextBoxFields(name ,email
                        ,curAdress, perAdress).
                verifyDisplayedText(name, email, curAdress, perAdress);
    }

    @Test
    public void test3ElementsTextboxNegative(){
        /*Current adress field is empty*/
        String name ="Vasea";
        String email = "vasea@gmail.com";
        String curAdress = "";
        String perAdress = "permanent adress test";
        TextBoxSteps textBoxSteps = new TextBoxSteps();
        textBoxSteps.openTextBox().completeTextBoxFields(name ,email
                        ,curAdress, perAdress).
                verifyDisplayedText(name, email, curAdress, perAdress);
    }

    @Test
    public void test4ElementsTextboxNegative(){
        /*Permanent adress field is empty*/
        String name ="Vasea";
        String email = "vasea@gmail.com";
        String curAdress = "current adress test";
        String perAdress = "";
        TextBoxSteps textBoxSteps = new TextBoxSteps();
        textBoxSteps.openTextBox().completeTextBoxFields(name ,email
                        ,curAdress, perAdress).
                verifyDisplayedText(name, email, curAdress, perAdress);
    }
}
