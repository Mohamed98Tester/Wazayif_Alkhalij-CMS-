package login;

import Login.login;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import jopApp.P1_JopApp;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_login {

    protected login   login;
   protected P1_JopApp jopApp ;

   protected SHAFT.GUI.WebDriver driver ;

        SHAFT.TestData.JSON testData ;
   // testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/jopApplication.json");

    @BeforeSuite
    public void setup  (){

        driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.CHROME);
        driver.browser().navigateToURL("https://www.maysanjobs.com/auth/login");
        login = new login(driver); // هذا السطر ضروري قبل استخدام الكائن

             testData =new SHAFT.TestData.JSON("src/test/resources/testDataFiles/jopApplication.json");
            login = new login(driver);
        jopApp = new P1_JopApp(driver);
    }


    @Test
    public void signIn  (){

        login.enterUserName().enterPassword().clickOnSignin();
    }





}
