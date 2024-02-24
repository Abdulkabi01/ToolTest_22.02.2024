package soru_02_Xpath;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;

public class soru_6 extends BaseDriver {
    @Test
    public void test_6(){
     //  Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

     //  Fake Alerts'e tıklayınız.
        driver.findElement(By.xpath("//a[@id='fakealerttest']")).click();
        MyFunction.Bekle(2);

     //  Show modal dialog buttonuna tıklayınız.
        driver.findElement(By.xpath("//input[@id='modaldialog']")).click();
        MyFunction.Bekle(2);

     //          Ok'a tıklayınız.//  Alert kapanmalıdır.
        driver.findElement(By.xpath("//button[@id='dialog-ok']")).click();
        MyFunction.Bekle(2);

        BekleKapat();

    }
}
