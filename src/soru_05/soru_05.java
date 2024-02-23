package soru_05;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;

public class soru_05 extends BaseDriver {
    @Test
    public void test_05(){
//      Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.Bekle(2);

//      Fake Alerts' tıklayınız.
        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunction.Bekle(2);

//      Show Alert Box'a tıklayınız.
        driver.findElement(By.cssSelector("[id='fakealert']")).click();
        MyFunction.Bekle(2);

//      Ok'a tıklayınız.//      Alert kapanmalıdır.
        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();
        MyFunction.Bekle(2);

        BekleKapat();
    }
}
