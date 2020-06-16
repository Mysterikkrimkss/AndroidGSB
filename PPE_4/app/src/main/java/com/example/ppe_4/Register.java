package com.example.ppe_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    private Button button_valider;
    private EditText edit_login;
    private EditText edit_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edit_login = this.findViewById(R.id.editText8Email);

        edit_password = this.findViewById(R.id.editText9password);

        button_valider = this.findViewById(R.id.button5Valider);
        button_valider.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                edit_login.getText().toString();
                edit_password.getText().toString();
                Intent i = new Intent(Register.this, MainActivity.class);
                Register.this.startActivity(i);
            }
        });


    }


    public void registerUser(){
        final String email = edit_login.getText().toString().trim();
        final String pswd = edit_password.getText().toString().trim();
        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                C.Register_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject = new JSONObject(response);
                            Log.i("test ajout", response);
                            Toast.makeText(getApplicationContext(),jsonObject.getString("message"),Toast.LENGTH_LONG).show();
                        }catch (JSONException e){
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<>();
                params.put("email",email);
                params.put("password",pswd);
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
