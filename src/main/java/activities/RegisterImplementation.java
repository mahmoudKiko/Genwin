package activities;

public class RegisterImplementation {

    RegisterScenario registerScenario;
    Assertion assertion;
    public RegisterImplementation () {
        registerScenario = new RegisterScenario();
        assertion = new Assertion();
    }

    public void fillHappyScenario(){
        registerScenario.enterFillUserName("Mahmoud 123");
        registerScenario.enterFillEmail("");//mahmoud@gmail.com
        registerScenario.enterFillPassword("123456");
        registerScenario.clickOnCreateAccount();

        assertion.assertNameField();
        assertion.assertEamilField();

    }
}