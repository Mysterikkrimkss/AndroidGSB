package com.example.ppe_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuResponsableActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_responsable);
//------------------
        textView = (TextView)findViewById(R.id.textView11);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView.setText(str);

        //-------------------


        final Button btDeco = (Button) findViewById(R.id.btDeco);
        btDeco.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                Toast toast = Toast.makeText(getApplicationContext(), "Déconnecté", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MenuResponsableActivity.this, MainActivity.class);
                startActivity(intent);


            }

        });

        final Button btAjoute_mission = (Button) findViewById(R.id.btAjoute_mission);
        btAjoute_mission.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                       /* toast = Toast.makeText(getApplicationContext(),"policier", Toast.LENGTH_SHORT);
                       toast.show();*/
                Intent intent = new Intent(MenuResponsableActivity.this, AjouteMissionResponsable.class);
                startActivity(intent);


            }

        });

        final Button btSuppr_user = (Button) findViewById(R.id.btSuppr_user);
        btSuppr_user.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                       /* toast = Toast.makeText(getApplicationContext(),"policier", Toast.LENGTH_SHORT);
                       toast.show();*/
                Intent intent = new Intent(MenuResponsableActivity.this, SupprUser.class);
                startActivity(intent);


            }

        });

        final Button btListe_des_visiteurs = (Button) findViewById(R.id.btListe_des_visiteurs);
        btListe_des_visiteurs.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                       /* toast = Toast.makeText(getApplicationContext(),"policier", Toast.LENGTH_SHORT);
                       toast.show();*/
                Intent intent = new Intent(MenuResponsableActivity.this, ListVisiteur.class);
                startActivity(intent);


            }

        });
    }
}
