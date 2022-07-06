package Test;

import Model.MailModel;
import Operation.Constants;
import Operation.Driver;
import cucumber.api.Scenario;
import cucumber.api.TestStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class SendMailFromGmailTest {
    public AppiumDriver driver;
    public MailModel mailModel;
    public WebDriverWait wait;

    @BeforeMethod
    @Given("Get {string} {string} capabilities from resource and lunch app")
    public void launchDriver(String device, String emulator) throws Exception {
        ScreenRecorderUtil.startRecord("CheckingEmulator");
        driver = Driver.setDriver(Constants.operatingSystem, device, emulator);
        wait = new WebDriverWait(driver, 25);
        mailModel = new MailModel(driver, wait);
    }

    @Test()
    @And("Send Mail from sender to receiver specific subject with content")
    public void sendMailToReceiver() {
        mailModel.sendMail(Constants.receiverMail, Constants.senderMail, Constants.receiverMailSubject, Constants.receiverMailContent, Constants.receiverAppPassword);
    }

    @Test()
    @And("Send Mail from receiver to sender subject with content")
    public void sendMailToSender() {
        mailModel.sendMail(Constants.senderMail, Constants.receiverMail, Constants.senderMailSubject, Constants.senderMailContent, Constants.senderAppPassword);
    }

    @Test()
    @And("Close app")
    public void closeApp() throws Exception {
        driver.terminateApp("com.google.android.gm");
        ScreenRecorderUtil.stopRecord();
    }

    @Test()
    @And("Click options")
    public void clickOptions() throws IOException {
        mailModel.clickOptions();
    }

    @Test()
    @And("Click send")
    public void clickSend() {
        mailModel.clickSend();
    }

    @Test()
    @And("Click last received mail")
    public void clickLastReceivedMail() {
        mailModel.clickLastReceivedMail();
    }

    @Test()
    @And("Verify element come from sender user")
    public void verifyMailFromSender() {
        mailModel.verifyMailFromSender();
    }

    @Test()
    @And("Verify element come from receiver user")
    public void verifyMailFromReceiver() {
        mailModel.verifyMailFromReceiver();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult testStep) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) driver;
        File source = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Snapshot/" + testStep.getName() + ".png"));
    }
}