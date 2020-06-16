package com.example.ppe_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuVisiteurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_visiteur);

        final Button btListe_Mission = (Button) findViewById(R.id.btListe_Mission);
        btListe_Mission.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                       /* toast = Toast.makeText(getApplicationContext(),"policier", Toast.LENGTH_SHORT);
                       toast.show();*/
                    Intent intent = new Intent(MenuVisiteurActivity.this, ListMissionVisiteur.class);
                    startActivity(intent);


            }

        });

        final Button btAjoute_frais = (Button) findViewById(R.id.btAjoute_frais);
        btAjoute_frais.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                       /* toast = Toast.makeText(getApplicationContext(),"policier", Toast.LENGTH_SHORT);
                       toast.show();*/
                Intent intent = new Intent(MenuVisiteurActivity.this, LigneFrais.class);
                startActivity(intent);


            }

        });

        final Button btListe_frais = (Button) findViewById(R.id.btListe_frais);
        btListe_frais.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                       /* toast = Toast.makeText(getApplicationContext(),"policier", Toast.LENGTH_SHORT);
                       toast.show();*/
                Intent intent = new Intent(MenuVisiteurActivity.this, ListFraisVisiteur.class);
                startActivity(intent);


            }

        });

        final Button btDeco = (Button) findViewById(R.id.btDeco);
        btDeco.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0){

                Toast toast = Toast.makeText(getApplicationContext(), "Déconnecté", Toast.LENGTH_SHORT);
                       toast.show();
                Intent intent = new Intent(MenuVisiteurActivity.this, MainActivity.class);
                startActivity(intent);


            }

        });

    }
}
