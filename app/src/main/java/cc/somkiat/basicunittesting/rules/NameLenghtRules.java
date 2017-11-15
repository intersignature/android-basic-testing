package cc.somkiat.basicunittesting.rules;

import cc.somkiat.basicunittesting.model.UserSetting;

/**
 * Created by atomiz on 15/11/2560.
 */

public class NameLenghtRules extends Throwable implements SettingRules {

    public NameLenghtRules() {
    }

    public NameLenghtRules(String s) {

    }

    @Override
    public boolean validate(UserSetting userSetting) throws NameLenghtRules {
        if (userSetting.getUserNameInput().equals(null) || !(userSetting.getUserNameInput().length()>=2) ||
                !(userSetting.getUserNameInput().length()<=20)){
            throw new NameLenghtRules("Name lenght is not less than 2 or more than 20 charaters");
        }
        return true;
    }
}
