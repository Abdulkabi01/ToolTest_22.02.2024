package soru_01_CssSelektor;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_02 extends BaseDriver {
    @Test
    public void test2(){
   //  Bu siteye gidin. -> https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

   //  Username kısmına "ttechno@gmail.com" girin.
        driver.findElement(By.cssSelector("[id='username']")).sendKeys("ttechno@gmail.com");
        MyFunction.Bekle(2);

   //          Password kısmına "techno123." girin.
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("techno123");
        MyFunction.Bekle(2);

   //          "Sign in" buttonunan tıklayınız.
        driver.findElement(By.cssSelector("[id='log-in']")).click();

   //  "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        WebElement yazi = driver.findElement(By.cssSelector("[id='time']"));
        Assert.assertTrue("Your nearest branch closes in: 30m 5s, yazisi bulunmadi",yazi.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();

    }
}
