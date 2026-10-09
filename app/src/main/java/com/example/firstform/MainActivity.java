package com.example.firstform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText fullname = findViewById(R.id.fullname);
        EditText country = findViewById(R.id.country);
        EditText email = findViewById(R.id.email);
        EditText phone = findViewById(R.id.phone);
        EditText password = findViewById(R.id.password);

        RadioButton maleButton = findViewById(R.id.maleButton);
        RadioButton femaleButton = findViewById(R.id.femaleButton);

        CheckBox agreeCheckBox = findViewById(R.id.agreeCheckBox);

        Button createAccountButton = findViewById(R.id.createAccountButton);
        createAccountButton.setOnClickListener(v -> {
            String uname = username.getText().toString();
            String fname = fullname.getText().toString();
            String ctry = country.getText().toString();
            String eml = email.getText().toString();
            String phn = phone.getText().toString();
            String pwd = password.getText().toString();

            String gender = maleButton.isChecked() ? getString(R.string.gender_male)
                    : (femaleButton.isChecked() ? getString(R.string.gender_female) : "");

            String agrmnt = agreeCheckBox.isChecked() ? getString(R.string.yes) : getString(R.string.no);

            String message = getString(R.string.dialog_message, uname, fname, ctry, eml, phn, pwd, gender, agrmnt);

            new AlertDialog.Builder(this)
                    .setTitle(R.string.dialog_title)
                    .setMessage(message)
                    .setPositiveButton(android.R.string.ok, null)
                    .show();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}