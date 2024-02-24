package soru_02_Xpath;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_1 extends BaseDriver {
    @Test
    public void test_1(){
     //  1) Bu siteye gidin. -> http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");

     //  2) Full Name kısmına "Automation" girin.
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Automation");
        MyFunction.Bekle(2);

     //  3) Email kısmına "Testing@gmail.com" girin.
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("Testing@gmail.com");
        MyFunction.Bekle(2);

     //  4) Current Address kısmına "Testing Current Address" girin.
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Testing Current Address");
        MyFunction.Bekle(2);

     //  5) Permanent Address kısmına "Testing Permanent Address" girin.
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Testing Permanent Address");
        MyFunction.Bekle(2);

     //  6) Submit butonuna tıklayınız.
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        MyFunction.Bekle(2);

     //  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        WebElement sonuc1 = driver.findElement(By.xpath("//p[@id='name']"));
        Assert.assertTrue("Automation bulunmuyor", sonuc1.getText().contains("Automation"));

     //  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        WebElement sonuc2 = driver.findElement(By.xpath("//p[@id='email']"));
        Assert.assertTrue("Testing bulunmuyor", sonuc2.getText().contains("Testing"));

    //    BekleKapat();

    }
}
