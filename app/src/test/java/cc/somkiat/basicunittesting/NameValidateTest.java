package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserSetting;
import cc.somkiat.basicunittesting.rules.NameIsEmptyRule;
import cc.somkiat.basicunittesting.rules.NameLenghtRules;
import cc.somkiat.basicunittesting.validation.NameValidation;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by atomiz on 15/11/2560.
 */

public class NameValidateTest {

    @Test
    public void nameValid() throws NameLenghtRules, NameIsEmptyRule {
        String name = "Atomiz";
        UserSetting userSetting = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userSetting);
        assertTrue("true", nameValidation.validate());
    }

    @Test(expected = NameIsEmptyRule.class)
    public void nameInvalidCauseEmptyRule()throws NameLenghtRules, NameIsEmptyRule {
        String name = "";
        UserSetting userSetting = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userSetting);
        nameValidation.nameEmpty();
    }

    @Test(expected = NameLenghtRules.class)
    public void nameInvalidCauseLenghtRuleLessThanTwoChars()throws NameLenghtRules, NameIsEmptyRule {
        String name = "a";
        UserSetting userSetting = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userSetting);
        nameValidation.validate();
    }

    @Test(expected = NameLenghtRules.class)
    public void nameInvalidCauseLenghtRuleMoreThanTwentyChars()throws NameLenghtRules, NameIsEmptyRule {
        String name = "asdhgasdyashdgavsdbnvasdvywqvgzsvdghasvdbvnasdghadvsnabsdvanbsdvabnsdabnsdvasdbvasdb";
        UserSetting userSetting = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userSetting);
        nameValidation.validate();
    }

    @Test
    public void nameIsNotEmpty() throws NameIsEmptyRule {
        String name = "Atomiz";
        UserSetting userInfo = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("Name is not empty", nameValidation.nameEmpty());
    }

    @Test
    public void nameLenghtIsBetweenTwoAndTwenty() throws NameLenghtRules {
        String name = "Atomiz";
        UserSetting userInfo = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("Name is between two and twenty", nameValidation.nameLenght());
    }

    @Test(expected = NameLenghtRules.class)
    public void nameLenghtIsLessThanTwo() throws NameLenghtRules {
        String name = "A";
        UserSetting userInfo = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userInfo);
        assertFalse("Name is less than two", nameValidation.nameLenght());
    }

    @Test(expected = NameLenghtRules.class)
    public void nameLenghtIsMoreThanTwenty() throws NameLenghtRules {
        String name = "Asdfsdfsdfsdkfsdfkjhsdhfjsdfjsdfkjdshfkjsdfkdjshfkjsdfdkjsfhsdkjfhsdkjfhsdkfjsdf";
        UserSetting userInfo = new UserSetting(name, "");
        NameValidation nameValidation = new NameValidation(userInfo);
        assertFalse("Name is less than two", nameValidation.nameLenght());
    }


}
