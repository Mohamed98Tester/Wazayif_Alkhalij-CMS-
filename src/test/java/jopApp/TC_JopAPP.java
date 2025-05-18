package jopApp;

import Login.login;
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
    public void CreateJopApplication(){

       testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/jopApplication.json");


       login.enterUserName().enterPassword().clickOnSignin();


        jopApp = new P1_JopApp(driver);
        /*

       jopApp.clickOnJopApplication().writeName(testData.getTestData("Name"));
*/

        try {
            Thread.sleep(1000); // انتظر 1 ثانية قبل الضغط
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jopApp.clickOnJopApplication();

        driver.element().waitToBeInvisible(By.cssSelector("[placeholder=Name]")); // انتظر لغاية ما خانة الاسم تظهر

        driver.element().type(By.cssSelector("[placeholder=Name]"), testData.getTestData("Name")); // اكتب الاسم


    }


}
