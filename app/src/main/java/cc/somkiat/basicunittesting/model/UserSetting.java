package cc.somkiat.basicunittesting.model;

import java.util.Date;

/**
 * Created by atomiz on 15/11/2560.
 */

public class UserSetting {
    private String userNameInput;
    private Date dateOfBirthInput;
    private String emailInput;

    public UserSetting(String userNameInput, Date dateOfBirthInput, String emailInput) {
        this.userNameInput = userNameInput;
        this.dateOfBirthInput = dateOfBirthInput;
        this.emailInput = emailInput;
    }

    public UserSetting(String name, String email) {
        this.userNameInput = name;
        this.emailInput = email;
    }

//    public UserSetting(String email) {
//        this.emailInput = email;
//    }


    public String getUserNameInput() {
        return userNameInput;
    }

    public void setUserNameInput(String userNameInput) {
        this.userNameInput = userNameInput;
    }

    public Date getDateOfBirthInput() {
        return dateOfBirthInput;
    }

    public void setDateOfBirthInput(Date dateOfBirthInput) {
        this.dateOfBirthInput = dateOfBirthInput;
    }

    public String getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String emailInput) {
        this.emailInput = emailInput;
    }
}
