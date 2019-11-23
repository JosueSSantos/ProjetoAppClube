package com.example.appclube.model;

import androidx.annotation.NonNull;

public class Atleta {
    private String nome;
    private String telefone;
    private String email;

    public Atleta(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }

    @NonNull
    @Override
    public String toString() {
        return this.getNome();
    }
}
