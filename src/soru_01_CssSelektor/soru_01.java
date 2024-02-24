package soru_01_CssSelektor;

import Araclar.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class soru_01 extends BaseDriver {
    @Test
    public  void   test01(){

        //  1) Bu siteye gidin. -> http://demoqa.com/text-box
      //  WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        //  2) Full Name kısmına "Automation" girin.
        WebElement FulName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        FulName.sendKeys("Automation");

        //  3) Email kısmına "Testing@gmail.com" girin.
        WebElement Email = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        Email.sendKeys("Testing@gmail.com");

        //  4) Current Address kısmına "Testing Current Address" girin.
        WebElement Adress = driver.findElement(By.cssSelector("[id='currentAddress']"));
        Adress.sendKeys("Testing Current Address");

       //   5) Permanent Address kısmına "Testing Permanent Address" girin.
        WebElement PermanentAdress = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        PermanentAdress.sendKeys("Testing Permanent Address");

       //   6) Submit butonuna tıklayınız.
        WebElement submit = driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();

       //   7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        WebElement fulName = driver.findElement(By.cssSelector("[id=name]"));
        Assert.assertTrue("Automation bulunmuyor",fulName.getText().contains("Automation"));

       //   8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        WebElement email = driver.findElement(By.cssSelector("[id=email]"));
        Assert.assertTrue("Automation bulunmuyor",email.getText().contains("Testing"));

        BekleKapat();

    }
}
