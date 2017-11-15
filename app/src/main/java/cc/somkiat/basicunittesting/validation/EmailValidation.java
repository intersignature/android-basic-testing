package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.model.UserSetting;
import cc.somkiat.basicunittesting.rules.EmailIsEmptyRule;
import cc.somkiat.basicunittesting.rules.EmailPatternIsValidRule;

/**
 * Created by atomiz on 15/11/2560.
 */

public class EmailValidation {
    UserSetting userSetting;

    public EmailValidation(UserSetting userSetting) {
        this.userSetting = userSetting;
    }

    public boolean emailEmpty()throws EmailIsEmptyRule {
        EmailIsEmptyRule emailIsEmptyRule = new EmailIsEmptyRule();
        return emailIsEmptyRule.validate(userSetting);
    }

    public boolean emailPattern() throws EmailPatternIsValidRule {
        EmailPatternIsValidRule emailPatternIsValidRule = new EmailPatternIsValidRule();
        return emailPatternIsValidRule.validate(userSetting);
    }

    public boolean validation() throws EmailPatternIsValidRule, EmailIsEmptyRule {
        emailEmpty();
        emailPattern();
        return true;
    }
}
