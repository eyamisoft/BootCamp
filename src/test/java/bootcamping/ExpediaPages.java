package bootcamping;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Set;

public class ExpediaPages {

    WebDriver demo;


    @FindBy(css="#tab-flight-tab-hp") WebElement flightTab;
    @FindBy(xpath="//input[@id='flight-origin-hp-flight']") WebElement origin;
    @FindBy(xpath="//input[@id='flight-destination-hp-flight']")
    WebElement flyTo;
    @FindBy(xpath="//input[@id='flight-departing-hp-flight']") WebElement depatureDate;
    @FindBy(xpath="//button[@data-year='2019'and@data-month='6'and@data-day='24']") WebElement depDate;
    @FindBy(xpath="//input[@id='flight-returning-hp-flight']") WebElement retDate;
    @FindBy(xpath="//div[contains(@class,'col gcw-date-field')]//div[3]//table[1]//tbody[1]//tr[2]//td[2]//button[1]") WebElement retDay;
    @FindBy(xpath="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button") WebElement travelers;
    @FindBy(xpath="//body[contains(@class,'wrap cf aoa-enabled')]/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[contains(@class,'hero-banner-gradient native-marquee')]/div[contains(@class,'cols-row hero-banner-inner')]/section[@id='wizardSection']/div[contains(@class,'hero-banner-box siteId-1 cf hideClassicDcol')]/div[@id='wizard-tabs']/div[contains(@class,'tabs-container col')]/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[contains(@class,'room-data')]/div[contains(@class,'cols-nested')]/div[contains(@class,'ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both')]/div[@id='traveler-selector-hp-flight']/div[contains(@class,'menu-bar gcw-travel-selector-wrapper')]/ul[contains(@class,'menu-bar-inner')]/li[contains(@class,'open')]/div[contains(@class,'menu sticky gcw-menu')]/div[contains(@class,'menu-main')]/div[contains(@class,'traveler-selector-sinlge-room-data traveler-selector-room-data')]/div[contains(@class,'uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized')]/div[contains(@class,'uitk-col all-col-shrink')]/button[contains(@class,'uitk-step-input-button uitk-step-input-plus')]/span[contains(@class,'uitk-icon')]/*[1]") WebElement noAdults;
    @FindBy(xpath="//div[contains(@class,'traveler-selector-sinlge-room-data traveler-selector-room-data')]//div[contains(@class,'children-wrapper')]//div[contains(@class,'uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized')]//button[contains(@class,'uitk-step-input-button uitk-step-input-plus')]//*[contains(@class,'uitk-icon-svg uitk-step-input-icon')]") WebElement noChildren;
    @FindBy(xpath="//div[contains(@class,'cols-nested children-data gcw-toggles-fields available-for-flights')]//select[@id='flight-age-select-1-hp-flight']") WebElement childAge;

    @FindBy(xpath="//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]") WebElement closeArea;
    @FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]") WebElement search;

    @FindBy(id="firstname[0]") WebElement person1fn;
    @FindBy(id="lastname[0]") WebElement person1ln;
    @FindBy(id="phone-number[0]") WebElement person1phone;
    @FindBy(id="gender_male[0]") WebElement radiomale;
    @FindBy(id="date_of_birth_month0") WebElement person1dobmonth;
    @FindBy(id="date_of_birth_day[0]") WebElement person1dobday;
    @FindBy(id="date_of_birth_year[0]") WebElement person1dobyr;
    @FindBy(id="firstname[1]") WebElement person2fn;
    @FindBy(id="lastname[1]") WebElement person2ln;
    @FindBy(id="phone-number[1]") WebElement person2phone;
    @FindBy(id="gender_female[1]") WebElement radiofemale;
    @FindBy(id="date_of_birth_month1") WebElement person2dobmonth;
    @FindBy(id="date_of_birth_day[1]") WebElement person2dobday;
    @FindBy(id="date_of_birth_year[1]") WebElement person2dobyr;
    @FindBy(id="firstname[2]") WebElement person3fn;
    @FindBy(id="lastname[2]") WebElement person3ln;
    @FindBy(id="phone-number[2]") WebElement person3phone;
    @FindBy(id="gender_male[2]") WebElement radiochild;
    @FindBy(id="date_of_birth_month2") WebElement person3dobmonth;
    @FindBy(id="date_of_birth_day[2]") WebElement person3dobday;
    @FindBy(id="date_of_birth_year[2]") WebElement person3dobyr;



    public ExpediaPages(WebDriver demo) {

        this.demo=demo;
    }

    public void formFill() throws Exception {

        flightTab.click();
        origin.click();
        origin.sendKeys("Los");
        demo.findElement(By.xpath("//a[@id='aria-option-1']//div[1]")).click();
        flyTo.click();
        flyTo.sendKeys("Los");
        demo.findElement(By.xpath("//a[@id='aria-option-0']//div[1]")).click();
        depatureDate.click();
        depDate.click();
        retDate.click();
        retDay.click();
        travelers.click();
        Thread.sleep(3000);
        noAdults.click();
        noChildren.click();
        Select age = new Select(demo.findElement(By.xpath("//div[contains(@class,'cols-nested children-data gcw-toggles-fields available-for-flights')]//select[@id='flight-age-select-1-hp-flight']")));
        age.selectByIndex(8);
        closeArea.click();
        search.click();
    }

    public void newPage() throws InterruptedException {

        Thread.sleep(15000);

        demo.findElement(By.xpath("//*[@id=\"flight-module-2019-07-24t15:55:00-07:00-coach-lax-doh-qr-740-coach-doh-los-qr-1407_2019-08-05t12:00:00+01:00-coach-los-doh-qr-1408-coach-doh-lax-qr-739_\"]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
        Thread.sleep(5000);
        demo.findElement(By.xpath("//*[@id=\"flight-module-2019-07-24t15:55:00-07:00-coach-lax-doh-qr-740-coach-doh-los-qr-1407_2019-08-05t12:00:00+01:00-coach-los-doh-qr-1408-coach-doh-lax-qr-739_\"]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
        Thread.sleep(5000);
        demo.findElement(By.cssSelector("#forcedChoiceNoThanks")).click();
        Thread.sleep(5000);

        String s = demo.getTitle();
        System.out.println(s);

    }

    public void booking() throws Exception {
        String s = demo.getTitle();
        System.out.println(s);
        Thread.sleep(10000);

        String parent = demo.getWindowHandle();
        Set<String> windows=demo.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(windows);
        demo.switchTo().window(tabs.get(0));
        demo.close();
        demo.switchTo().window(tabs.get(1));
        JavascriptExecutor js = (JavascriptExecutor)demo;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        demo.findElement(By.id("bookButton")).click();



    }

    public void pymtPage() {

        person1fn.sendKeys("manny");
        person1ln.sendKeys("dilu");
        person1phone.sendKeys("444223222");
        radiomale.click();
        WebElement month = person1dobmonth;
        Select sel = new Select(month);
        sel.selectByIndex(3);
        WebElement day = person1dobday;
        Select p1 = new Select (day);
        p1.selectByIndex(7);
        WebElement year = person1dobyr;
        Select y1 = new Select (year);
        y1.selectByIndex(40);

        person2fn.sendKeys("risa");
        person2ln.sendKeys("dilu");
        radiofemale.click();
        WebElement month1 = person2dobmonth;
        Select sel1 = new Select(month1);
        sel1.selectByIndex(7);
        WebElement day1 = person2dobday;
        Select p2 = new Select (day1);
        p2.selectByIndex(17);
        WebElement year1 = person2dobyr;
        Select y2 = new Select (year1);
        y2.selectByIndex(37);

        person3fn.sendKeys("toby");
        person3ln.sendKeys("dilu");
        radiochild.click();
        WebElement month2 = person3dobmonth;
        Select sel2 = new Select(month2);
        sel2.selectByIndex(5);
        WebElement day2 = person3dobday;
        Select p3 = new Select (day2);
        p3.selectByIndex(29);
        WebElement year2 = person3dobyr;
        Select y3 = new Select (year2);
        y3.selectByIndex(2);

    }
}

