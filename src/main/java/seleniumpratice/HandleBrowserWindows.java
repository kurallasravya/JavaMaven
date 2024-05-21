package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;




public class HandleBrowserWindows {
    public  static  void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
        Set <String> windowsIds = driver.getWindowHandles();
        //Approch-1
       // Convert set to list because list we can access through get method single element in the browser windows
       /* List<String> windowslist = new ArrayList(windowsIds);
        String parentID = windowslist.get(0);
        String childID = windowslist.get(1);

         driver.switchTo().window(childID);
        System.out.println(driver.getTitle());*/

        //Approch -2
        //to access getwindowhandles() use forloop or enhancedforloop
        /*for(String winID:windowsIds){
            String title = driver.switchTo().window(winID).getTitle();
            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());*/
        //close() command how to use
        for(String winid:windowsIds){
            String title = driver.switchTo().window(winid).getCurrentUrl();
            System.out.println(title);
            if(title.equals("OrangeHRM")){
                driver.close();
            }
        }




    }
}
