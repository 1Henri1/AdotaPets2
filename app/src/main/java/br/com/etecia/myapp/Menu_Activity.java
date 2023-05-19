package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class Menu_Activity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView idmenu1, idmenu2, idmenu3, idmenu4, idmenu5, idmenu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idmenu1 = findViewById(R.id.idmenu1);
        idmenu2 = findViewById(R.id.idmenu2);
        idmenu3 = findViewById(R.id.idmenu3);
        idmenu4 = findViewById(R.id.idmenu4);
        idmenu5 = findViewById(R.id.idmenu5);
        idmenu6 = findViewById(R.id.idmenu6);



        idmenu1.setOnClickListener(this);
        idmenu2.setOnClickListener(this);
        idmenu3.setOnClickListener(this);
        idmenu4.setOnClickListener(this);
        idmenu5.setOnClickListener(this);
        idmenu6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.idmenu1:
                startActivity(new Intent(getApplicationContext(), Pets_Activity.class));
                finish();
                break;
            case R.id.idmenu2:
                startActivity(new Intent(getApplicationContext(), Alimentos_Activity.class));
                finish();
                break;
            case R.id.idmenu3:
                startActivity(new Intent(getApplicationContext(), Servicos_Activity.class));
                finish();
                break;
            case R.id.idmenu4:
                startActivity(new Intent(getApplicationContext(), Doacao_Activity.class));
                finish();
                break;
            case R.id.idmenu5:
                startActivity(new Intent(getApplicationContext(), Localizar_Activity.class));
                finish();
                break;
            case R.id.idmenu6:
                startActivity(new Intent(getApplicationContext(), Parceiros_Activity.class));
                finish();
                break;
        }


    }
}