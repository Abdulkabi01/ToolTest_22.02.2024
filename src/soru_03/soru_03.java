package soru_03;

import Araclar.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_03 extends BaseDriver {
    @Test
    public void test3(){
//        1) Bu siteye gidin. -> https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");
//
//        2) "teddy bear" aratın ve Search butonuna tıklayın.
        WebElement ara = driver.findElement(By.cssSelector("[name='keyword'][type='text'][class='col-xs-20 searchformInput keyword']"));
        ara.click();
        ara.sendKeys("teddy bear");
        driver.findElement(By.cssSelector("[class='searchTextSpan']")).click();
//
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 308 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
        WebElement sonuc = driver.findElement(By.cssSelector("[id='searchMessageContainer']  span"));
        Assert.assertTrue("bu yazi yok",sonuc.getText().contains("We've got 308 results for teddy bear"));

        BekleKapat();


    }
}
