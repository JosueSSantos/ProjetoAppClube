package com.example.appclube.dao;

import com.example.appclube.model.Atleta;

import java.util.ArrayList;
import java.util.List;

public class AtletaDao {
    private final static List<Atleta> atletas = new ArrayList<>();

    public void salvar(Atleta atleta) {
        atletas.add(atleta);
    }

    //Cópia da lista estatica
    public List<Atleta> todos(){
        return new ArrayList<>(atletas);
    }
}
