package activities;

import base.SeleniumBaseTest;
import mailCheck.MailScenario;

public class RegisterMails extends MailScenario {

    public RegisterMails() {
        super(SeleniumBaseTest.user.getEmailId(), mailDriver);
    }

    public RegisterMails(String emailId){
        super(emailId,driver);
    }
}
