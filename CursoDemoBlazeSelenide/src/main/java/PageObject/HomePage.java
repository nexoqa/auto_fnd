package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    //Locators
    public static SelenideElement parentActiveImg(){
        return $(By.cssSelector("div.carousel-item.active img"));
    }

    public static SelenideElement firstSlide(){
        return $(By.cssSelector("img[alt='First slide']"));
    }

    public static SelenideElement secondSlide(){
        return $(By.cssSelector("img[alt='Second slide']"));
    }

    public static SelenideElement thirdSlide(){
        return $(By.cssSelector("img[alt='Third slide']"));
    }

    public static SelenideElement arrowRight(){
        return $(By.cssSelector("a[data-slide='next']"));
    }

    public static SelenideElement arrowLeft(){
        return $(By.cssSelector("a[data-slide='prev']"));
    }

    public static SelenideElement linkCategories() {
        return $(By.linkText("CATEGORIES"));
    }

    public static SelenideElement linkPhones() {
        return $(By.linkText("Phones"));
    }

    public static SelenideElement linkLaptops() {
        return $(By.linkText("Laptops"));
    }

    public static SelenideElement linkMonitors() {
        return $(By.linkText("Monitors"));
    }

    public static SelenideElement linkSamsungGalaxyS6() {
        return $(By.linkText("Samsung galaxy s6"));
    }

    public static SelenideElement linkSonyVaio() {
        return $(By.linkText("Sony vaio i5"));
    }

    public static SelenideElement linkMacBookPro() {
        return $(By.linkText("MacBook Pro"));
    }

    public static SelenideElement linkASUSFullHD() {
        return $(By.linkText("ASUS Full HD"));
    }

    public static SelenideElement buttonNextPage(){
        return $(By.linkText("next2"));
    }
}
