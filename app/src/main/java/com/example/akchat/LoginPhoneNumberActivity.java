package com.example.akchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.hbb20.CountryCodePicker;

public class LoginPhoneNumberActivity extends AppCompatActivity {
    CountryCodePicker countryCodePicker;
    EditText phoneInput;
    Button sendotpbtn;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);

        countryCodePicker = findViewById(R.id.login_countrycode);
        phoneInput  =findViewById(R.id.login_mobileno);
        sendotpbtn = findViewById(R.id.send_otp_btn);
        progressBar  = findViewById(R.id.login_progressbar);
        progressBar.setVisibility(View.GONE);

        countryCodePicker.registerCarrierNumberEditText(phoneInput);

        sendotpbtn.setOnClickListener((v)->{
            if(!countryCodePicker.isValidFullNumber()){
                phoneInput.setError("Enter Valid Phone Number");
                return;
            }
            Intent intent = new Intent(LoginPhoneNumberActivity.this , LoginOtpActivity.class);
            intent.putExtra("phone"  , countryCodePicker.getFullNumberWithPlus());
            startActivity(intent);

        });
    }
}