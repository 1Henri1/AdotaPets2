package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login_Activity extends AppCompatActivity {
    // DECLARANDO AS VARIAVEIS
    Button btnentrar, btnsair;
    TextInputEditText txtusu, txtsenha;
    TextView lblcadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnentrar = findViewById(R.id.btnentrar);
        btnsair = findViewById(R.id.btnsair);
        txtusu = findViewById(R.id.txtusu);
        txtsenha = findViewById(R.id.txtsenha);
        lblcadastrar = findViewById(R.id.lblcadastrar);


        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = txtusu.getText().toString();
                senha = txtsenha.getText().toString();
                if (usuario.equals("etecia") && senha.equals("etecia")) {
                    startActivity(new Intent(getApplicationContext(), Menu_Activity.class));
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "usuario ou senha invalidos", Toast.LENGTH_SHORT).show();
                }

            }
        });

        lblcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), CadUsu_Activity.class));
                finish();
            }
        });
    }
}