package activities;

public class RegisterImplementation {

    RegisterScenario registerScenario;

    public RegisterImplementation () {
        registerScenario = new RegisterScenario();
    }

    public void fillHappyScenario(){
        registerScenario.enterFillUserName("Mahmoud");
        registerScenario.enterFillEmail("mahmoud@gmail.com");
        registerScenario.enterFillPassword("123456");
        registerScenario.clickOnCreateAccount();
    }

}