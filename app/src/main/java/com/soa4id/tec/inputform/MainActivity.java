package com.soa4id.tec.inputform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mFullNameInput;
    private EditText mEmailInput;
    private EditText mPhoneInput;
    private EditText mAgeInput;
    private Button mSummitButton;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFullNameInput = findViewById(R.id.main_activity_input_full_name);
        mEmailInput = findViewById(R.id.main_activity_input_email);
        mPhoneInput = findViewById(R.id.main_activity_phone);
        mAgeInput = findViewById(R.id.main_activity_age);
        mSummitButton = findViewById(R.id.main_activity_summit);

        mSummitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mUser = new User(
                        mFullNameInput.getText().toString(),
                        mEmailInput.getText().toString(),
                        mAgeInput.getText().toString(),
                        mPhoneInput.getText().toString());
            }
        });
    }
}
