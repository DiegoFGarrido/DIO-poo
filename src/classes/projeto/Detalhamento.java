package classes.projeto;
//package br.com.dio.desafio.dominio;

public abstract class Detalhamento {
    protected static final double XP_PADRAO = 10.0;
    private String titulo;
    private String descricao;

    public Detalhamento() {
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
