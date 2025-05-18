package Login;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class login {
    SHAFT.GUI.WebDriver driver ;
    public login (SHAFT.GUI.WebDriver driver){
this.driver=driver;
    }
private final By userName  =By.id("email");
        private final By password = By.id("password");
        private final By signINButton = By.cssSelector("[type=\"submit\"]");






        public login enterUserName (){
            driver.element().type(userName,"admin@cms.com");
            return this;
        }

    public login enterPassword (){
            driver.element().type(password,"test123");
            return this;
    }

        public login clickOnSignin  (){
            driver.element().click(signINButton);
            return this;
        }

}
