package soru_02_Xpath;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_4 extends BaseDriver {
    @Test
    public void test_4(){
     //  Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.Bekle(2);

     //  Calculate'e tıklayınız.
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        MyFunction.Bekle(2);

     //  İlk input'a herhangi bir sayı giriniz.
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("50");
        MyFunction.Bekle(2);

     //  İkinci input'a herhangi bir sayı giriniz.
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("100");
        MyFunction.Bekle(2);

     //  Calculate button'una tıklayınız.
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        MyFunction.Bekle(2);

     //  Sonucu alınız.     //  Sonucu yazdırınız.
        WebElement sonuc = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("sonuc = "+ sonuc.getText());

        BekleKapat();


    }
}
