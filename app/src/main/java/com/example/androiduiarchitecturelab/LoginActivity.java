package com.example.androiduiarchitecturelab;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class LoginActivity extends AppCompatActivity {
    private EditText edtUsername, edtPassword;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
// Bind XML views to Java objects
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
//                if (username.isEmpty() || password.isEmpty()) {
                if (username.equals("24175587") && password.equals("1234")) {
                    Toast.makeText(LoginActivity.this,
                            "Logging in: " + username, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this,
                            "Please enter credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}