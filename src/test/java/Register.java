import activities.RegisterImplementation;
import activities.RegisterMails;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register {

    RegisterImplementation registerImplementation;
    RegisterMails registerMails;

    @BeforeClass
    public void beforeRunning() {
        registerImplementation = new RegisterImplementation();
    }

    @Test
    public void phase1Happyscenario(){
       registerImplementation.fillHappyScenario();
        registerMails = new RegisterMails(registerImplementation.getEmailId());
    }
/*
    @AfterTest
    public void afterTest() throws InterruptedException {
        SeleniumBaseTest.driver.quit();
    }*/
}