package com.example.ppe_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_Email;
    EditText editText_Password;
    Button button_Login;

    TextView textViewpasinscrit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_Email = (EditText)findViewById(R.id.editText_Email);
        editText_Password = (EditText)findViewById(R.id.editText_Password);
        button_Login = (Button)findViewById(R.id.button_Login);

        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText_Email.getText().toString();


                Intent intent = new Intent(getApplicationContext(), MenuResponsableActivity.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });


        textViewpasinscrit = (TextView) findViewById(R.id.textViewpasinscrit);
        textViewpasinscrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
    }
}
