package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserSetting;

import static junit.framework.Assert.assertEquals;

/**
 * Created by atomiz on 15/11/2560.
 */

public class UserSettingTest {

    @Test
    public void userSettingTestGetter() throws Exception {
        String name = "atomiz";
        String email = "atomiz@abc.com";
        UserSetting userSetting = new UserSetting(name, email);
        assertEquals("atomiz", userSetting.getUserNameInput());
        assertEquals("atomiz@abc.com", userSetting.getEmailInput());
    }
    @Test
    public void userSettingTestSetter() throws Exception {
        String name = "atomiz";
        String email = "atomiz@abc.com";
        UserSetting userSetting = new UserSetting(name, email);
        userSetting.setUserNameInput("atomizNewInput");
        userSetting.setEmailInput("atomizNewInput@abcNew.com");
        assertEquals("atomizNewInput", userSetting.getUserNameInput());
        assertEquals("atomizNewInput@abcNew.com", userSetting.getEmailInput());
    }
    @Test
    public void userSettingTestGetterAndSetter() throws Exception {
        String name = "atomiz";
        String email = "atomiz@abc.com";
        UserSetting userSetting = new UserSetting(name, email);
        assertEquals("atomiz", userSetting.getUserNameInput());
        assertEquals("atomiz@abc.com", userSetting.getEmailInput());

        String name1 = "atomizNewInput";
        String email1 = "atomizNewInput@abcNew.com";
        userSetting.setUserNameInput(name1);
        userSetting.setEmailInput(email1);
        assertEquals("atomizNewInput", userSetting.getUserNameInput());
        assertEquals("atomizNewInput@abcNew.com", userSetting.getEmailInput());
    }

}
