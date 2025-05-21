package jopApp;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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

        private final By selectSpecialty = By.xpath("(//input[@aria-autocomplete=\"list\"])[2]");



      private final By Specialty = By.id("react-select-7-placeholder");
        private final By uploadAttachment = By.id("file-upload-cv");




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
        // افتح الـ DropDown
        //TODO : Click on jop field for open DDL  كدا ضغطنا عليها بس لسه هنختار وهر معملوه ب react مش نافع select
     //   driver.element().click(openDDL); مش محتاج اضغط كليك عادى

        // اختار الـ input الداخلي
        By inputField = By.xpath("(//input[@aria-autocomplete=\"list\"])[1]");

        // اكتب اسم الوظيفة واضغط ENTER لاختيارها
        //TODO : اعتبارته ان اكتب فيه وهكتب اسم الوظيفة هنا
        driver.element().type(inputField, jop);
        //TODO : بعد م كتبت اسم الوظيفة عايز اضغط هنا انتر بقي
        driver.getDriver().findElement(inputField).sendKeys(Keys.ENTER);

        return this;
    }




    public P1_JopApp choseSpecialty(String specialty) {

           driver.element().type(selectSpecialty,specialty);
           driver.getDriver().findElement(selectSpecialty).sendKeys(Keys.ENTER);

            return this;
        }



     /*   public P1_JopApp uploadCV (String CVPath){
            //driver.element().click(uploadAttachment);
            driver.element().select(uploadAttachment,CVPath);
            return this;
        }


      */
    public P1_JopApp uploadCV(String CVPath) {
        // لاقي عنصر الرفع باستخدام WebDriver العادي من SHAFT
        WebElement uploadElement = driver.getDriver().findElement(uploadAttachment);

        // لو العنصر مخفي، خليه ظاهر عشان نقدر نستخدم sendKeys
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].style.display = 'block';", uploadElement);

        // ابعت الملف مباشرة باستخدام sendKeys
        uploadElement.sendKeys(CVPath);

        return this;
    }




}
