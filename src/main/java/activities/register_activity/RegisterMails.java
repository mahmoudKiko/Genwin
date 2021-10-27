package activities.register_activity;

import base.SeleniumBaseTest;
import mail_check.MailScenario;

public class RegisterMails extends MailScenario {

    public RegisterMails() {
        super(SeleniumBaseTest.user.getEmailId(), mailDriver);
    }

    public RegisterMails(String emailId){
        super(emailId,driver);
    }
}
