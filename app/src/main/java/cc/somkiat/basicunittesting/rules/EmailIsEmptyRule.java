package cc.somkiat.basicunittesting.rules;

import cc.somkiat.basicunittesting.model.UserSetting;

/**
 * Created by atomiz on 15/11/2560.
 */

public class EmailIsEmptyRule extends Throwable implements SettingRules {

    public EmailIsEmptyRule() {
    }

    public EmailIsEmptyRule(String s) {
    }

    @Override
    public boolean validate(UserSetting userSetting) throws EmailIsEmptyRule {
        if (userSetting.getEmailInput().isEmpty()){
            throw new EmailIsEmptyRule("empty field is empty");
        }
        return true;
    }
}
