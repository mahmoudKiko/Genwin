package activities;

import constants.UserData;

public class RegisterImplementation extends UserData {

    RegisterScenario registerScenario;
    Assertion assertion;

    public RegisterImplementation () {
        registerScenario = new RegisterScenario();
        assertion = new Assertion();
    }

    public void fillHappyScenario(){
        registerScenario.enterFillUserName(getFirstName()+"123 kiko");//
        registerScenario.enterFillEmail(getEmail());//mahmoud@gmail.com


        registerScenario.enterFillPassword("123456");
        registerScenario.clickOnCreateAccount();

        assertion.assertNameField();
        assertion.assertEamilField();

    }


    }