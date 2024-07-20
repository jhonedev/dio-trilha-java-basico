package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    //atributos -> Uma boa prática os atributos estarem private
    private String titulo;
    private String descricao;
    private LocalDate data;

    //construtor
    public Mentoria() {
        
    }

    //metodos
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }
    
}
