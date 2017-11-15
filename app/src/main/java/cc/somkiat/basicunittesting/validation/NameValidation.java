package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.model.UserSetting;
import cc.somkiat.basicunittesting.rules.NameIsEmptyRule;
import cc.somkiat.basicunittesting.rules.NameLenghtRules;

/**
 * Created by atomiz on 15/11/2560.
 */

public class NameValidation {
    UserSetting userSetting;

    public NameValidation(UserSetting userSetting) {
        this.userSetting = userSetting;
    }

    public boolean nameLenght() throws NameLenghtRules {
        NameLenghtRules nameLenghtRules = new NameLenghtRules();
        return nameLenghtRules.validate(userSetting);
    }

    public boolean nameEmpty() throws NameIsEmptyRule {
        NameIsEmptyRule nameIsEmptyRule = new NameIsEmptyRule();
        return nameIsEmptyRule.validate(userSetting);
    }

    public boolean validate() throws NameLenghtRules, NameIsEmptyRule {
        nameLenght();
        nameEmpty();
        return true;
    }
}
