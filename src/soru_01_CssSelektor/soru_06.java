package soru_01_CssSelektor;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;

public class soru_06 extends BaseDriver {
    @Test
    public void test_06(){
//       Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.Bekle(2);

//       Fake Alerts'e tıklayınız.
        driver.findElement(By.cssSelector("[id='fakealerttest']")).click();
        MyFunction.Bekle(2);

//       Show modal dialog buttonuna tıklayınız.
        driver.findElement(By.cssSelector("[id='modaldialog']")).click();
        MyFunction.Bekle(2);

//               Ok'a tıklayınız.//       Alert kapanmalıdır.
        driver.findElement(By.cssSelector("[id='dialog-ok']")).click();
        MyFunction.Bekle(2);

        BekleKapat();
    }
}
