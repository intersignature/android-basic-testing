package cc.somkiat.basicunittesting.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.model.UserSetting;

/**
 * Created by atomiz on 15/11/2560.
 */

public class EmailPatternIsValidRule extends Throwable  implements SettingRules {

    public EmailPatternIsValidRule() {
    }

    public EmailPatternIsValidRule(String s) {

    }

    @Override
    public boolean validate(UserSetting userSetting) throws EmailPatternIsValidRule {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userSetting.getEmailInput());
        if (!matcher.matches() && userSetting.getEmailInput().length() > 0){
            throw new EmailPatternIsValidRule("Email is invalid");
        }
        return true;
    }
}
