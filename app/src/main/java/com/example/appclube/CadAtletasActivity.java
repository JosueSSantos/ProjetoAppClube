package com.example.appclube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appclube.dao.AtletaDao;
import com.example.appclube.model.Atleta;

public class CadAtletasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_atletas);

        final AtletaDao dao =  new AtletaDao();

        final EditText campoNome = findViewById(R.id.ac_cadatletas_nome);
        final EditText campoTelefone = findViewById(R.id.ac_cadatletas_telefone);
        final EditText campoEmail = findViewById(R.id.ac_cadatletas_email);

        Button botaoSalvar = findViewById(R.id.ac_cadatletas_btnsalvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Atleta atleta = new Atleta(nome,telefone,email);

                Toast.makeText(CadAtletasActivity.this,"Nome: "+atleta.getNome()+" Telefone: "+atleta.getTelefone()+" E-mail: "+atleta.getEmail(),Toast.LENGTH_SHORT).show();

                dao.salvar(atleta);

                //startActivity(new Intent(CadAtletasActivity.this,ListaAtletasActivity.class));
                finish();
            }
        });
    }
}
