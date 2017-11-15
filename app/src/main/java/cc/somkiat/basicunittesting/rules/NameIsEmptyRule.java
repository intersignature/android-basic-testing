package cc.somkiat.basicunittesting.rules;

import cc.somkiat.basicunittesting.model.UserSetting;

/**
 * Created by atomiz on 15/11/2560.
 */

public class NameIsEmptyRule extends Throwable implements SettingRules {

    public NameIsEmptyRule() {
    }

    public NameIsEmptyRule(String s) {

    }

    @Override
    public boolean validate(UserSetting userSetting) throws NameIsEmptyRule {
        if (userSetting.getUserNameInput().isEmpty()){
            throw new NameIsEmptyRule("Name is empty");
        }
        return true;
    }
}
