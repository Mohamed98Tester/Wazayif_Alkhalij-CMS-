package jopApp;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class P1_JopApp {

    SHAFT.GUI.WebDriver driver ;
   public P1_JopApp (SHAFT.GUI.WebDriver driver){
    this.driver =  driver ;
     }

      //  private final By jopApplication =By.xpath("//button[@type=button][3]");
        private final By jopApplication = By.xpath("(//button[contains(text(),'طلب وظيفة')])[1]");
        private final By name   = By.cssSelector("[placeholder=Name]");


    //button[@type="button"][3]



        public P1_JopApp clickOnJopApplication (){
            driver.element().click(jopApplication);
            return this;

        }



        public P1_JopApp writeName (String Name){
            driver.element().type(name,Name);
            return this;
        }



}
