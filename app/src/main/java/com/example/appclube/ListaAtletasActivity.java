package com.example.appclube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.appclube.dao.AtletaDao;
import com.example.appclube.model.Atleta;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAtletasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FloatingActionButton btnNovoAtleta = findViewById(R.id.activity_main_fab_novo_atleta);
        btnNovoAtleta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(ListaAtletasActivity.this,
                        CadAtletasActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<String> atletas = new ArrayList<>(Arrays.asList("Rodrigo","Breno","Henzo","Gabriel","Daniel"));

        ListView listaAtletas = findViewById(R.id.activity_main_lista_atletas);

        AtletaDao dao = new AtletaDao();

        //Fazer o vinculo dos dados com base em uma view
        listaAtletas.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                dao.todos()));
    }
}
