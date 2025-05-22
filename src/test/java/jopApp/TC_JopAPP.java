package jopApp;

import Login.Login;
import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import login.TC_login;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class TC_JopAPP extends  TC_login {


    protected P1_JopApp jopApp ;

    // login login;

    SHAFT.TestData.JSON testData ;





    @Test
    public void CreateJopApplication() throws InterruptedException {

        testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/jopApplication.json");


        login.enterUserName().enterPassword().clickOnSignin();


        jopApp = new P1_JopApp(driver);


        //  jopApp.clickOnJopApplication().writeName(testData.getTestData("Name"));



        Thread.sleep(1000); // انتظر 1 ثانية قبل الضغط


        jopApp.clickOnJopApplication()
                .writeName(testData.getTestData("Name")).choseCountry(testData.getTestData("country"))
                .enterPhoneNumber(testData.getTestData("phonenumber"))
                .writeEmail(testData.getTestData("mail"))
                .choseJop(testData.getTestData("jop"))
                .choseSpecialty(testData.getTestData("Specialty")).uploadCV(testData.getTestData("CV_path")).clickOnContinue().submitApplicationJop();



    }


}
