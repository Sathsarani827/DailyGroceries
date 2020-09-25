package com.example.dailygroceries;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rey.material.widget.CheckBox;

public class Login extends AppCompatActivity {
    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton,joinNowButton;
    private ProgressDialog loadingBar;
    private TextView AdminLink, NotAdminLink;

    private String parentDbName = "Users";
    private CheckBox chkBoxRememberMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        joinNowButton = (Button)findViewById(R.id.main_join_now_btn);
        LoginButton = (Button)findViewById(R.id.main_login_btn);

        /*LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });*/
    }
}
