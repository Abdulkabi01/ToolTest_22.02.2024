package soru_02_Xpath;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_2 extends BaseDriver {
    @Test
    public void test_2(){

     //  1) Bu siteye gidin. -> https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

     //  2) Username kısmına "ttechno@gmail.com" girin.
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ttechno@gmail.com");
        MyFunction.Bekle(2);

     //  3) Password kısmına "techno123." girin.
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("techno123");
        MyFunction.Bekle(2);

     //  4) "Sign in" buttonunan tıklayınız.
        driver.findElement(By.xpath("//a[@id='log-in']")).click();
        MyFunction.Bekle(2);

     //  5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        WebElement sonuc = driver.findElement(By.xpath("//h6[@id='time']"));
        Assert.assertTrue("Your nearest branch closes in: 30m 5s yazisi bulunamadi", sonuc.getText().contains("Your nearest branch closes in: 30m 5s"));

    }

}
