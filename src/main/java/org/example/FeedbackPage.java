package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeedbackPage {
public  WebDriver driver;
 public final By root = By.xpath("//*[@id=\"psn-widget-button-frame\"]");
 public final By frame_switch = By.id("psn-widget-content-frame");
 public final By nextFirstLine = By.id("a0b6bac7-d894-42c7-a677-31814456ead9");
 public final By listen = By.xpath("//*[@id=\"78c3febe-85a2-4c11-8b94-f92d15ce6387\"]");
 public final By aggrementTrue = By.xpath("//*[@id=\"49f14168-e3f1-40fc-8549-608228d97270\"]/div[1]");
 public final By aggrementFalse = By.xpath("//*[@id=\"49f14168-e3f1-40fc-8549-608228d97270\"]/div[2]");
 public final By favorite = By.xpath("//*[@id=\"194bf9aa-c356-4ab5-971f-a673b295a85c\"]/div[1]");
 public final By nextSecondLine = By.id("37521850-fa76-4599-a027-096228733e79");
 public final By component_one = By.xpath("//div[@class=\"components P1\"]");
 public final By component_one_reply = By.xpath("//div[@class=\"components P1\"]");
 public final By email = By.xpath("//*[@id=\"82c5b3f1-20d3-49f7-9611-9e01859868b5\"]");
 public final By name = By.xpath("//*[@id=\"69714fd9-af95-4740-a9c7-e28424eb337c\"]");
 public final By phone = By.xpath("//*[@id=\"018297be-b0f8-4080-aeff-fa730108d7b2\"]");
 public final By nextLastLine = By.xpath("//*[@id=\"d7c25d6a-17e8-45d3-a831-67732c8b81e2\"]");

public WebDriverWait wait;
 public FeedbackPage (WebDriver driver){
  this.driver = driver;
 wait = new WebDriverWait(this.driver, 5, 500);
 }
 public void clickRoot(){
  WebElement rootPath = wait.until(ExpectedConditions.elementToBeClickable(root));
  rootPath.click();
 }
 public void switchFrame(){
  WebElement frame = driver.findElement(frame_switch);
  driver.switchTo().frame(frame);
 }
 public void setScore(int scoreValue){
  scoreValue = scoreValue - 1 ;
  WebElement scoreXpath = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"3bc04ad8-f4ef-4b19-a62e-efc43f3cb237\"]/div["+ scoreValue +"]")));
 scoreXpath.click();
 }

 public void chooseEmoji (int emojiValue){//WebElement emojiXpath = driver.findElement(By.xpath("//*[@id=\"6d01c7ef-f98b-4108-983b-2fc78743ab6f\"]/div["+ emojiValue +"]"));
  WebElement emojiXpath = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"6d01c7ef-f98b-4108-983b-2fc78743ab6f\"]/div["+ emojiValue +"]")));
  emojiXpath.click();
 }
 public void setNextFirstLine (){
  WebElement clickedNextFirstLine = driver.findElement(nextFirstLine);
  clickedNextFirstLine.click();
 }
 public void setListen (){
  //WebElement fillListen = driver.findElement(listen);
  WebElement fillListen = wait.until(ExpectedConditions.presenceOfElementLocated(listen));
  //driver.findElement(new By.ByCssSelector(".a-size-base-plus:first-child"));
  fillListen.sendKeys("Thank you Pisano");

 }
 public void setAggrementTrue (){
  WebElement choseAggrement = driver.findElement(aggrementTrue);
  choseAggrement.click();

 }
 public void setAggrementFalse (){
  WebElement choseAggrement = driver.findElement(aggrementFalse);
  choseAggrement.click();

 }
 public void setFavorite (){
  WebElement choseFavorite = driver.findElement(favorite);
  choseFavorite.click();
 }
 public void setNextSecondLine (){
  WebElement clickedNextSecondLine = driver.findElement(nextSecondLine);
  clickedNextSecondLine.click();
 }


 public void setEmail (){
  WebElement fillEmail = wait.until(ExpectedConditions.presenceOfElementLocated(email));
  fillEmail.sendKeys("rasitsengun93@gmail.com");
 }
 public void setName (){
  WebElement fillName = wait.until(ExpectedConditions.presenceOfElementLocated(name));
  fillName.sendKeys("rasitsengun93@gmail.com");
 }
 public void setPhone (){
  WebElement fillPhone = wait.until(ExpectedConditions.presenceOfElementLocated(phone));
  fillPhone.sendKeys("rasitsengun93@gmail.com");
 }
 public void setNextLastLine (){
  WebElement clickedNextLastLine = driver.findElement(nextLastLine);
  clickedNextLastLine.click();
 }
}
