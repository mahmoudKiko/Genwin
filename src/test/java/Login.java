import activities.LoginImplementation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
    LoginImplementation loginImplementation;

    @BeforeClass
    public void beforeRunning() {
        loginImplementation = new LoginImplementation();
    }

    @Test
    public void phase1Happyscenario() {
        loginImplementation.fillHappyScenario();
    }
    @AfterTest
    public void CloseBrowser() {
    loginImplementation.TestEnd();
    }
}
