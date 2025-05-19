package jopApp;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class P1_JopApp {

    SHAFT.GUI.WebDriver driver ;
   public P1_JopApp (SHAFT.GUI.WebDriver driver){
    this.driver =  driver ;
     }

        private final By jopApplication =By.xpath("(//button[@type='button'])[4]");
       // private final By jopApplication = By.xpath("(//button[contains(text(),'طلب وظيفة')])[1]");
        private final By name   = By.cssSelector("[name=\"name\"]");
        private final By phoneNumberCountry =By.className("PhoneInputCountrySelect");
        private final By phoneNumberfield = By.cssSelector("[type=\"tel\"]");
        private final By email = By.name("email");
      //  private final By selectJop = By.className("css-1xc3v61-indicatorContainer");
     // public final By selectJop = By.cssSelector(".css-19bb58m");
        private final By openDDL = By.cssSelector(".css-19bb58m");




      private final By Specialty = By.id("react-select-7-placeholder");





        public P1_JopApp clickOnJopApplication (){
            driver.element().click(jopApplication);
            return this;

        }



        public P1_JopApp writeName (String Name){
            driver.element().type(name,Name);
            return this;
        }


        public P1_JopApp choseCountry (String country ){
            driver.element().select(phoneNumberCountry,country);
            return this;
        }

        public P1_JopApp enterPhoneNumber (String phoneNumber){
            driver.element().typeAppend(phoneNumberfield,phoneNumber);
            return this;
        }


        public P1_JopApp writeEmail (String mail){
            driver.element().type(email,mail);
            return this;
        }

    public P1_JopApp choseJop(String jop) {
        // افتح القائمة
        driver.element().click(openDDL);

        // ادخل اسم الوظيفة في حقل البحث الداخلي
        By inputField = By.cssSelector("input[id^='react-select'][id$='-input']");
        driver.element().type(inputField, jop);

        // انتظر ظهور الخيار، واختاره
        By jobOption = By.xpath(String.format("//div[contains(@class,'css-1n7v3ny-option') and contains(text(),'%s')]", jop));
        driver.element().waitToBeReady(jobOption);
        driver.element().select(jobOption,jop);
        driver.element().click(By.xpath("//div[contains(@class,'css-1n7v3ny-option') and contains(text(),'%s')]"));


        return this;
    }





    public P1_JopApp choseSpecialty(String specialty) {
            driver.element().select(Specialty,specialty);
            return this;
        }







}
