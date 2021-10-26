import activities.Assertion;
import activities.RegisterImplementation;
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

}