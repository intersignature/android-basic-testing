package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserSetting;
import cc.somkiat.basicunittesting.rules.EmailIsEmptyRule;
import cc.somkiat.basicunittesting.rules.EmailPatternIsValidRule;
import cc.somkiat.basicunittesting.validation.EmailValidation;

import static org.junit.Assert.assertTrue;

/**
 * Created by atomiz on 15/11/2560.
 */

public class EmailValidateTest {

    @Test
    public void emailValid() throws EmailIsEmptyRule, EmailPatternIsValidRule {
        String email = "Atomiz@dfs.com";
        UserSetting userSetting = new UserSetting("",email);
        EmailValidation emailValidation = new EmailValidation(userSetting);
        assertTrue("true", emailValidation.validation());
    }

    @Test(expected = EmailIsEmptyRule.class)
    public void emailInvalidCauseEmptyRule()throws EmailPatternIsValidRule, EmailIsEmptyRule {
        String email = "";
        UserSetting userSetting = new UserSetting("", email);
        EmailValidation emailValidation = new EmailValidation(userSetting);
        emailValidation.emailEmpty();
    }

    @Test(expected = EmailPatternIsValidRule.class)
    public void emailInvalidCausePatternRule()throws EmailPatternIsValidRule, EmailIsEmptyRule {
        String email = "fdgdfgdfg";
        UserSetting userSetting = new UserSetting("", email);
        EmailValidation emailValidation = new EmailValidation(userSetting);
        emailValidation.emailPattern();
    }

    @Test
    public void emailIsNotEmpty() throws EmailPatternIsValidRule, EmailIsEmptyRule {
        String email = "acsscscscscscsc";
        UserSetting userInfo = new UserSetting("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.emailEmpty();
    }

    @Test(expected = EmailIsEmptyRule.class)
    public void emailIsEmpty() throws EmailPatternIsValidRule, EmailIsEmptyRule {
        String email = "";
        UserSetting userInfo = new UserSetting("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.emailEmpty();
    }

    @Test(expected = EmailPatternIsValidRule.class)
    public void emailIsInvalidPattern() throws EmailPatternIsValidRule, EmailIsEmptyRule {
        String email = "acsscsc.scsc@scsc";
        UserSetting userInfo = new UserSetting("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.emailPattern();
    }
}
