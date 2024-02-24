package soru_01_CssSelektor;

import Araclar.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_04 extends BaseDriver {
    @Test
    public void test04(){
//        Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//
//        Calculate'e tıklayınız.
        driver.findElement(By.cssSelector("[id='calculatetest']")).click();
//
//        İlk input'a herhangi bir sayı giriniz.
        driver.findElement(By.cssSelector("[id='number1']")).sendKeys("10");

//
//        İkinci input'a herhangi bir sayı giriniz.
        driver.findElement(By.cssSelector("[id='number2']")).sendKeys("20");

//        Calculate button'una tıklayınız.
        driver.findElement(By.cssSelector("[id='calculate']")).click();
//
//        Sonucu alınız.//        Sonucu yazdırınız.
        WebElement sonuc = driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("sonuc = "+sonuc.getText());
//


    }
}
