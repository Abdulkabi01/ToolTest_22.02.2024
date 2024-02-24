package soru_02_Xpath;

import Araclar.BaseDriver;
import Araclar.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru_3 extends BaseDriver {
    @Test
    public void test_3(){
    //   1) Bu siteye gidin. -> https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");

    //   2) "teddy bear" aratın ve Search butonuna tıklayın.
        driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("teddy bear");
        MyFunction.Bekle(2);
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        MyFunction.Bekle(2);

    //   3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
     //   Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
        WebElement sonuc = driver.findElement(By.xpath("//*[@style='color: #212121; font-weight: normal']"));
        Assert.assertTrue("(We've got 308 results for teddy bear) yazi bulunamadi", sonuc.getText().contains("We've got 308 results for"));
        MyFunction.Bekle(2);


    }

}
