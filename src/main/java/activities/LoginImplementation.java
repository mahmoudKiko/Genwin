package activities;

public class LoginImplementation {
    LoginScenario loginScenario;
    public LoginImplementation () {loginScenario = new LoginScenario();    }
    public void fillHappyScenario(){
        loginScenario.enterFillEmail("Peter.rimon1995@gmail.com");
        loginScenario.enterFillPassword("asd@123456");
        loginScenario.clickOnLoginButton();
    }

    public void TestEnd(){loginScenario.EndTestCase();}
}
