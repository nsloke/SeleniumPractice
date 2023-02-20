/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seletro;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 *
 * @author rocky
 */
public class Seletro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FirefoxDriver fd=new FirefoxDriver();
       fd.get("https://www.imdb.com/chart/top/");
       System.out.println("Title:"+fd.getTitle());

   List<WebElement> webexcols=fd.findElements(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[1]/td"));

   List<WebElement> webexrows=fd.findElements(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr"));

       System.out.println("Number of columns:"+webexcols.size());

       System.out.println("Number of rows:"+webexrows.size());

 
       for(int i=1;i<=webexrows.size();i++) {
           
                WebElement webex=fd.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr["+i+"]/td[2]/a"));

               
            
                
                System.out.print(" Director Name:"+webex.getAttribute("title")+"   Movie Name:"+webex.getText()+"  "+webex.getAttribute("href")  );
             
             
            
            System.out.println();
        }


       fd.quit();


    }
    
}
