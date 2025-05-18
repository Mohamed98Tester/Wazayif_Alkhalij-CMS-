import Login.Login;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jop_Login {

    Login login;
     SHAFT.GUI.WebDriver driver ;
    SHAFT.TestData.JSON testData ;

    public Jop_Login(SHAFT.GUI.WebDriver driver){
        this.driver=driver;

    }


    @BeforeTest
    public void setup  (){

        driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.CHROME);
        driver.browser().navigateToURL("https://www.maysanjobs.com/auth/login");
        login = new Login(driver); // هذا السطر ضروري قبل استخدام الكائن
        testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/test/tset.json")   ;

    }


    @Test
    public void signIn  (){
        login.enterUserName().enterPassword().clickOnSignin();
    }





}