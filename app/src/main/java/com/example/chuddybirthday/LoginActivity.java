package com.example.chuddybirthday;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    Button newAcc;
    EditText email;
    Button submit;
    private ProgressDialog loadingBar;


    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        submit = findViewById(R.id.LoginBtn);
        email = findViewById(R.id.LemailTxt);
        loadingBar = new ProgressDialog(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Lusnm;
                Lusnm = email.getText().toString();
                Login(Lusnm);
            }
        });
    }

    public void Login(String Lusnm) {
        loadingBar.setMessage("Please wait, while we load your application.");
        loadingBar.show();
        loadingBar.setCanceledOnTouchOutside(false);
        if (TextUtils.isEmpty(Lusnm)) {
            Toast.makeText(getApplicationContext(), "Please enter the code word.", Toast.LENGTH_LONG).show();
            loadingBar.dismiss();
            return;
        }
        if (Lusnm.equals("Bestie")) {
            loadingBar.dismiss();
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Please Verify credentials.....", Toast.LENGTH_LONG).show();
            loadingBar.dismiss();
        }
    }

}




