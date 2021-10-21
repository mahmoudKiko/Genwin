import activities.RegisterImplementation;
import base.SeleniumBaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register {

    RegisterImplementation registerImplementation;

    @BeforeClass
    public void beforeRunning() {
        registerImplementation = new RegisterImplementation();
    }

    @Test
    public void phase1Happyscenario(){
       registerImplementation.fillHappyScenario();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        SeleniumBaseTest.driver.quit();
    }
}