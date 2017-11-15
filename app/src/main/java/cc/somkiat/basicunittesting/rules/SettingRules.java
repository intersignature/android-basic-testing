package cc.somkiat.basicunittesting.rules;

import cc.somkiat.basicunittesting.model.UserSetting;

/**
 * Created by atomiz on 15/11/2560.
 */

public interface SettingRules {
    boolean validate(UserSetting userSetting) throws NameLenghtRules, NameIsEmptyRule, EmailIsEmptyRule, EmailPatternIsValidRule;
}
