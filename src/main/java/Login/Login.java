package Login;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Login {
    SHAFT.GUI.WebDriver driver ;
    public Login (SHAFT.GUI.WebDriver driver){
this.driver=driver;
    }
private final By userName  =By.id("email");
        private final By password = By.id("password");
        private final By signINButton = By.cssSelector("[type=\"submit\"]");






        public Login enterUserName (){
            driver.element().type(userName,"admin@cms.com");
            return this;
        }

    public Login enterPassword (){
            driver.element().type(password,"test123");
            return this;
    }

        public Login clickOnSignin  (){
            driver.element().click(signINButton);
            return this;
        }

}
