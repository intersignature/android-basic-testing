package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Date;

import cc.somkiat.basicunittesting.model.UserSetting;

public class MainActivity extends AppCompatActivity {
    private EditText userNameInput;
    private DatePicker dateOfBirthInput;
    private EditText emailInput;
    private Button saveButton;
    private Button revertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameInput = findViewById(R.id.userNameInput);
        dateOfBirthInput = findViewById(R.id.dateOfBirthInput);
        emailInput = findViewById(R.id.emailInput);
        saveButton = findViewById(R.id.saveButton);
        revertButton = findViewById(R.id.revertButton);
    }

    public void onSaveClick(View view) {
        //TODO
        //NameValidation nameValidation = new NameValidation();
        String name = userNameInput.getText().toString();
        Date date = new Date(dateOfBirthInput.getYear(), dateOfBirthInput.getMonth(), dateOfBirthInput.getDayOfMonth());
        String email = emailInput.getText().toString();
        UserSetting userSetting = new UserSetting(name, date, email);
    }

    public void onRevertClick(View view) {
        //TODO
    }
}
