import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Dr-Br on 24.2.2017 г..
 */
public class TestExerciseSelenium {
    private WebDriver driver;
    //before - clean the database before the next test
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        //code executed before each test
    }
    //test methods
    @Test
    // convention for public void naming: whatToTest_whatConditions_expectedResult
    //e.g. testLogin_validCredentials_expectedNavigationToProfile
    public void testLogin_validCredentials_expectedNavigationToProfile(){
        //test this
        this.driver.get("https://softuni.bg");
        WebElement loginLink = this.driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/nav/div[2]/ul/li[2]/span/a"));
        loginLink.click();

        WebElement userNameField = this.driver.findElement(By.cssSelector("html.js.flexbox.flexboxlegacy.canvas.canvastext.webgl.no-touch.geolocation.postmessage.no-websqldatabase.indexeddb.hashchange.history.draganddrop.websockets.rgba.hsla.multiplebgs.backgroundsize.borderimage.borderradius.boxshadow.textshadow.opacity.cssanimations.csscolumns.cssgradients.no-cssreflections.csstransforms.csstransforms3d.csstransitions.fontface.generatedcontent.video.audio.localstorage.sessionstorage.webworkers.applicationcache.svg.inlinesvg.smil.svgclippaths.k-ff.k-ff51.gr__platform_softuni_bg body div.main-container.body-content div.content div.landing-page-container div.col-md-6.login-container.dark-container div.login-form-container form.login-form div.top-buffer-lg.form-group div.inner-addon.left-addon input.input-lg.no-border.user-success"));
        userNameField.sendKeys("testtest");
        WebElement passwordField = this.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div[1]/form/div[2]/div/input"));
        passwordField.sendKeys("testtest");
        WebElement loginButton = this.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div[1]/form/input[2]"));
        loginButton.click();
        }
    @Test
    public void testRegister_uniqueUserName_expectedSuccessfulLogin(){

        }
    //after
    @After
    public void tearDown(){
        // what to happen after each test
        this.driver.quit();
    }
}
