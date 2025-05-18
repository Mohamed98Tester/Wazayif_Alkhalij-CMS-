import Login.login;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_login {

    login   login;

SHAFT.GUI.WebDriver driver ;


    @BeforeSuite
    public void setup  (){

        driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.CHROME);
        driver.browser().navigateToURL("https://www.maysanjobs.com/auth/login");
        login = new login(driver); // هذا السطر ضروري قبل استخدام الكائن

    }


        @Test
    public void signIn  (){
        login.enterUserName().enterPassword().clickOnSignin();
        }





}
