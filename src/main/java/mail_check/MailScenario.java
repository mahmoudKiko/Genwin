package mail_check;

import base.SeleniumBaseTest;
import org.openqa.selenium.WebDriver;

public class MailScenario extends SeleniumBaseTest {


    public MailScenario(String mail){
        driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?to="+mail);
    }

    public MailScenario(String mail, WebDriver driver){
        driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?to="+mail);
    }


}
